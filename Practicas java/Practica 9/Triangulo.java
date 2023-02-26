/**
 * Clase para crear triángulos en un plano cartesiano.
 * @author Miguel Mendoza.
 */
public class Triangulo {
 
  /*Líneas que forman el perímetro del triángulo*/
  private Linea linea1;
  private Linea linea2;
  private Linea linea3;

  /**
    * Constructor por omisión.
    * Construye un triángulo en los puntos (0,0),(5,0),(2.5,2.5).
    */
  public Triangulo(){

    Punto a= new Punto (0,0, "A");
    Punto b= new Punto (5,0, "B");
    Punto c= new Punto (2.5, 2.5, "C");
    linea1= new Linea (a, b);
    linea2= new Linea (b, c);
    linea3= new Linea (a, c);


  }

  /**
   * Construye un triángulo dados 3 puntos del plano.
   * @param p1 El punto 1
   * @param p2 El punto 2
   * @param p3 El punto 3
   */
  public Triangulo(Punto p1, Punto p2, Punto p3){

    Punto x= p1;
    Punto y= p2;
    Punto z= p3;

    
  }

  /**
   * Constructor copia. Construye un triángulo a partir de otro.
   * @param t El triángulo del cual se creará uno nuevo.
   */
  public Triangulo(Triangulo t){ 

    Linea prim= t.getL1();
    Linea seg= t.getL2();
    Linea terc= t.getL3();

    Punto pun1= prim.getP1();
    Punto pun2= seg.getP2();
    Punto pun3= terc.getP2();



  
  }

  /**
   * Obtiene el perímetro del triángulo.
   * @return El perímetro. 
   */
  public double getPerimetro(){

    Punto l1P1= linea1.getP1();
    Punto l1P2= linea1.getP2();
    double distanciaAB= l1P1.distancia(l1P2);
    Punto l2P1= linea2.getP1();
    Punto l2P2= linea2.getP2();
    double distanciaBC= l2P1.distancia(l2P2);
    Punto l3P1= linea3.getP1();
    Punto l3P2= linea3.getP2();
    double distanciaAC= l3P1.distancia(l3P2);
    double distanciaTotal= (distanciaAB + distanciaBC +distanciaAC);

    return distanciaTotal;
   
  }
 

  /**
   * Obtiene el área del triángulo. Fórmula de Herón.
   * @return El área del triángulo.
   */
  public double getArea(){

    //obtener longitudes
    Punto l1P1= linea1.getP1();
    Punto l1P2= linea1.getP2();
    double distanciaAB= l1P1.distancia(l1P2);
    Punto l2P1= linea2.getP1();
    Punto l2P2= linea2.getP2();
    double distanciaBC= l2P1.distancia(l2P2);
    Punto l3P1= linea3.getP1();
    Punto l3P2= linea3.getP2();
    double distanciaAC= l3P1.distancia(l3P2);

    //obtener S
    double s= ((distanciaAB + distanciaBC +distanciaAC)/2);


    return Math.sqrt(s*(s-distanciaAB)*(s-distanciaBC)*(s-distanciaAC));
    
  }

  /**
   * Mueve el triángulo en el plano.
   * @param deltaX El desplazamiento en el eje X.
   * @param deltaY El desplazamiento en el eje Y.
   */
  public void moverTriangulo(double deltaX, double deltaY){

    //primera linea
    linea1.getP1().desplazar(deltaX, deltaY);
    linea1.getP2().desplazar(deltaX, deltaY);

    //segunda linea
    linea2.getP1().desplazar (deltaX, deltaY);
    linea2.getP2().desplazar(deltaX, deltaY);

    //tercera linea
    linea3.getP1().desplazar (deltaX, deltaY);
    linea3.getP2().desplazar (deltaX, deltaY);

   
  }


  /**
   * Rota el triángulo 180°.
   */
  public void rotarTriangulo180(){

    linea1.getP1().asignarX((linea1.getP1().obtenerX())*-1);
    linea1.getP1().asignarY((linea1.getP1().obtenerY())*-1);
    linea1.getP2().asignarX((linea1.getP2().obtenerX())*-1);
    linea1.getP2().asignarY((linea1.getP2().obtenerY())*-1);

    linea2.getP1().asignarX((linea2.getP1().obtenerX())*-1);
    linea2.getP1().asignarY((linea2.getP1().obtenerY())*-1);
    linea2.getP2().asignarX((linea2.getP2().obtenerX())*-1);
    linea2.getP2().asignarY((linea2.getP2().obtenerY())*-1);

    linea3.getP1().asignarX((linea3.getP1().obtenerX())*-1);
    linea3.getP1().asignarY((linea3.getP1().obtenerY())*-1);
    linea3.getP2().asignarX((linea3.getP2().obtenerX())*-1);
    linea3.getP2().asignarY((linea3.getP2().obtenerY())*-1);
  }



  /**
   * Rota el triangulo n grados.
   * @param grados Cuantos grados se rotará el triángulo.
   */
  public void rota(int grados){
    /*Convertir grados a radianes*/
    double radianes = Math.toRadians(grados);
    /*Similar los valores de la matriz de rotación*/
    /* | m1=cos(x)  m2=-sin(x)|
       |                      |
       | m3=sin(x)  m4=cos(x) | */
    double m1 = Math.cos(radianes);
    double m2 = -1*Math.sin(radianes);
    double m3 = -1*m2;
    double m4 = m1;
    /*Obtener las coordenadas originales de cada punto simulando la matriz de 2x3*/
    /*| x1  x2  x3|
      |           |
      | y1  y2  y3| */
    double x1 = linea1.getP1().obtenerX();
    double y1 = linea1.getP1().obtenerY();
    double x2 = linea1.getP2().obtenerX();
    double y2 = linea1.getP2().obtenerY();
    double x3 = linea2.getP2().obtenerX();
    double y3 = linea2.getP2().obtenerY();
    /*Multiplicamos ambas matrices*/
    double nx1 = m1*x1 + m2*y1;
    double ny1 = m3*x1 + m4*y1;
    double nx2 = m1*x2 + m2*y2;
    double ny2 = m3*x2 + m4*y2;
    double nx3 = m1*x3 + m2*y3;
    double ny3 = m3*x3 + m4*y3;
    
    /*Asignamos a cada punto sus nuevas coordenadas*/ 
    linea1.getP1().asignarX(nx1);
    linea1.getP1().asignarY(ny1);
    linea1.getP2().asignarX(nx2);
    linea1.getP2().asignarY(ny2);

    linea2.getP1().asignarX(nx1);
    linea2.getP1().asignarY(ny1);
    linea2.getP2().asignarX(nx3);
    linea2.getP2().asignarY(ny3);
    
    linea3.getP1().asignarX(nx2);
    linea3.getP1().asignarY(ny2);
    linea3.getP2().asignarX(nx3);
    linea3.getP2().asignarY(ny3);
  }
 
  /**
   * Nos dice si este triángulo es igual a otro.
   * @param t El triángulo a comparar.
   * @return true si son iguales.
   */
  public boolean equals(Triangulo t){

    Linea prim= t.getL1();
    Linea seg= t.getL2();
    Linea terc= t.getL3();


    return (prim == linea1 && seg== linea2 && terc== linea3);



  }

  /**
   * Devuelve la linea 1.
   * @return Linea 1 
   */
  public Linea getL1(){

    return linea1;

  }

  /**
   * Devuelve la linea .
   * @return Linea 2 
   */
  public Linea getL2(){

    return linea2;

  }

  /**
   * Devuelve la linea 3.
   * @return Linea 3. 
   */
  public Linea getL3(){

    return linea3;

  }

  /**
   * Regresa los datos del triángulo (Coordenadas. área y perímetro).
   */
  public String toString(){


    return "El triangulo tiene sus puntos en " + linea1.getP1() + linea2.getP1() + linea3.getP2() + " con un area de " + getArea() + " y un perimetro de " + getPerimetro();
  }


}
