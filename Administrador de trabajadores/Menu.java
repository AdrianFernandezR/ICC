import java.util.Scanner;

public class Menu{

    public static void main(String[] args){

    //Se crea un admin predeterminado
	Administrador admin = new Administrador("976545",5000.00);
	Scanner scan = new Scanner(System.in);
	
	//Dar de alta a un profesor
	System.out.println("**Sistema de altade profesores de la Facultad de Ciencias**");
	System.out.println("Ingrese los datos para dar de alta a un profe \nNo. de Trabajador: ");
	String numTrab = scan.next();
	System.out.println("Sueldo:");
	Double sueldo = scan.nextDouble();
	System.out.println("Grado:");
	String grado = scan.next();
	Profesor profe = new Profesor(numTrab,sueldo,grado);

	System.out.println("Se ha dado de alta al profesor!: \n" + profe.toString());

	//Datos de la primer materia
	System.out.println("Datos de la Primer Materia que impartira" );
	System.out.println("Nombre de la materia:");
	String nombreMat = scan.next();

	System.out.println("Clave de la materia:");
	String claveMat = scan.next();
	
	System.out.println("Creditos de la materia:");
	int creMat = scan.nextInt();
	Materia materia = new Materia(nombreMat,creMat,claveMat);

	//Asignacion
	admin.asignarMateria(profe,materia);
	System.out.println("Se la asignado la materia " + materia.toString() + " al profesor " +profe.getNumTrabajador());
	

	//Ayudante de ayudante
	System.out.println("----------------------------------------------------");
	System.out.println("Datos para dar de alta a un ayudante \nNo. Trabajador ");
    
    String numTraba = scan.next();
    System.out.println("Sueldo:");
    Double sueldoAyu = scan.nextDouble();
    System.out.println("Grado:");
    String gradoAyu = scan.next();
    System.out.println("Promedio:");
    Double promedioAyu = scan.nextDouble();
	Ayudante ayudante1 = new Ayudante(numTraba,sueldoAyu,gradoAyu,promedioAyu);
	ayudante1.pedirAyudantia(profe);
	profe.asignarAyudante();
	System.out.println(ayudante1.toString());

	//Asignacion
	System.out.println("----------------------------------------------------");
	System.out.println("Solo se encuentra un ayudante disponible");
	System.out.print("Se le a asginado el ayudante " + ayudante1.getNumTrabajador() + " al profesor " + profe.getNumTrabajador() + "\n");
    }
}
