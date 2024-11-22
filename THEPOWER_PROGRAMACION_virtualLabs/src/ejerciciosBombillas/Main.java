/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosBombillas;

import java.util.Scanner;
/**
 *
 * @author manuelcaro
 */
public class Main {
    
    public static void main (String [] args) {
        
        
    /*
    
    boolean
    por defecto ambas bombilas estan apagadas
    
    
    dia y mes es par encender b1
    dia o mes es impar encender b2

    */
        
        boolean b1 = false;
        boolean b2 = false;
        
        int dia;
        int mes;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Introduzca el valor de dia");
        dia = scn.nextInt(); //20
        
        System.out.println("Introduzca el valor de mes");
        mes = scn.nextInt(); //10
        
        
        if(dia%2 == 0 && mes%2 == 0) {
            b1 = true;            
        }else{
            b2 = true;
        }
        
        System.out.println("El estado de la bombilla b1 es: "+b1+" y el estado de la bombilla b2 es: "+b2);
        
        
        
        
        
    }
    
    
    
    
    
}
