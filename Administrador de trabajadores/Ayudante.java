
public class Ayudante extends Academico{

    private double promedio;

	public Ayudante(String numTrabajador,double saldo,String grado,double promedio){
    	super(numTrabajador,saldo,grado);
		this.promedio = promedio;
    }

    public void asignarMateria(Materia m){
	
		if(super.m1 != null){
		    m2 = m;
		}
		else {
	    	
	    	super.m1 = m;
		
		}
    }
    
    public void pedirAyudantia(Profesor p){
		p.aspirante(this);
    	}
    

    public double obtenerPromedio(){
		
		return promedio;
    }

    public String getNumTrabajador(){

    	return numTrabajador;
    }

    public String toString(){

		return "Matricula de Ayudante: " + numTrabajador +  "\nSueldo:" + sueldo + "\nGrado:" + grado + "\nPromedio: " + promedio;  
	}

}