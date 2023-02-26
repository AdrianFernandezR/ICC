public class Numero{


	public static void main (String [] args){

		int [] num=new int[args.length-1];
		for (int i=1; i<args.length; i++){

			num[i-1]= Integer.parseInt(args[i]);
		}

		String seleccion= args[0];
		if (args.length==1 ){

			System.out.println("Ingresa datos para calcular.");

		}else{


			switch(seleccion){

				case "M": 

					System.out.print("El mayor de ");
					for(int i= 0; i<num.length-1; i++){

						System.out.print(num[i] + ", ");
					}
					System.out.print("y " + num[num.length-1]);


					int mayor= num[0];
					for(int j=1; j<num.length; j++){

						if(num[j]>mayor){

							mayor= num[j];					
						}
					} System.out.println(" es " + mayor);

				break;

			
				case "m":
					int menos= num[0];
					System.out.print("El menor de ");

					for(int i=0;i < num.length; i++){

						System.out.print(num[i] + ",");
					}

					for(int i=1; i<num.length; i++){
						if(menos>num[i]){

							menos=num[i];
						}
					}System.out.println(" es " + menos);

				break;

				case "p":

					int s= 0;
					double promedio;
					for(int i=0; i<num.length; i++){

						s+=num[i];
					}
					promedio= s/num.length;
	
					System.out.print("El promedio de ");
					for(int i= 0; i<num.length; i++){

						System.out.print(num[i] + ", ");
					}
					System.out.println(" es " + promedio);

				break;

				case "o":

					System.out.print("El orden decreciente de ");
					for(int i= 0; i<num.length; i++){

						System.out.print(num[i] + ", ");
				
						}
					for(int i = 0; i < num.length; i++){
						for(int j = 0; j < num.length-1; j++){
	
							if(num[j]< num[j+1]){
								int tmp = num[j+1];
								num[j+1] = num[j];
								num[j]=tmp;
							}
						}
					}
					System.out.print ("es ");
					for(int i = 0; i < num.length; i++){

						System.out.print(num[i] + ", ");
					}
					System.out.println("\n");

				break;

				case "t":


				System.out.print("El mayor de ");
				for(int i= 0; i<num.length-1; i++){

					System.out.print(num[i] + ", ");
					}
				System.out.print("y " + num[num.length-1]);


				int mayor2= num[0];
				for(int j=1; j<num.length; j++){

					if(num[j]>mayor2){

						mayor2= num[j];					
					}
				} System.out.println(" es " + mayor2);
 				
 				int menos2= num[0];
				System.out.print("El menor de ");

				for(int i=0;i < num.length; i++){

					System.out.print(num[i] + ",");
				}

				for(int i=1; i<num.length; i++){
					if(menos2>num[i]){

						menos2=num[i];
					}
				}System.out.println(" es " + menos2);

				int s2= 0;
				double promedio2;
				for(int i=0; i<num.length; i++){

					s2+=num[i];
				}
				promedio2= s2/num.length;
	
				System.out.print("El promedio de ");
				for(int i= 0; i<num.length; i++){

					System.out.print(num[i] + ", ");
				}
				System.out.println(" es " + promedio2);

				System.out.print("El orden decreciente de ");
				for(int i= 0; i<num.length; i++){

					System.out.print(num[i] + ", ");
				
					}
				for(int i = 0; i < num.length; i++){
					for(int j = 0; j < num.length-1; j++){
	
						if(num[j]< num[j+1]){
							int tmp = num[j+1];
							num[j+1] = num[j];
							num[j]=tmp;
						}
					}
				}
				System.out.print ("es ");
				for(int i = 0; i < num.length; i++){

					System.out.print(num[i] + ", ");
				}
				System.out.println("\n");

				break;

				default: 
					System.out.println("No existe la opcion " + args[0]);
				break;

				case "Mpm":

					//M

					System.out.print("El mayor de ");
					for(int i= 0; i<num.length-1; i++){

						System.out.print(num[i] + ", ");
					}
					System.out.print("y " + num[num.length-1]);


					int mayor3= num[0];
					for(int j=1; j<num.length; j++){

						if(num[j]>mayor3){

							mayor3= num[j];					
						}
					} System.out.println(" es " + mayor3);

					//p
					int s3= 0;
					double promedio3;
					for(int i=0; i<num.length; i++){

						s3+=num[i];
					}
					promedio3= s3/num.length;
	
					System.out.print("El promedio de ");
					for(int i= 0; i<num.length; i++){

						System.out.print(num[i] + ", ");
					}
					System.out.println(" es " + promedio3);

					//m
					int menos3= num[0];
					System.out.print("El menor de ");

					for(int i=0;i < num.length; i++){

						System.out.print(num[i] + ",");
					}

					for(int i=1; i<num.length; i++){
						if(menos3>num[i]){

							menos3=num[i];
						}
					}System.out.println(" es " + menos3);

				break;








			}
		}
	}
}