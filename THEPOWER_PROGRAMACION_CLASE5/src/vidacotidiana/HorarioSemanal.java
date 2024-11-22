/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidacotidiana;

public class HorarioSemanal {
    public static void main(String[] args) {
        int horas = 5; // Horas de actividades por día

        for (int dia = 1; dia <= 7; dia++) {
            switch (dia) {
                case 1: System.out.println("Actividades para Lunes:"); break;
                case 2: System.out.println("Actividades para Martes:"); break;
                case 3: System.out.println("Actividades para Miércoles:"); break;
                case 4: System.out.println("Actividades para Jueves:"); break;
                case 5: System.out.println("Actividades para Viernes:"); break;
                case 6: System.out.println("Actividades para Sábado:"); break;
                case 7: System.out.println("Actividades para Domingo:"); break;
            }

            for (int hora = 1; hora <= horas; hora++) {
                System.out.println("Hora " + hora + ": Actividad " + hora);
            }
            System.out.println(); // Salto de línea entre días
        }
    }
}

