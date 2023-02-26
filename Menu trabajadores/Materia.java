public class Materia{

    protected String nombre;
    protected int creditos;
    protected String clave;

    public Materia(String nombre,int creditos,String clave){
		if(clave.length()>0 && creditos>0){
		    
		    this.nombre=nombre;
	    	this.creditos = creditos;
	    	this.clave = clave;
		}
		else{

		    System.out.println("No se puede crear la materia");
		}
		
    }

    public String getNombre(){

    	return nombre;
    }

    public String toString(){

    	return "Nombre: " + nombre + "\nCreditos: " + creditos + "\nClave: " + clave;

    }

} 
