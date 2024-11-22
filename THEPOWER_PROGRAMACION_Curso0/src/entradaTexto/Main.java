
package entradaTexto;

import java.util.Scanner;

public class Main {
    
    public static void main (String [] args){
    
        //crea un programa en el cual pida el nombre de una persona por pantalla
        //al finalizar el programa improme Biemvenido + nobre de la persona
        
        
        //1. Cuando es solo una palabra (sin espacios) ->next();
        //2. Cuando es mas de una palabra (puede haber espacion) -> nextLine();
        //Ojo, en caso de usar nextLine(), lo pediremos lo primero de todo
        //3. Caracter -> CharAt();
        
        
        
        String texto;
        String ejemploCharAt = "Hola";
        Scanner scn = new Scanner(System.in);
        
        
        
        
        System.out.println("Introduza su nombre");
        //texto = scn.next(); -> esto solo guarda una palabra
        texto = scn.nextLine(); //esto guarda una linea de varias palabras
        
        System.out.println("Bienvenido "+texto);
        
        
        char caracter = ejemploCharAt.charAt(1);
        System.out.println(caracter);
    
        
        char caracterPedido;
        System.out.println("Introduzca un solo caracter");
        caracterPedido = scn.next().charAt(0);
        
        System.out.println("el caracter pedido es: "+caracterPedido);
    
    }
    
}
