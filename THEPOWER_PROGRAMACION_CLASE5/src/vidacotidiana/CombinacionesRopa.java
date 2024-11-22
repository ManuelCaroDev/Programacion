/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidacotidiana;

public class CombinacionesRopa {
    public static void main(String[] args) {
        for (int camisa = 1; camisa <= 3; camisa++) {
            String tipoCamisa = "";
            switch (camisa) {
                case 1: tipoCamisa = "Camisa Roja"; break;
                case 2: tipoCamisa = "Camisa Azul"; break;
                case 3: tipoCamisa = "Camisa Verde"; break;
            }

            for (int pantalon = 1; pantalon <= 2; pantalon++) {
                String tipoPantalon = (pantalon == 1) ? "Pantalón Negro" : "Pantalón Beige";
                System.out.println("Combinación: " + tipoCamisa + " y " + tipoPantalon);
            }
        }
    }
}
