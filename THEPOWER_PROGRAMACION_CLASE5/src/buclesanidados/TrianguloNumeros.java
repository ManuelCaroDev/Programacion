/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclesanidados;

public class TrianguloNumeros {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) //Este es el primer bucle for, que controla las filas del triángulo
        {
            for (int j = 1; j <= i; j++) //Este bucle controla cuántos números se imprimen en cada fila
            {
                System.out.print(j + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
