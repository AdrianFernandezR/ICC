
public class Racional {
   
    private int numerador;

    private int denominador;


    public int obtenerNominador(){

    	return numerador;



    }
    

    public int obtenerDenominador(){

    	return denominador;

    }

    public Racional(int nuevoNumerador, int nuevoDenominador) {

    	numerador= nuevoNumerador;
    	denominador= nuevoDenominador;
    	if (nuevoDenominador != 0){
    		denominador= nuevoDenominador;
    	}
        else{

            System.out.println("No se puede crear el racional " + nuevoNumerador +"/" + nuevoDenominador + " por tener denominador igual a 0");
        }


    }
    

    public Racional sumar(Racional sumando){


    	int denResultado;
    	int numResultado;
    	int sumaDen= sumando.obtenerDenominador();
    	int sumaNum= sumando.obtenerNominador();
    	denResultado= denominador*sumaDen;
    	if (denominador==sumaDen) {
    		denResultado= (denominador*1);
    	}
    	numResultado= (numerador*sumaDen) + (sumaNum*denominador);
    	if (denominador==sumaDen) {

    		numResultado= sumaNum + numerador;
    	}

    	return new Racional(numResultado, denResultado);



    }
    
    public Racional multiplicar(Racional factor){

    	int numM= factor.obtenerNominador();
    	int denM= factor.obtenerDenominador();

    	int denMult= denominador*denM;
    	int numMult= numM*numerador;




    	return new Racional (numMult, denMult);

    }
    

    public String toString(){





    	return (numerador + "/" + denominador);


    }

    public boolean equals(Object comparacion){

    	Racional r=(Racional)comparacion;

    	if(r.obtenerNominador()==numerador && r.obtenerDenominador()==denominador){



    	return true;}

    	 	return false;
		    

  }
    
}