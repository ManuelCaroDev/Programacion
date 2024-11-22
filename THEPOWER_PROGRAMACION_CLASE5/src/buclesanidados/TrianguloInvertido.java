/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclesanidados;

public class TrianguloInvertido {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) //Empieza en 5, para ir restando con i--
        {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");//espacio en el asterisco
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
