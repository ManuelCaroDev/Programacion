/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase20_11_24;


import java.util.Scanner;
/**
 *
 * @author manuelcaro
 */
public class Main {
    
    public static void main (String [] args){
        
        Scanner scn = new Scanner(System.in);
        char operacion; //+, -, *, /, % No existe un nextChar() 1ªstring 2ª elegimos el primer caracter
        int num1, num2;
        float resultado = 0;
        
        
        System.out.println("Introduzca el valor de num1");
        num1 = scn.nextInt();
        
        System.out.println("Introduzca el valor de num2");
        num2 = scn.nextInt();
        
        System.out.println("Introduzca +, -, *, /, % dependiendo de la operacion que quieras hacer");
        operacion = scn.next().charAt(0);
        
        switch(operacion){
            
            case '+':
                
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = (float) num1 / num2;
                break;
            case '%':
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Error");
                
        }
        
        System.out.println("La operacion entre "+num1+" "+operacion+" "+num2+" = "+resultado);
        
    }
}
