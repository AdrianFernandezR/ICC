public class Asignacion {

    public static void main (String [] args){

	int a= 5;
	int b= 2;
	int c= 3;

	int resultado= (a + b + c + a*b + c);

	System.out.println ("El resultado es " + resultado);

	//Sobreescribir 1

	 resultado= ((a + b) * c);

	 System.out.println ("El segundo resultado es " + resultado);

	 //Sobreescribir 2

	 resultado= (a + b * c);

	 System.out.println ("El tercer resultado es " + resultado);


    }


}
