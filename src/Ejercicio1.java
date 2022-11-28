import java.util.Scanner;

public class Ejercicio1 {
    // Creamos función de tipo int le pedimos dos valores de tipo int y devolvemos
    // la suma de ellos
    static int suma(int num1, int num2) {
        return num1 + num2;
    }
    // Creamos función de tipo double le pedimos dos valores de tipo double y devolvemos
    // la suma de ellos
    static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Creamos variables de tipo int
        int num1int, num2int;
        // Creamos variables de tipo double
        double num1double, num2double;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos variables al usuario de tipo int y double
        System.out.println("Deme dos variables de tipo int: ");
        num1int = key.nextInt();
        num2int = key.nextInt();
        System.out.println("Deme dos variables de tipo double: ");
        num1double = key.nextDouble();
        num2double = key.nextDouble();

        // Imprimimos el resultado de cada una de las funciones
        System.out.println("El resultado de tipo integer es: " + suma(num1int, num2int));
        System.out.println("El resultado de tipo integer es: " + suma(num1double, num2double));
    }

}
