import java.util.Scanner;

public class SistemaDatosBasicos {

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

    System.out.print("Ingrese un numero decimal: ");
    double decimal1 = scanner.nextDouble();

    System.out.print("De nuevo ingresa otro numero decimal: ");
    double decimal2 = scanner.nextDouble();

    System.out.println("Int: " + nuemoEntero);
    System.out.println("byte: " + byteEntero);
    System.out.println("Short: " + shortentero);
    System.out.println("Long: " + longEntero);

    if (decimal1 > decimal2) {
      System.out.println("El primer numero decimal es mayor");
    } else if (decimal1 < decimal2) {
      System.out.println("El segundo numero decimal es mayor");
    } else {
      System.out.println("Los dos numeros decimales son iguales");}

    boolean esMayor = nuemoEntero > byteEntero;

    if (esMayor){
      System.out.println("El primer numero entero es mayor");
    } else {   
      System.out.println("El segundo numero entero es mayor");} 

    scanner.close();

  }
}