public class circulo {

    public static void main (String [] args) {

	//Valor Pi
	double Pi = 3.1416;

	//Radio de Ciriculo
	double a= 3;
	double b= 3;
	double radio= (a + b);

	System.out.println ("El radio del circulo es " + radio);

	//Area

	double area= (Pi*(radio*radio));

	System.out.println ("El Area del circulo es " + area);

	//Perimetro

	double perimetro= ((2*Pi)*radio);

	System.out.println ("El Perimetro es "+ perimetro);	
		 	
    }
	
}
