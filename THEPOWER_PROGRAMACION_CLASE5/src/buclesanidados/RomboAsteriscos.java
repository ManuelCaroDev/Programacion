/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclesanidados;

public class RomboAsteriscos {
    public static void main(String[] args) {
        int altura = 6; // Ajusta esta variable para cambiar el tamaño del rombo

        // Parte superior del rombo (triángulo normal)
        for (int i = 1; i <= altura; i++) {
            // Espacios para alinear el triángulo a la derecha
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }

            // Asteriscos para formar la parte superior del rombo
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Parte inferior del rombo (triángulo invertido)
        for (int i = altura - 1; i >= 1; i--) {
            // Espacios para alinear el triángulo a la derecha
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }

            // Asteriscos para formar la parte inferior del rombo
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
