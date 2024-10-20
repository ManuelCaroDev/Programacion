import java.util.Scanner;

public class SistemaDatosBasicos {

  // Ejercicio numero 1

  // • Pedir al usuario que ingrese números enteros y mostrar los valores de
  // variables tipo byte, short, int y long.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese su primer numero entero: ");
    int nuemoEntero = scanner.nextInt();

    System.out.print("Ingrese su segundo numero entero: ");
    byte byteEntero = scanner.nextByte();

    System.out.print("Ingrese su tercer numero entero: ");
    short shortentero = scanner.nextShort();

    System.out.print("Ingrese su cuarto numero entero: ");
    long longEntero = scanner.nextLong();

    System.out.println("Int: " + nuemoEntero);
    System.out.println("byte: " + byteEntero);
    System.out.println("Short: " + shortentero);
    System.out.println("Long: " + longEntero);

    // • Solicitar al usuario que ingrese dos números decimales y verificar cuál es
    // mayor o si son iguales.

    System.out.print("Ingrese un numero decimal: ");
    double decimal1 = scanner.nextDouble();

    System.out.print("De nuevo ingresa otro numero decimal: ");
    double decimal2 = scanner.nextDouble();

    if (decimal1 > decimal2) {
      System.out.println("El primer numero decimal es mayor");
    } else if (decimal1 < decimal2) {
      System.out.println("El segundo numero decimal es mayor");
    } else {
      System.out.println("Los dos numeros decimales son iguales");
    }

    // • Verificar si un número ingresado por el usuario es mayor que otro usando
    // una condición booleana.

    boolean esMayor = nuemoEntero > byteEntero;

    if (esMayor) {
      System.out.println("El primer numero entero es mayor");
    } else {
      System.out.println("El segundo numero entero es mayor");
    }

    // • Mostrar el valor de una constante predefinida.• Mostrar el valor de una
    // constante predefinida.

    final double Pi = 3.14159;
    System.out.println("El valor de Pi es" + Pi);

    // • Pedir una nota al usuario y clasificarla usando un if-else.

    System.out.println("Por favor introduzca su nota del 1 al 10: ");
    int nota = scanner.nextInt();

    if (nota == 0 || nota == 1 || nota == 2 || nota == 3 || nota == 4) {
      System.out.println("Usted a suspendido");
    } else if (nota == 5 || nota == 6) {
      System.out.println("A sacado un suficiente");
    } else if (nota == 7 || nota == 8) {
      System.out.println("A sacado un notable");
    } else if (nota == 9 || nota == 10) {
      System.out.println("A sacado un sobresaliente");
    }

    // • Pedir un día de la semana (número) y mostrar el día correspondiente con
    // switch.

    System.out.println("Ingresa un numero del 1 al 7 y te dire a que dia de la semana corresponde; ");
    int diaSemana = scanner.nextInt();

    switch (diaSemana) {

      case 1:
        System.out.println("Es lunes");

        break;

      case 2:
        System.out.println("Es Martes");

        break;

      case 3:
        System.out.println("Es Miercoles");

        break;

      case 4:
        System.out.println("Es Jueves");

        break;

      case 5:
        System.out.println("Es Viernes");

        break;

      case 6:
        System.out.println("Es Sabado");

        break;

      case 7:
        System.out.println("Es Domingo");

        break;

      default:
        System.out.println("Parece que has dicho un numero incorrecto");
    }

    scanner.close();

  }
}