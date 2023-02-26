/**
 * Clase para crear cuadrados en un plano cartesiano.
 * @author Miguel Mendoza.
 */
public class Cuadrado extends Figura implements FiguraI {

    private int largo; 
	
	/**
	 * Constructor por omisión.
	 * Construye un triángulo en los puntos (-3,3),(3,3),(-3,-3),(3,-3).
	 */
	public Cuadrado(){

		super.lineas = new Linea[4]; 
              largo = 6;
	
		Punto p1 = new Punto (-3,3);
		Punto p2 = new Punto (3,3);
		Punto p3 = new Punto (3,-3);
		Punto p4 = new Punto (-3,-3);
		
		Linea l1 = new Linea (p1, p2);
		Linea l2 = new Linea (p2, p3);
		Linea l3 = new Linea (p3, p4);
		Linea l4 = new Linea (p4, p1);

		lineas[0] = l1;
		lineas[1] = l2;
		lineas[2] = l3;
		lineas[3] = l4;

	       
	}
	
	/**
	 * Construye un Cuadrado con el centro en el Punto dado y del largo indicado.
	 * @param centro El centro del Cuadrado.
	 * @param largo El largo del Cuadrado.
	 * @throws ValorInvalidoExcepcion si el largo dado es negativo.
	 */
	public Cuadrado(Punto centro, int largo) throws ValorInvalidoExcepcion {
		if (largo<0){
			
			 throw new ValorInvalidoExcepcion("No se puede un Valor Negativo");
	     }
	
	     double x = centro.obtenerX();
	     double y = centro.obtenerY();

	     Punto p1 = new Punto (x + largo/2.0, y + largo/2.0);
	     Punto p2 = new Punto (x - largo/2.0, y + largo/2.0);
	     Punto p3 = new Punto (x - largo/2.0, y - largo/2.0);
	     Punto p4 = new Punto (x + largo/2.0, y - largo/2.0);

	     lineas = new Linea [4];
	     lineas[0] = new Linea (p1, p2);
	     lineas[1] = new Linea (p2, p3);
	     lineas[2] = new Linea (p3, p4);
	     lineas[3] = new Linea (p4, p1);

	     this.largo = largo;
		 	
	}

	/**
	 * Constructor copia, construye un cuadrado a partir de otro.
	 * @param c El Cuadrado a copiar.
	 */
	public Cuadrado(Cuadrado c){
	
		this.lineas = c.lineas;
	}

	/**
	 * Obtiene el perímetro del cuandrado.
	 * @return El perímetro.
	 */
	@Override
	public double getPerimetro(){

	    return 4*largo;
	}

	//aquí va Método getArea()
    public double getArea(){

    	return largo*largo;
    }

	//Aqúí va Método rotar90()
    public void rotar90() throws UnsupportedOperationException{
	
	throw new UnsupportedOperationException("Es inutil rotar 90° la figura.");
	}


	@Override
	public void rotar180() throws UnsupportedOperationException{
		
		throw new UnsupportedOperationException("Es inutil rotar 180° la figura");
	}

	/**
	 * Mueve el cuadrado en el plano.
	 * @param deltaX El desplazamiento en el eje X.
	 * @param deltaY El desplazamiento en el eje Y.
	 * @throws DesplazamientoInvalido si los deltas son cero.
	 */
	@Override
	public void mover(double deltaX, double deltaY){
	    if(deltaX == 0 && deltaY == 0){
			
			throw new DesplazamientoInvalido("DeltaX y DeltaY deben ser distintas a 0");
		}
	    for(Linea l : lineas){
			
			l.getP1().desplazar(deltaX, deltaY);
	       	l.getP2().desplazar(deltaX, deltaY);
	    }	
	}

	/**
	 * Nos dice si este cuadrado es igual a otro.
	 * @param f La FiguraI a comparar.
	 * @return true si son iguales.
	 */
	public boolean equals(FiguraI f){

	    if( ! (f instanceof Cuadrado)){
			return false;
			}
	    Cuadrado t = (Cuadrado)f;
	    
	    return lineas[0].equals(t.getL1()) && lineas[1].equals(t.getL2()) && lineas[2].equals(t.getL3()) && lineas[3].equals(t.getL4());
		
	}

	/**
	 * Devuelve la linea 1.
	 * @return Linea 1 
	 */
	public Linea getL1(){
	    
	    return lineas[0];
	}

	/**
	 * Devuelve la linea .
	 * @return Linea 2 
	 */
	public Linea getL2(){
	   
	    return lineas[1];
	}

	/**
	 * Devuelve la linea 3.
	 * @return Linea 3. 
	 */
	public Linea getL3(){
	    
	    return lineas[2];
	}

	/**
	 * Devuelve la linea 4.
	 * @return Linea 4. 
	 */
	public Linea getL4(){
	    
	    return lineas[3];
	}

	/**
	 * Obtiene el largo de un lado del cuadrado.
	 * @return largo El largo del cuadrado.
	 */
	public int getLargo(){
	    
	    return largo;
	}

	/**
	 * Regresa los datos del triángulo.
	 */
	@Override
	public String toString(){
	    
	    String inf = "";
	    inf += "Info. Cuadrado:\n";
	    inf += "Area" + getArea()+ "\nPerimetro" + getPerimetro() + "\nlargo: " + largo;
	    
	    return inf;
	}

}