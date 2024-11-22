/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosVL;

import java.util.Scanner;

public class ejerciciosCondicionales {

    public static void main(String[] args) {

        /*
        // pide 3 numeros y ordenalos de menor a mayor
    
    
        int num1;
        int num2;
        int num3;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("introduzca el valor de num1");
        num1 = scn.nextInt();
        
        System.out.println("introduzca el valor de num2");
        num2 = scn.nextInt();
        
        System.out.println("introduzca el valor de num3");
        num3 = scn.nextInt();
        
        
        if (num1 > num2 && num2 > num3){
            System.out.println(num1+" "+num2+" "+num3);                  
        } else if (num1 > num3 && num3 > num2){
            System.out.println(num1+" "+num3+" "+num2);
        }
         */
 
        
        
        
        /*
        
        //introdizca un numero del 0 al 99999 y decir cuantas cifras tiene
        int num;
        Scanner scn = new Scanner(System.in);

        System.out.println("introduzca el valor de num");
        num = scn.nextInt();

        if (num >= 0 && num <= 99999) {
            if (num < 10) {
                System.out.println("El numero " + num + " tiene 1 cifra");
            } else if (num < 100) {
                System.out.println("El numero " + num + " tiene 2 cifra");

            } else if (num < 1000) {
                System.out.println("El numero " + num + " tiene 3 cifra");

            } else if (num < 10000) {
                System.out.println("El numero " + num + " tiene 4 cifra");

            } else if (num < 100000) {
                System.out.println("El numero " + num + " tiene 5 cifra");

            }
        } else {
            System.out.println("Error no has introducido un numero entre 0 y 99999");
        }
         */
        

        /*
        //crear un programa en el cual pidamos un usuario y una contraseña, si el usuario y la contraseña es incorrecta
        //mostrar el mensaje "Nombre de usuario o contraseña incorrecto", si es correcta imprimir "Bienvenido al sistema"
        
        
        
        String contrasenya, nombre;
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese nombre de usuario: ");
        nombre = scn.nextLine();

        System.out.println("Ingrese contraseña: ");
        contrasenya = scn.nextLine();

        if (nombre.equals("Manuel") && contrasenya.equals("1234")) {
            System.out.println("Bienvenidos al sistema");

        } else {
            System.out.println("nombre de usuario o contraseña incorectos");
        }
        */
        
        
        
        //tienda don pepa desea un programa para ingresar por teclado el monto de compra y el dia de la semana.
        //si el dia es martes o jueves se realizara un 15% de descuento. Es importante que al final del programa 
        //visualicemos el descuento si lo tiene y el total a pagar por la compra
        
        
        
        float montoCompra;
        String diaSemana;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingrese el monto de la compra: ");
        montoCompra = scn.nextFloat();
        
        System.out.println("Ingrese el dia de la semana: ");
        diaSemana = scn.next();
        
        if(diaSemana.equalsIgnoreCase("martes") || diaSemana.equalsIgnoreCase("jueves")){
            
            //aplico 15% / realmente pago 85%
            montoCompra = montoCompra * 0.85f;
            System.out.println("Ha obtenido un 15% de descuento!");
            
        }else{
            System.out.println("No ha obtenido ningun descuento!");
        }
        
        System.out.println("Su precio final es: "+montoCompra);
        
      
    }

}
