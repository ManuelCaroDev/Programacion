/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

    
        /*    
        crea un programa el cual pidas el valor de dos variables e intercambia 
        sus valores, es decir; a = 5, b = 10 -> a = 10, b = 5
        */
        
        int a = 5;
        int b =10;
        int aux;
        //donde lo voy a guardar = el que voy a guardar;
        aux = a; //aux = 5
        a = b; // a = 10
        b = aux;
        

        System.out.println(a);
        System.out.println(b);
    }
}
       