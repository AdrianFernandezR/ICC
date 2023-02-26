import java.lang.IllegalArgumentException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu{

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("**Bienvenido al sistema de Administracion de la Facultad de Ciencias**");
		
		try{
		System.out.println("Elige el tipo de trabajador que eres? \n1.-Profesor\n2.-Ayudante\n3.-Administrador\n4.-Ninguna de las anteriores");
		int ans= scan.nextInt();	
			
		
			if(ans==3){

			String numAdm;
			System.out.println("Ingrese su numero de Administrador:");
			numAdm= scan.next();
				
			Administrador usuario= new Administrador(numAdm);

			boolean bandera= true;
							
			while (bandera==true){
	
				System.out.println("\nQue deseas hacer?\n1.-Dar de alta a profesor\n2.-Dar de alta a un ayudante\n3.-Asigna ayudante a profesor"
													+"\n4.-Crear una Materia\n"+ "5.-Conocer los datos del Administrador actual \n"+"6.-Salir\n");
				try{
					int respuesta = scan.nextInt();
					Profesor profe;
		
					switch(respuesta){

						case 1: 
							System.out.print("Ingresa su cedula:");
							String cedula= scan.next();
									
							System.out.print("Ingraesa su nivel de estudio:");
							String nivEst= scan.next();

							System.out.print("Ingrese Materia que impartira:");
							String nomMat= scan.next();

							System.out.print("Ingrese los creditos que tiene asignados:");
							int creMat= scan.nextInt();

							System.out.print("Ingresa la clave de la materia:");
							String clavMat=scan.next();

							Materia materia= new Materia(nomMat, creMat, clavMat);

							profe= new Profesor(cedula, nivEst, materia);

							System.out.println("Se ha dado de alta al profesor\n" + profe);


						break;

						case 2:
							System.out.print("Ingresa su numero de cuenta:");
							String numCu= scan.next();
											
							System.out.print("Ingresa su grado:");
							String esco= scan.next();

							System.out.print("Ingresa su promedio:");
							double prom= scan.nextDouble();
									
							Ayudante ayuda= new Ayudante(numCu, esco, prom);

							System.out.println("Se ha registrado al ayudante\n" + ayuda);



						break;

						case 3:
			
							System.out.println("Ingrese los datos del profesor");
							System.out.println("Numero de profesor: ");
							String numProfe= scan.next();

							System.out.println("Grado de profesor: ");
							String gradProfe= scan.next();

							System.out.println("Materia que impartira el profesor: ");
							System.out.print("---Ingrese nombre de la materia:");
							String nomMat2= scan.next();

							System.out.print("---Ingrese cantidad de creditos asginados a la materia:");
							int creMat2= scan.nextInt();

							System.out.print("---Ingresa la clave de la materia:");
							String clavMat2=scan.next();

							Materia mat= new Materia(nomMat2, creMat2, clavMat2);

							Profesor maestro= new Profesor(numProfe,gradProfe, mat);
	
							//Ayudante
							System.out.println("Ingrese los datos del Ayudante que se desea asignar");
							System.out.print("Ingresa su numero de cuenta:");
							String numCu2= scan.next();
											
							System.out.print("Ingresa su grado:");
							String esco2= scan.next();

							System.out.print("Ingresa su promedio:");
							double prom2= scan.nextDouble();
									
							Ayudante ayuda2= new Ayudante(numCu2, esco2, prom2);
								
							maestro.asignarAyudante(ayuda2);

							System.out.println("Se ha asignado el ayudante \n" + ayuda2 + " al profesor \n" + maestro);
						break;

						case 4:

							System.out.print("Ingrese su nombre: ");
							String nombre= scan.next();

							System.out.print("Ingrese su valor en creditos: ");
							int credi= scan.nextInt();

							System.out.print("Ingrese su clave: ");
							String clav= scan.next();

							Materia materita= new Materia (nombre, credi, clav);

							System.out.println("Se ha creado la materia \n" + materita);

						case 5:

							System.out.println("Los datos del Administrador son :\n" + usuario);
						break;

						case 6:

							System.out.println("Que tengas un buen dia");
							bandera= false;
						break;


						default: 
							System.out.println("Ingresa una opcion valida");
						
						return;			
							}

						} catch(InputMismatchException e){
                				scan.next();
                				System.out.println("Caracer invalido");
            				}
					}
			}
			
 			if(ans== 1 || ans== 2 || ans== 4){

  				System.out.println("No tienes acceso al sistema");
  	
  
  			} else if( ans>4 || ans<0){

  				System.out.println("Esa no es una opcion valida, cerrando el sistema");
  			}
  		
  		} 
  		catch(InputMismatchException e){
                scan.nextInt();
                System.out.println( "Opcion incorrecta");
       	}     
	}
}