
package ejerciciosClase20_11_24;


import java.util.Scanner;



public class triangulos {
    
    public static void main(String [] args){
        
        //comprobar que es uyn triangulo
        
        //comprobar que tipo de triangulo es. equilatero todos los lados iguales, isosceles = dos lados iguales, escaleno
        
        
        /*
            inicio
                1ªpedir lado 1
                2. pedir lado 2
                3. pedir lado 3
                4. comprobar si los 3 lados hacen un triangulo  if (lado1+lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
                5. comprobar que triangulo es
                6. si lado1 = lado2 = lado3 --> equitlatero
                7. si lado1 = lado2 o lado1 = lado 3 o lado2 = lado3 --> isosceles
                8. si no se cumple ninguno escribir Escaleno
        */
        
        float lado1, lado2, lado3;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Introduzca los cm de lado1");
        lado1 = scn.nextFloat();
        
        System.out.println("Introduzca los cm de lado2");
        lado2 = scn.nextFloat();
        
        System.out.println("Introduzca los cm de lado3");
        lado3 = scn.nextFloat();
        
        
        if((lado1+lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("El triangulo es equilatero");
            }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("El triangulo es isosceles");
            }else{
                System.out.println("El triangulo es Escaleno");
            }
        }
    }


    
}
