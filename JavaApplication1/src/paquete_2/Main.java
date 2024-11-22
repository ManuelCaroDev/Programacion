/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_2;
import java.util.Scanner;
/**
 *
 * @author manuelcaro
 */
public class Main {
    
    public static void main(String[] args){

    
    //mini calculadora
    Scanner scn = new Scanner(System.in);
    
    int a;
    int b;
   
    int suma;
    int resta;
    int multi;
    float divi;
    int resto;
    
    System.out.println("Introduzca el numero a:");
    a = scn.nextInt();
    
    System.out.println("Introduzca el numero b");
    b = scn.nextInt();
        
    suma = a + b;
    resta = a - b;
    multi = a * b;
    divi =(float) a / b;
    resto = a % b;
    
    System.out.println("El resultado de la suma de: "+a+" y "+b+"es: "+suma);
    System.out.println("El resultado de la resta de: "+a+" y "+b+"es: "+resta);
    System.out.println("El resultado de la multiplicacion de: "+a+" y "+b+"es: "+multi);
    System.out.println("El resultado de la division de: "+a+" y "+b+"es: "+divi);
    System.out.println("El resultado de la resto de la division de: "+a+" y "+b+"es: "+resto);
}
}
