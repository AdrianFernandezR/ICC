public class Profesor extends Academico{

    private Ayudante[] aspirantes;
    private Materia mat;
    
    public Profesor(String numTrabajador,double sueldo,String grado){
		
		super(numTrabajador, sueldo, grado);
		aspirantes = new Ayudante[10];
    }
    
    public void asignarAyudante(){
		
		Ayudante elegido = aspirantes[0];
		elegido.asignarMateria(super.m1);
    }
    
    public void asignarMateria(Materia b){
		
		if(super.m1 != null){
        	m2 = b;
        }
        else{
        	
        	super.m1 = b;
    	}
    }
    
    public void aspirante(Ayudante aspirante){
		for(int i = 0; i<aspirantes.length; i++){
	    	if(aspirantes[i] == null){
				aspirantes[i] = aspirante;
		return;
	    	}
		}
    }
    
    public void quickSort(Ayudante[] aspirantes, int inicio, int fin){
		this.aspirantes=aspirantes;
        double pivote= aspirantes[inicio].obtenerPromedio();
        int elemIzq= inicio+1;
        int elemDer= fin;
        while(elemIzq<=elemDer){

        	while(elemIzq<=fin && aspirantes[elemIzq].obtenerPromedio()<pivote){
            	elemIzq++;
            	}
                        
            while(elemDer>inicio && aspirantes[elemDer].obtenerPromedio()>=pivote){
                                
            	elemDer--;
                }
                        
            if(elemIzq<elemDer){
                                
            	Ayudante t=aspirantes[elemIzq];
            	aspirantes[elemIzq]=aspirantes[elemDer];
            	aspirantes[elemDer]=t;
            	}
            }
                
        if(elemDer>inicio){
                Ayudante t=aspirantes[inicio];
                aspirantes[inicio]=aspirantes[elemDer];
                aspirantes[elemDer]=t;
           }
     	    quickSort(aspirantes, inicio, elemDer-1);
  	        quickSort(aspirantes, elemDer+1, fin);
    }

    public String getNumTrabajador(){

    	return numTrabajador;
    }
    
    public String toString(){
       
		return "Matricula de Profesor: \n" + numTrabajador + "\nSueldo:" + sueldo + "\nGrado:" + grado;
        
    }
}
