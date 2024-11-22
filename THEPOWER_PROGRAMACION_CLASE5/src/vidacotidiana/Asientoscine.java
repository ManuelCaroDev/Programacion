
package vidacotidiana;
import java.util.Scanner;

public class Asientoscine{
    public static void main(String[] args) {
        // Definir cada asiento como una variable booleana
        boolean asiento1_1 = false, asiento1_2 = false, asiento1_3 = false, asiento1_4 = false;
        boolean asiento2_1 = false, asiento2_2 = false, asiento2_3 = false, asiento2_4 = false;
        boolean asiento3_1 = false, asiento3_2 = false, asiento3_3 = false, asiento3_4 = false;
        boolean asiento4_1 = false, asiento4_2 = false, asiento4_3 = false, asiento4_4 = false;
        boolean asiento5_1 = false, asiento5_2 = false, asiento5_3 = false, asiento5_4 = false;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el estado de los asientos usando bucles anidados
            System.out.println("\nMapa de asientos:");
            for (int fila = 1; fila <= 5; fila++) {
                System.out.print("Fila " + fila + ": ");
                for (int columna = 1; columna <= 4; columna++) {
                    // Obtener el estado de cada asiento según su fila y columna
                    boolean ocupado = false;
                    if (fila == 1 && columna == 1) ocupado = asiento1_1;
                    else if (fila == 1 && columna == 2) ocupado = asiento1_2;
                    else if (fila == 1 && columna == 3) ocupado = asiento1_3;
                    else if (fila == 1 && columna == 4) ocupado = asiento1_4;
                    else if (fila == 2 && columna == 1) ocupado = asiento2_1;
                    else if (fila == 2 && columna == 2) ocupado = asiento2_2;
                    else if (fila == 2 && columna == 3) ocupado = asiento2_3;
                    else if (fila == 2 && columna == 4) ocupado = asiento2_4;
                    else if (fila == 3 && columna == 1) ocupado = asiento3_1;
                    else if (fila == 3 && columna == 2) ocupado = asiento3_2;
                    else if (fila == 3 && columna == 3) ocupado = asiento3_3;
                    else if (fila == 3 && columna == 4) ocupado = asiento3_4;
                    else if (fila == 4 && columna == 1) ocupado = asiento4_1;
                    else if (fila == 4 && columna == 2) ocupado = asiento4_2;
                    else if (fila == 4 && columna == 3) ocupado = asiento4_3;
                    else if (fila == 4 && columna == 4) ocupado = asiento4_4;
                    else if (fila == 5 && columna == 1) ocupado = asiento5_1;
                    else if (fila == 5 && columna == 2) ocupado = asiento5_2;
                    else if (fila == 5 && columna == 3) ocupado = asiento5_3;
                    else if (fila == 5 && columna == 4) ocupado = asiento5_4;

                    // Mostrar el estado del asiento
                    System.out.print((ocupado ? "Ocupado" : "Libre") + " ");
                }
                System.out.println();
            }

            // Preguntar al usuario si desea asignar o liberar un asiento
            System.out.println("\n¿Desea asignar o liberar un asiento? (escriba 'asignar', 'liberar' o 'salir'):");
            String accion = scanner.next().toLowerCase();

            if (accion.equals("salir")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese el número de fila (1 a 5): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese el número de asiento (1 a 4): ");
            int columna = scanner.nextInt();

            // Validar la entrada
            if (fila < 1 || fila > 5 || columna < 1 || columna > 4) {
                System.out.println("Número de fila o asiento inválido.");
                continue;
            }

            // Obtener el estado actual del asiento
            boolean ocupado = false;
            if (fila == 1 && columna == 1) ocupado = asiento1_1;
            else if (fila == 1 && columna == 2) ocupado = asiento1_2;
            else if (fila == 1 && columna == 3) ocupado = asiento1_3;
            else if (fila == 1 && columna == 4) ocupado = asiento1_4;
            else if (fila == 2 && columna == 1) ocupado = asiento2_1;
            else if (fila == 2 && columna == 2) ocupado = asiento2_2;
            else if (fila == 2 && columna == 3) ocupado = asiento2_3;
            else if (fila == 2 && columna == 4) ocupado = asiento2_4;
            else if (fila == 3 && columna == 1) ocupado = asiento3_1;
            else if (fila == 3 && columna == 2) ocupado = asiento3_2;
            else if (fila == 3 && columna == 3) ocupado = asiento3_3;
            else if (fila == 3 && columna == 4) ocupado = asiento3_4;
            else if (fila == 4 && columna == 1) ocupado = asiento4_1;
            else if (fila == 4 && columna == 2) ocupado = asiento4_2;
            else if (fila == 4 && columna == 3) ocupado = asiento4_3;
            else if (fila == 4 && columna == 4) ocupado = asiento4_4;
            else if (fila == 5 && columna == 1) ocupado = asiento5_1;
            else if (fila == 5 && columna == 2) ocupado = asiento5_2;
            else if (fila == 5 && columna == 3) ocupado = asiento5_3;
            else if (fila == 5 && columna == 4) ocupado = asiento5_4;

            // Asignar o liberar el asiento según la acción
            if (accion.equals("asignar")) {
                if (!ocupado) {
                    if (fila == 1 && columna == 1) asiento1_1 = true;
                    else if (fila == 1 && columna == 2) asiento1_2 = true;
                    else if (fila == 1 && columna == 3) asiento1_3 = true;
                    else if (fila == 1 && columna == 4) asiento1_4 = true;
                    else if (fila == 2 && columna == 1) asiento2_1 = true;
                    else if (fila == 2 && columna == 2) asiento2_2 = true;
                    else if (fila == 2 && columna == 3) asiento2_3 = true;
                    else if (fila == 2 && columna == 4) asiento2_4 = true;
                    else if (fila == 3 && columna == 1) asiento3_1 = true;
                    else if (fila == 3 && columna == 2) asiento3_2 = true;
                    else if (fila == 3 && columna == 3) asiento3_3 = true;
                    else if (fila == 3 && columna == 4) asiento3_4 = true;
                    else if (fila == 4 && columna == 1) asiento4_1 = true;
                    else if (fila == 4 && columna == 2) asiento4_2 = true;
                    else if (fila == 4 && columna == 3) asiento4_3 = true;
                    else if (fila == 4 && columna == 4) asiento4_4 = true;
                    else if (fila == 5 && columna == 1) asiento5_1 = true;
                    else if (fila == 5 && columna == 2) asiento5_2 = true;
                    else if (fila == 5 && columna == 3) asiento5_3 = true;
                    else if (fila == 5 && columna == 4) asiento5_4 = true;
                    System.out.println("Asiento asignado correctamente.");
                } else {
                    System.out.println("Ese asiento ya está ocupado.");
                }
            } else if (accion.equals("liberar")) {
                if (ocupado) {
                    if (fila == 1 && columna == 1) asiento1_1 = false;
                    else if (fila == 1 && columna == 2) asiento1_2 = false;
                    else if (fila == 1 && columna == 3) asiento1_3 = false;
                    else if (fila == 1 && columna == 4) asiento1_4 = false;
                    else if (fila == 2 && columna == 1) asiento2_1 = false;
                    else if (fila == 2 && columna == 2) asiento2_2 = false;
                    else if (fila == 2 && columna == 3) asiento2_3 = false;
                    else if (fila == 2 && columna == 4) asiento2_4 = false;
                    else if (fila == 3 && columna == 1) asiento3_1 = false;
                    else if (fila == 3 && columna == 2) asiento3_2 = false;
                    else if (fila == 3 && columna == 3) asiento3_3 = false;
                    else if (fila == 3 && columna == 4) asiento3_4 = false;
                    else if (fila == 4 && columna == 1) asiento4_1 = false;
                    else if (fila == 4 && columna == 2) asiento4_2 = false;
                    else if (fila == 4 && columna == 3) asiento4_3 = false;
                    else if (fila == 4 && columna == 4) asiento4_4 = false;
                    else if (fila == 5 && columna == 1) asiento5_1 = false;
                    else if (fila == 5 && columna == 2) asiento5_2 = false;
                    else if (fila == 5 && columna == 3) asiento5_3 = false;
                    else if (fila == 5 && columna == 4) asiento5_4 = false;
                    System.out.println("Asiento liberado correctamente.");
                } else {
                    System.out.println("Ese asiento ya está libre.");
                }
            } else {
                System.out.println("Acción no válida.");
            }
        }

        scanner.close(); // Cerrar el scanner al final del programa
    }
}
