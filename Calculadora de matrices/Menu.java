import java.util.Scanner;
public class Menu{


	public static Matriz opcion1(){

		System.out.println("Escribe la ubicacion de la Matriz que vas a cargar");
		Scanner scan= new Scanner(System.in);
		String ruta= scan.next();

		LeerArchivo la= new LeerArchivo();
		String [] lineas= la.leerArchivo(ruta);

		for(String s: lineas){

			System.out.println(s);
		}

		double [][] mat= new double [lineas.length][];

		for (int i= 0; i< lineas.length; i++){

			String[] fila= lineas[i].split(" ");
			double[] filaD= new double[fila.length];
			for (int j=0; j<fila.length; j++){

				filaD[j]= Double.parseDouble(fila[j]);
			}
			mat[i]= filaD;
		}

		return new Matriz(mat);
	}

	public static void main(String [] args){

		Matriz m= opcion1();
		boolean bandera= true;

	while(bandera){
		System.out.println("\nOpciones");
		System.out.println("1. Multiplicar por escalar");
		System.out.println("2. Gauss Jordan");
		System.out.println("3. Calcular traspuesta de una Matriz");
		System.out.println("4. Calcular determinante de una Matriz");
		System.out.println("5. Realizar suma de matrices");
		System.out.println("6. Realizar multiplicacion de matrices");
		System.out.println("7. Cambiar Matriz base");
		System.out.println("8. Salir");

		Scanner scan= new Scanner(System.in);
		int opcion= scan.nextInt();

		switch(opcion){

			case 1: 
				System.out.println("Por que numero deseas multiplicar?");
				double multEscal= scan.nextDouble();
				Matriz escalar= m.multiplicacionEscalar(multEscal);

				System.out.println("Matriz="+ "\n" + m );
				System.out.println("\nSe multiplicara por el valor" + multEscal);
				System.out.println("Matriz("+ multEscal +")=\n" + escalar);

			break;

			case 2:

				double [] resuelto= m.gaussJordan();

				for (int i=0; i<resuelto.length; i++){

					System.out.println("El resultado de la Matriz =\n" + m + "\n es: \n" + resuelto[i]);
				}
				System.out.println(" ");

			break;

			case 3:

				Matriz traspuesta= m.traspuesta();
				System.out.println("Se calculara la traspuesta de la Matriz \n" + m );
				System.out.println("Su traspuesta es \n" + traspuesta);

			break;

			case 4: 

	    		double valor = m.determinante();
	    		System.out.println("Determinante de M es =" + "\n" + valor);

			break;
			

			case 5:

				System.out.println("Con que Matriz desea realizar la suma?");
				Matriz n= opcion1();
				Matriz suma= n.sumar(n);

				System.out.println("M=" + "\n" + m);
				System.out.println("N=" + "\n" + n);
				System.out.println("M+N=" + "\n" + suma);

			break;

			case 6: 


				System.out.println("Con que Matriz desea realizar la multiplicacion?");
				Matriz matMult= opcion1();
				Matriz multi= m.multiplicacion(matMult);

				System.out.println("Se realizara la multiplicacion de las matrices M=\n" + m + "con la Matriz N=\n" + matMult);
				System.out.println("El resultado de la multiplicacion es \n" + multi);

			break;

			case 7:

				System.out.println("Por que matriz deseas cambiarla?");
				Matriz matClon=opcion1();
				Matriz clonada= m.asignarMatriz(matClon);

				System.out.println ("Se a cambiado la matriz \n" + m);
				System.out.println ("Por la matriz \n" + clonada);

			break;

			case 8: //caso en el que salimos
				System.out.println("Adios");
				bandera= false;

			break;

			default:
				System.out.println("Esa opcion no existe");
			break;

			}
		}
	}





}