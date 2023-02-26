/**
 * Clase que contiene métodos que ejemplifican el uso de ciclos.
 */
public class Ciclos {


  /**
   * Constructor por omisión que no hace nada.
   */
  public Ciclos(){


  }

  /**
   * Regresa una cadena con una piramide de n pisos.
   * @param n El número de pisos.
   * @return String con la piramide.
   */
  public static String piramide(int n){

  	int aux= 0;
  	String inicio= "";
  	int z=n;
  	String jump= "";

  	while (aux<z && z>=0){

  		inicio= inicio + "*";
  		jump= jump + inicio + "\n";
  		aux++;
  	}

  	return "\n"+jump;
  }
  
  /**
   * Imprime los números pares de 0 a n.
   * @param n El límite para calcular pares.
   */
  public static void pares(int n){

  	int aux = 0;

  	do{
  		if (n<0){

  			System.out.println ("Solo funciona con numeros positivos");
  		}else {

  		System.out.print (aux);
  		aux+=2;
  		System.out.print (",");
  	}

  	}
  	while (aux<=n);
    
  }
  
  /**
   * Calcula el promedio de 5,10,15,20,25
   * @return El promedio.
   */
  public static double promedio(){

  	double promedio= 0;

  	for (int i=0; i<=25; i+=5){

  		int aux= 50;

  		promedio= ((i+50)/5);
  	}

  	return promedio;

    
  }
  
}