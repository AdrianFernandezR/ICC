/**
 * Clase para crear triángulos en un plano cartesiano.
 * @author Miguel Mendoza.
 */
public class Triangulo extends Figura implements FiguraI{
	
	/**
	 * Constructor por omisión.
	 * Construye un triángulo en los puntos (0,0),(5,0),(2.5,2.5).
	 */
	public Triangulo(){
		super.lineas = new Linea[3];
		Punto x= new Punto(0,0);
		Punto y= new Punto(5,0);
		Punto z= new Punto(2.5,2.5);
    	
    	Linea linea1= new Linea (x, y);
    	Linea linea2= new Linea (y, z);
    	Linea linea3= new Linea (x, z);

    	lineas[0]= linea1;
    	lineas[1]= linea2;
    	lineas[2]= linea3;
		
	}

	/**
	 * Construye un triángulo dados 3 puntos del plano.
	 * @param p1 El punto 1
	 * @param p2 El punto 2
	 * @param p3 El punto 3
	 * @throws PuntosInvalidosExcepcion si los puntos son iguales.
	 */
	public Triangulo(Punto p1, Punto p2, Punto p3) throws PuntosInvalidosExcepcion{
   		
   		Punto x= p1;
    	Punto y= p2;
    	Punto z= p3;
    	Linea linea1= new Linea (x, y);
    	Linea linea2= new Linea (y, z);
    	Linea linea3= new Linea (x, z);

    	super.lineas= new Linea[3];
    	lineas[0]= linea1;
    	lineas[1]= linea2;
    	lineas[2]= linea3;


	}

	/**
	 * Constructor copia. Construye un triángulo a partir de otro.
	 * @param t El triángulo del cual se creará uno nuevo.
	 * @throws NullPointerException si la figura es null.
	 */
	public Triangulo(Triangulo t) throws NullPointerException{


    	Linea prim= t.getL1();
    	Linea seg= t.getL2();
    	Linea terc= t.getL3();

    	Punto pun1= prim.getP1();
    	Punto pun2= seg.getP2();
    	Punto pun3= terc.getP2();

  		super.lineas= new Linea[3];
    	lineas[0]= prim;
    	lineas[1]= seg;
    	lineas[2]= terc;

		
	}

	/**
	 * Obtiene el perímetro del triángulo.
	 * @return El perímetro. 
	 */
	public double getPerimetro(){

		double perímetro= 0.0;
		for(int i=0; i<lineas.length; i++){

		    Punto l1P1= lineas[i].getP1();
    		Punto l1P2= lineas[i].getP2();
  			double distanciaAB= l1P1.distancia(l1P2);

    		perímetro+= distanciaAB;

    		
		} return perímetro;
		
	}

	//Aquí va Método getArea()
 	
 	/**
 	 * El área depende de cada Figura.
 	 * @return el área de alguna figura.
 	 */
 	public double getArea(){

 		double area= 0.0;

 		for (int i=0; i< lineas.length; i++){
 			
 			Punto l1P1= lineas[i].getP1();
    		Punto l1P2= lineas[i].getP2();
    		double distanciaAB= l1P1.distancia(l1P2);

    		area+= distanciaAB;

 		} return area;
 	
 	}
	

	/**
	 * Mueve el triángulo en el plano.
	 * @param deltaX El desplazamiento en el eje X.
	 * @param deltaY El desplazamiento en el eje Y.
	 * @throws DesplazamientoInvalido si los deltas son cero.
	 */
	@Override
	public void mover(double deltaX, double deltaY){

		for (int i= 0; i<lineas.length; i++){
			
			lineas[i].getP1().desplazar(deltaX, deltaY);
    		lineas[i].getP2().desplazar(deltaX, deltaY);
    			
		}
		
	}

	//Aquí va Método rotar90()

	/**
	 * Rota 90°.
	 */
	@Override
	public void rotar90(){

	}
	
	/**
	 * Rota el triángulo 180°.
	 */
	@Override
	public void rotar180(){

		for (int i=0; i<lineas.length; i++) {
			
			lineas[i].getP1().asignarX((lineas[i].getP1().obtenerX())*-1);
    		lineas[i].getP1().asignarY((lineas[i].getP1().obtenerY())*-1);
    		lineas[i].getP2().asignarX((lineas[i].getP2().obtenerX())*-1);
    		lineas[i].getP2().asignarY((lineas[i].getP2().obtenerY())*-1);
		}
		
	}

	/**
	 * Nos dice si este triángulo es igual a otro.
	 * @param f La FiguraI a comparar.
	 * @return true si son iguales.
	 */
	public boolean equals(FiguraI f){

		Triangulo s= (Triangulo)f;

		if(this.getLineas() == s.getLineas()){

			return true;
		}else{

			return false;
		}
	
	}

	/**
	 * Devuelve la linea 1.
	 * @return Linea 1 
	 */
	public Linea getL1(){

		Linea linea1= lineas[0];
		
		return linea1;
	}

	/**
	 * Devuelve la linea .
	 * @return Linea 2 
	 */
	public Linea getL2(){
	
		Linea linea2= lineas[1];
		
		return linea2;
	}

	/**
	 * Devuelve la linea 3.
	 * @return Linea 3. 
	 */
	public Linea getL3(){

		Linea linea3= lineas[2];

		return linea3;
	}

	/**
	 * Regresa los datos del triángulo.
	 */
	@Override
	public String toString(){

 		String inf = "";
	    	inf += "Info. Triangulo:\n";
	    	inf += "Area:" + getArea()+ "\nPerimetro:" + getPerimetro();
	    
	    return inf;
	}


}
