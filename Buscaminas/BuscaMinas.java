import java.util.Scanner;
import java.io.*;


public class BuscaMinas{

	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		
	 try{

    System.out.println("BUSCAMINAS");
    System.out.println("Bienvenido al juego, ¿Cual es tu nombre?");
    String nombre = scan.nextLine();
           
    System.out.println("¿Deseas saber las reglas del juego antes de empezar?"+ 
      "Presiona 1 si asi lo deseas, presiona cualquier otra tecla si deseas continuar sin leer las reglas");
    int inst= scan.nextInt();

    if(inst==1){
    
      System.out.println("Este juego es muy sencillo\nPrimero tienes que elegir el tamaño del tablero en el que jugaras, para esto daras un valor entero mayor 8 y este se multiplicara por si mismo para obtener un tablero cuadrado"+
        "Despues se te preguntara el numero de una celda, se descubrira su contenido y sabremos cual es tu suerte\nSi encuentras una celdas vacia, tuviste suerte, queda seguir bucando en mas celdas\nSi encuentras una celda con bomba esta explotara y el juego terminara\nSin mas que decir, A jugar!");
    }
    
    System.out.println("Diviertete\n*-----------------------------------------------------*\n");

    int celdasT= 8;
    int minasT= 10;
      
    System.out.println("¿Desea que su partida sea guardada?\nPresiona 1 para guardar la partida, presiona cualquier otro numero para continuar sin guardar");
    int resp= scan.nextInt();

    if (resp==1){
   
      System.out.println("¿Cuantas minas tendra tu tablero?");
      minasT  = scan.nextInt();
   
      System.out.println("¿Cuantas celdas por hilera tendra tu tablero?");
      celdasT  = scan.nextInt();
    
      DatosDeJugador perst = new DatosDeJugador(nombre,minasT,celdasT);
    
      try{
       
        FileOutputStream ward = new FileOutputStream("Tablero.ser");
        ObjectOutputStream output = new ObjectOutputStream(ward);
        output.writeObject(perst); 
        output.close();
    
      }catch(FileNotFoundException e){
         
        System.out.println("No se puede guardar");
      
      }catch(IOException x){
    
        System.out.println("Error al guardar la partida");
    
      }
    
      try{
      
        FileInputStream recover = new FileInputStream("TableroR.ser");
        ObjectInputStream input = new ObjectInputStream(recover);
        perst = (DatosDeJugador) input.readObject();
      
        input.close();
      }catch(FileNotFoundException e){
    
        System.out.println("Partida inexistente");
     
      }catch(IOException e){
    
        System.out.println("Partida dañada, imposible recuperarla");
    
      }catch(ClassNotFoundException e){
    
        System.out.println("Se ha perdido una clase necesaria para el proceso del recuperacion");
      }
       
      System.out.println(perst);

      } 


      int largo= 8;
      int mina= 10;
      try{

        System.out.println("¿Cuantas celdas deseas que tenga una hilera del tabalero?");
        largo = scan.nextInt();

        if(largo <= 7){

          System.out.println("Por reglas del juego el tablero tiene que tener minimo 8 celdas por hilera");
          System.exit(0); 
        } 
        

        System.out.println("¿Cuantas minas deseas en tu tablero?");
        mina= scan.nextInt();
      
        if(mina < 1){

          System.out.println("El tablero necesita mas de 1 bomba para poder ser creado");
          System.exit(0); 
     
        }
	 		
      } catch(Exception e){

        System.out.println("Ingresa entradas validas");
      }
      
      System.out.println("Tenemos un tablero con un total de " + largo*largo + " celdas, de las cuales "+ mina +" tienen minas");
      Tablero tablero = new Tablero (largo*largo, mina);
        
		  boolean opciones= true;
      while(opciones==true){

        System.out.println("¿En que numero de celda deseas buscar?");
				int abrir = scan.nextInt();
			        
				if(abrir >= 0 && abrir<= largo*largo){

          Bomba kabom = new Bomba();
				      
          tablero.abrirCelda(abrir);

        }else {
          
          System.out.println("Esa celda no esta disponible en este tablero");
        }
      
		  }

		}catch(Exception e){

		  System.out.println("Esa opcion sale del tablero");

    }
  }
}

  

    
    




