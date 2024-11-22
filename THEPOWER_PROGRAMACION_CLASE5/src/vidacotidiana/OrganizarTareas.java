/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidacotidiana;

public class OrganizarTareas {
    public static void main(String[] args) {
        for (int persona = 1; persona <= 3; persona++) {
            switch (persona) {
                case 1: System.out.println("Tareas para Ana:"); break;
                case 2: System.out.println("Tareas para Carlos:"); break;
                case 3: System.out.println("Tareas para Luis:"); break;
            }

            for (int dia = 1; dia <= 3; dia++) {
                switch (dia) {
                    case 1: System.out.println("Lunes: Completar actividad del día"); break;
                    case 2: System.out.println("Martes: Completar actividad del día"); break;
                    case 3: System.out.println("Miércoles: Completar actividad del día"); break;
                }
            }
            System.out.println(); // Salto de línea entre personas
        }
    }
}

