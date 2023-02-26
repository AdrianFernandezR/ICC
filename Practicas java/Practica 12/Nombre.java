public class Nombre{

    public static void main(String[] pps){


		if(pps.length < 3){
	    	System.out.println("Debes ingresar al menos tres cadenas para el nombre.");

		}

		if(pps.length == 3){
	    
	    	System.out.println("\nEl nombre completo es: " + pps[1] + " " + pps[2] + " " + pps[0]);
	    	System.out.println("El nombre es: " + pps[0]);

			}

		if(pps.length > 3){

	    	System.out.print("El nombre completo es: "+ pps[pps.length-2] + " " + pps[pps.length-1] + " ");
	    
	    	for(int i =0; i != pps.length-2; i++){
		    
		    	System.out.print(pps [i]+ " ");
			
				}

	    
	    	System.out.print("\nEl nombre es: ");
	    
	    	for(int i =0; i != pps.length-2; i++){
		
		    	System.out.print(pps [i]+ " ");
				}	
	    
		    System.out.print("\n");
	
		}
    }
}