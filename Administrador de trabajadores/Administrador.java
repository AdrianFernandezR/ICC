public class Administrador extends Trabajador{
	
	public Administrador(String numTrabajador,double saldo){
		
		super(numTrabajador,saldo);
    
    }

    public void asignarMateria(Profesor profesor,Materia materia){

		profesor.asignarMateria(materia);

    }
	
}

