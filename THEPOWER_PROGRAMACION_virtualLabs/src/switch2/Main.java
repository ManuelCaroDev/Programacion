/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switch2;

import java.util.Scanner;

/**
 *
 * @author manuelcaro
 */
public class Main {

    public static void main(String[] args) {

        /* Crea un programa el cual el usuario tenga que introducir un numero por pantalla
        y el programa devolvera el dia de la semana. Ej: 1 -> Lunes 3 -> Miercoles 7 -> Domingo
         */
        int dia;
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduzca el dia por pantalla");
        dia = scn.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: //"else"
                System.out.println("Ese dia de la semana no existe");

        }

    }

}
