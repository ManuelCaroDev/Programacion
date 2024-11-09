package ejercicio_tutoria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        float sumaPositivo = 0;
        float contadorPositivo = 0;
        float sumaNegativo = 0;
        float contadorNegativo = 0;
        float contador = 0;
        float notaMaxima = -10;
        float notaMinima = 10;

        while (contador < 5) {
            System.out.println("Introduce una calificación de -10 a 10: ");
            float calificacion = scr.nextFloat();

            if (calificacion == -10 && contador == 0) {
                System.out.println("Cerrando sesión");
                break;
            }
            if (calificacion >= 0 && calificacion <= 10) {
                contadorPositivo++;
                sumaPositivo += calificacion;
                if (calificacion >= notaMaxima) {
                    notaMaxima = calificacion;
                }
                if (calificacion <= notaMinima) {
                    notaMinima = calificacion;
                }
            }
            if (calificacion < 0 && calificacion >= -10) {
                contadorNegativo++;
                sumaNegativo += calificacion;
                if (calificacion >= notaMaxima) {
                    notaMaxima = calificacion;
                }
                if (calificacion <= notaMinima) {
                    notaMinima = calificacion;
                }
            }

            if (calificacion == -10 && contador >= 1) {

                break;
            }
            if (calificacion > 10 || calificacion < -9) {
                System.out.println("Calificacion incorrecta, introduzca una nota correcta!");
                contador--;

            }

            contador++;

            if (contador == 5) {
                System.out.println("Ya se han ingresado 5 calificaciones");
            }
        }

        float notaMedia = (sumaPositivo + sumaNegativo) / contador;
        float notaMediaPositivos = sumaPositivo / contadorPositivo;
        float notaMediaNegativos = sumaNegativo / contadorNegativo;

        if (contador > 0) {
            System.out.println("Su nota media es: " + notaMedia);
            System.out.println("Su nota mas alta es: " + notaMaxima);
            System.out.println("Su nota mas baja es: " + notaMinima);
            if (contadorPositivo == 0) {
                System.out.println("No hay calificaciones Positivas");
            } else {
                System.out.println("Su nota media positivos es: " + notaMediaPositivos);
                System.out.println("Su numero de notas positivas es: " + contadorPositivo);
            }

            if (contadorNegativo == 0) {
                System.out.println("No hay calificaciones Negativas");
            } else {
                System.out.println("Su nota media negativos es: " + notaMediaNegativos);
                System.out.println("Su numero de notas negativas es: " + contadorNegativo);
            }
        }

    }

}
