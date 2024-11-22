/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchSinBreak;

import java.util.Scanner;

/**
 *
 *
 * @author manuelcaro
 */
public class Main {

    public static void main(String[] args) {

        /* Crea un programa 
        
        
         */
        int nota;
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduzca su nota");
        nota = scn.nextInt();

        switch (nota) {
            case 0:

            case 1:

            case 2:

            case 3:

            case 4:
                System.out.println("insuficiente");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7:
                System.out.println("notable");
                break;
            case 8:
                System.out.println("notable");
                break;
            case 9:
                System.out.println("sobresaliente");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("no existe esta note");
        }

    }

}
