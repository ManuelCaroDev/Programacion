
package curso0;


public class Main {

    //1º Detectar el problema
    //2º Diseño del Algoritmo (Pseudocodigo, Diagramas UML)
    //3º Desarrollo del software
    //4º Pruebas
    //5º Subirlo a produccion
    
    
    /*
    INICIO
    PEDIR AL USUARIO UN NOMBRE DE UNA PERSONA POR CONSOLA
    GUARDAR EL NOMBRE EN UNA VARIABLE
    IMPRIMIR EL VALOR DE LA VARIABLE DONDE EL USUARIO HA INTRODUCIDO EL NOMBRE
    FIN
    */
    
    public static void main(String [] args) {
        
        //tipo de dato + nombre = valor;
        //palabras reservadas de java --> true, int, float, char, String, System, etc.
        
        int num = 5; //solo numeros enteros
        float decimales = 5.5f; //decimales y enteros
        char caracteres = 'A'; //Caracteres siempre dentro de comillas simples
        String cadena = "hola mundo"; //Cadena de caracteres con comillas dobles;
        boolean buleanos = true; //Verdadero o falso (true - false)
        boolean expresion = num == decimales; //expresion = false
        double decimales2 = 5.5; //no hace falta la f detras del numero y permite mas decimales que el float
        
        //Una variable -> Un dato que puede ser modificado
        /* Una constante -> Un dato que no puede ser modificado (para declarar unaconstate lo hacemos con ->final<-- 
        y tine que tener el nombre todo en mayusculas: final int CONST = 5;)*/
        
        final float PI =3.14f; //constante siempre en mayusculas
        
        //Operadores +,-,*,/,%
        
        final int A = 10;
        final int B = 5;
        
        int suma;
        int resta;
        int divi;
        int multi;
        int resto;
        
        //donde lo quiero guardar = lo que quiero guardar
        
        suma = A + B;
        resta = A - B;
        multi = A * B;
        divi = A / B;
        resto = A % B;
        
        //println() es un metodo
        System.out.println("el resultado de sumar "+A+" y "+B+" es: "+ suma);
        System.out.println("el resultado de restar "+A+" y "+B+" es: "+ resta);
        System.out.println("el resultado de multiplicar "+A+" y "+B+" es: "+ multi);
        System.out.println("el resultado de dividir "+A+" y "+B+" es: "+divi);
        System.out.println("el resto de la division de "+A+" y "+B+" es: "+resto);
        
        //Casting -> Capacidad que tenemos en un lenguaje de cambiar 
        //el tipo de valor por otro, por ejemplo de int a float
        //siempre y cuando sean compatibles, de string a int por ejemplo no puedes cambiar por que no son compatibles
        //Casting()
        
        float ejemplo = 5.5f;
        int miVariable = (int) ejemplo;
        final float PI_CASTING = 3.14f;
        int pi = (int) PI_CASTING;
        
        System.out.println("Casteando PI_CASTING: "+ pi); //3
        System.out.println("IMPRIMIENDO: "+ PI_CASTING); //3,14
        
        
    }
    
}
