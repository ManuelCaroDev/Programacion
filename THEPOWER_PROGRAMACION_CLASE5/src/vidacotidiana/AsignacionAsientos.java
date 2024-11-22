/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidacotidiana;

public class AsignacionAsientos {
    public static void main(String[] args) {
        int filas = 5; // Número de filas
        int asientosPorFila = 10; // Número de asientos por fila

        for (int i = 1; i <= filas; i++) {
            System.out.println("Fila " + i);
            for (int j = 1; j <= asientosPorFila; j++) {
                System.out.print("Asiento " + j + " ");
            }
            System.out.println(); // Salto de línea entre filas
        }
    }
}
