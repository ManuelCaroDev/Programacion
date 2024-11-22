/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclesanidados;

public class PatronAsteriscos {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)//filas que se ejecutan
        {
            for (int j = 1; j <= 5; j++) //número de asteriscos que se imprimen en cada fila.
            {
                System.out.print("* ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
