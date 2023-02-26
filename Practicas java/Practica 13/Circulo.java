/**
 * Modela un círculo en el plano cartesiano.
 * @author Miguel Mendoza.
 */
public class Circulo extends Figura implements FiguraI {
	
	private  double radio;
	private Punto centro;

	/**
	 * Crea un círculo con centro en (0,0) y radio 3.
	 */
	public Circulo(){
	
	    centro = new Punto(0,0);
	    radio = 3;
	}

	/**
	 * Construye un círculo con un centro y un radio dado.
	 * @param centro El centro del círculo.
	 * @param radio El radio del círculo.
	 * @throws ValorInvalidoExcepcion si el radio es negativo.
	 */
	public Circulo(Punto centro, double radio) throws ValorInvalidoExcepcion {
	
	    this.centro=centro;
	    if (radio < 0){
		
			throw new ValorInvalidoExcepcion("Radio invalido");

		}else {

			this.radio=radio;
		}       
	}

	/**
	 * Constructor copia, construye un circulo a partir de otro.
	 * @param c El Circulo a copiar.
	 */
	public Circulo(Circulo c){
	    
	    this.centro=c.centro;
	    this.radio=c.radio;
	   
	}


    public double  getPerimetro(){
		
		return 2*PI*radio;
	
    }
	     

	/**
	 * Obtiene el área del triángulo. Fórmula de Herón.
	 * @return El área del triángulo.
	 */
	public double getArea(){
	    
	    return PI*radio*radio; 
	}


	/**
	 * Mueve el círculo en el plano.
	 * @param deltaX El desplazamiento en el eje X.
	 * @param deltaY El desplazamiento en el eje Y.
	 * @throws DesplazamientoInvalido si los deltas son cero.
	 */


	@Override
	public void mover(double deltaX, double deltaY) throws DesplazamientoInvalido{
	
	    if (deltaX==0 && deltaY==0)
		
			throw new DesplazamientoInvalido (" No se puede tener que ambas deltas sea igual a 0");
	    	centro.desplazar (deltaX,deltaY);
	}

	/**
	 * En esta práctica, no tiene sentido rotar un círculo,
	 * por lo que no hace nada y se lanza una excepción.
	 * @throws UnsupportedOperationException Ya que no tiene sentido rotarlo.
	 */
	
	@Override	
	public void rotar90() throws UnsupportedOperationException{
	
		throw new UnsupportedOperationException("No tiene sentido rotar 90° el círculo.");
	}

	/**
	 * En esta práctica, no tiene sentido rotar un círculo,
	 * por lo que no hace nada y se lanza una excepción.
	 * @throws UnsupportedOperationException Ya que no tiene sentido rotarlo.
	 */
	
	@Override
	public void rotar180()throws UnsupportedOperationException{
		
		throw new UnsupportedOperationException("No tiene sentido rotar 180° el círculo.");
	}

	/**
	 * Regresa el Punto con el centro.
	 * @return centro El centro del círculo.
	 */
	public Punto getCentro(){
	    
	    return centro;
	}

	/**
	 * Regresa el radio,
	 * @return radio el radio del círculo.
	 */
	public double getRadio(){
	    
	    return radio;
	}


	public boolean equals(Circulo c){
	    
	    return centro.equals(c.centro) && this.radio==c.radio;
	}


	/**
	 * Nos dice si este triángulo es igual a otro.
	 * @param f La FiguraI a comparar.
	 * @return true si son iguales.
	 */
	public boolean equals(FiguraI f){

		return false;
	}



	/**
	 * Regresa los datos del triángulo.
	 */
	@Override
	public String toString(){
	    String dat = "";
	    dat += "Info. Del Circulo:\n";
	    dat += "Area" + getArea()+ "\n" + "Perimetro" + getPerimetro() + "\n" + "Centro en: " + centro;
	    return dat;
	}

}
