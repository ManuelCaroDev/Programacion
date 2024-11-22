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
public class estacionesDelAño {

    public static void main(String [] args) {

        /*
            Inicio
                1. introducir 1 dia
                2. introducir un mes
                3. comprobamos en que mes estamos 1,2 invierno 3,4,5 primavera 6,7,8 verano 9,10,11 otroño 12 invierno
                4 dentro del mes 3, comprobar si dia<21 --> invierno, primavera
                5. dentro del mes 6, comprobar si dia<21 -- primavera, verano
                6. dentro del mes 9, comprobar si dia<21 --- verano, otoño
                7. dentro del mes 12, comprobar si dia<21 -- otoño invierno
                8. si no cumople 
                9.estacion que estamos
        
         */
        Scanner scn = new Scanner(System.in);
        int dia;
        int mes;
        String estacion;

        System.out.println("Introduzca un dia");
        dia = scn.nextInt();

        System.out.println("Introduzca un mes");
        mes = scn.nextInt();

        switch (mes) {
            case 1:

                estacion = "invierno";
                break;
            case 2:
                estacion = "invierno";
                break;
            case 3:
                if (dia < 21) {
                    estacion = "invierno";
                } else {
                    estacion = "primavera";
                }
                break;
            case 4:
                estacion = "primavera";
                break;
            case 5:
                estacion = "primavera";
                break;
            case 6:
                if (dia < 21) {
                    estacion = "primavera";
                } else {
                    estacion = "verano";
                }
                break;
            case 7:
                estacion = "verano";
                break;
            case 8:
                estacion = "verano";
                break;
            case 9:
                if (dia < 21) {
                    estacion = "verano";
                } else {
                    estacion = "otoño";
                }
                break;
            case 10:
                estacion = "otoño";
                break;
            case 11:
                estacion = "otoño";
                break;
            case 12:
                if (dia < 21) {
                    estacion = "otoño";
                } else {
                    estacion = "invierno";
                }
                break;
            default:
                System.out.println("Estamos en " + estacion);
        }

    }
}
