/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioReloj;


import java.util.Scanner;
/**
 *
 * @author manuelcaro
 */
public class Main {
    
    public static void main (String [] args){
        
        //segundos -> 3600 seg
        //Horas, minutos
        
        
        
        Scanner scn = new Scanner(System.in);
        int segundos;
        int minutos;
        int horas;
        
        System.out.println("Introduzca la cantidad de segundos");
        segundos = scn.nextInt(); //3665
        
        horas = segundos / 3600; // 3665/3600 = 1,... -> 1
        minutos = (segundos - horas*3600)/60; // 3665 - 3600 = 65 seg /60 = 1,... ->1
        segundos = segundos - (horas * 3600 + minutos*60); // 3665 - (3660) = 5 segundos
        
        System.out.println(horas+"horas "+minutos+" minutos "+segundos+" segundos ");
        
    }
    
}
