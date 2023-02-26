public class Administrador extends Trabajador{

	public Administrador (String numAdministrador) throws Excepciones{

		super(numAdministrador, 2800);

	}

	public String toString(){

		return "Numero de Administrador: " + numTrabajador + "\n" + "Sueldo:" + sueldo;
	}

}