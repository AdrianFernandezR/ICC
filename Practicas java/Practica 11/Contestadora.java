import java.util.Scanner;

/**
 * Clase para ...
 * @author ...
 */
public class Contestadora {
    
    //Estructura de la contestadora
    private Mensaje [] mensajes;
    Scanner scan = new Scanner(System.in);
    
    /**
     * Constructor de unca contestadora con capacidad para 10 mensajes
     */
    public Contestadora() {
        this.mensajes= new Mensaje[10];

    }

    /**
     * Constructor de una contestadora con capacidad para n mensajes
     * @param n - capacidad de la contestadora
     */
    public Contestadora(int n) {

        if (n>0){

            this.mensajes= new Mensaje[n];
        } 
        if (n<=0){

            new Error("No se pueden crear una contestadora con capacidad menor a 1");
        }

    }

    /**
     *  Metodo que agrega un nuevo mensaje a la contestadora.
     *  @param nuevoMensaje Nuevo mensaje que sera agregado a la contestadora.
     */
    private void agregarMensaje(Mensaje nuevoMensaje){

        for(int i=0; i<mensajes.length; i++){

            if(mensajes[i]==null){

                mensajes[i]= nuevoMensaje;
            break;

            }else if(nuevoMensaje.fueEscuchado()==true){

                mensajes[i]=nuevoMensaje;
            
            break;

            }
        }
    }

    
    /**
     *  Metodo que imprime en pantalla el contenido de la contestadora.
     */
    private void escucharMensajeReciente(){


        for(int i = mensajes.length-1; i >=0; i--){

            if(mensajes[i]!=null){
            System.out.println(mensajes[i].escucha() +"\n");

            break;

            } 
        }
    }    

    public void escucharMensajes(){


        for(int i = 0; i <= mensajes.length-1; i++){

            if(mensajes[i]!=null){
            System.out.println(mensajes[i].escucha() +"\n");}

            if(mensajes[i]==null){

                break;
            }

        }
    }
    
    
    /*
    * Metodo auxiliar para mostrar el menu de opciones
    * NO MODIFICARLO
    */
    public static void main(String pps[]){
    //Programar el funcionamiento de la contestadora

    Scanner scan = new Scanner(System.in);
    System.out.println("De que capacidad desea su contestadora?");
    int capacidad= scan.nextInt();
    if (capacidad <= 0){

        System.out.println("No se pueden crear una contestadora con capacidad menor a 1");
    
    } else{

        boolean bandera= true;
        Contestadora contest= new Contestadora(capacidad);

        while (bandera== true){

            System.out.println("\nContestadora");
            System.out.println("1. Agregar mensaje");
            System.out.println("2. Revisar mensaje reciente");
            System.out.println("3. Revisar mensajes");
            System.out.println("4. Salir");
            System.out.print("Seleccionar una opcion --> ");

            int opcion= scan.nextInt();


            switch (opcion){


                case 1:
                    System.out.println("Introduce mensaje: ");
                    Scanner squin = new Scanner(System.in);
                    String msg= squin.nextLine();

                    System.out.println ("El mensaje " + msg + " a sido agregado");

                    Mensaje mensaje= new Mensaje(msg);
                    contest.agregarMensaje(mensaje);

                break;

                case 2:

                    contest.escucharMensajeReciente();

                break;

                case 3:

                    contest.escucharMensajes();

                break;

                case 4:
                    System.out.println("Adios");
                    bandera= false;

                break;

                default:
                    System.out.println("Esa opcion no existe");

                break;

                }
            }
        }
    }
}