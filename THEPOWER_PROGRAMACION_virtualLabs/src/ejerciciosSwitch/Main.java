/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosSwitch;


import java.util.Scanner;
/**
 *
 * @author manuelcaro
 */
public class Main {
    
    public static void main (String [] args) {
    
    Scanner scn = new Scanner(System.in);
    int opcion; //1, 2, 3, 4
    float radio;
    float b;
    float h;
    float h2;
    float b2;
    float pi = 3.14f;
    float area = 0;
    float area2;
    
    System.out.println("Menu de opciones:\n1.Circulo\n2.Rectangulo\n3.Cuadrado\n4.Triangulo");
    opcion = scn.nextInt();
    
    /*
    
    Calcular área polígonos. Se muestra un menú 1 Circulo, 2 Rectángulo,
    3 Cuadrado, 4 Triángulo. Según el nº introducido se piden los datos al usuario y se calcula el área
    
    circulo -> pi*r*r
    Rectangulo -> b*h
    Cuadrado -> 1*1
    Triangulo - (b*h)/2
    */
            
    switch (opcion) {
        case 1:
            System.out.println("Introduzca el valor del radio: ");
            radio = scn.nextFloat();
            
            System.out.println("El area del circulo con radio : "+radio+"es: "+area+"cm2");
            break;
        case 2:
            System.out.println("Introduzca la base de su rectangulo");
            b = scn.nextFloat();
            
            System.out.println("Introduzca la altura de su rectangulo");
            break;
        default:
            System.out.println("Introduzca la altura de su rectangulo");
    }
    
    
    
}
    
    
    
    
    
    
}
