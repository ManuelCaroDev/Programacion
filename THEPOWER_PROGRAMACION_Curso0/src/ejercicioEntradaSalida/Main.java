
package ejercicioEntradaSalida;

import java.util.Scanner;



public class Main {
    
    public static void main(String [] args){
        
        //calculadora mejorada:
        //Pedir dos valores al usuario (a y b) y realizar las operaciones basicas que hemos visto 
        
        int a;
        int b;
        Scanner scn = new Scanner(System.in);
        int suma;
        int resta;
        int multi;
        float divi;
        int resto;
        
        
        
        
        
        System.out.println("Introduzca el valor de a");
        //donde lo queremos guardar = el que queremos guardar
        a = scn.nextInt();
        
        System.out.println("Introduzca el valor de b");
        //donde lo queremos guardar = el que queremos guardar
        b = scn.nextInt();
        
        suma = a + b;
        resta = a - b;
        multi = a * b;
        divi = (float) a / b; //cuando yo quiero dividir dos numeros enteros en java el resultado es un entero, hay que castear para que pueda hacer la division con decimales y la variable haberla declarado anteriormente como float tambien
        resto = a % b;
        
        //concatenar: unir texto con variables (+) ojo cuando quiero sumar y cuando quiero concatenar
        
        System.out.println("La suma de: "+a+" y "+b+" es: "+ suma);
        System.out.println("La resta de: "+a+" y "+b+" es: "+ resta);
        System.out.println("La multiplicacion de: "+a+" y "+b+" es: "+ multi);
        System.out.println("La division de: "+a+" y "+b+" es: "+ divi);
        System.out.println("el resto de: "+a+" y "+b+" es: "+ resto);
        
        
        
        //Operadores de asignacion
        
        // = -> Asignacion
        //== -> Comparacion
        //!= -> Comprobar si es distinto a
        //+= -> 
        //-=
        //*=, etc
        //++ -> incrementrar en 1 el valor de una variable
        //-- -> decrementar en 1 el valor de una variable
        
        boolean resultado = a >= b;
        int suma2 = 30;
        suma2++; 
        
        
        /* descripcion de este codigo
        
        INICIO
            1. Declaraciones de variables: a, b, suma, resta, multi, divi y resto.
            2. Imprimir la frase "Introduzca el valor de a"
            3. Guardar el valor de a, introducido por el usuario en la variable a.
            4. Imprimir la frase "Introduzca el valor de b"
            5. Guardar el valor de a, introducido por el usuario en la variable b.
            6. .......
        
        
        */
        
    }
    
}
