import java.util.Scanner;

public class Ejercicio2 {
    // Creamos función de tipo int le pedimos dos valores de tipo int y devolvemos
    // la suma de ellos y lo dividimos entre dos para hacer la media
    static double media(int num1, int num2) {
        // Al devolver el valor hacemos un cast de tipo int para que salga con decimales
        return (double)(num1 + num2) / 2;
    }
    // Creamos función de tipo int le pedimos tres valores de tipo int y devolvemos
    // la suma de ellos entre 3 para hacer la media
    static double media(int num1, int num2, int num3) {
        // Al devolver el valor hacemos un cast de tipo int para que salga con decimales
        return (double)(num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        // Creamos variables de tipo int para la primera función
        int num1int, num2int;
        // Creamos variables de tipo int para la segunda función
        int num1,num2,num3 ;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos variables al usuario de tipo int y double
        System.out.println("Deme dos números para hacer su media: ");
        num1int = key.nextInt();
        num2int = key.nextInt();
        System.out.println("Deme tres números para hacer su media: ");
        num1 = key.nextInt();
        num2 = key.nextInt();
        num3 = key.nextInt();

        // Imprimimos el resultado de cada una de las funciones
        System.out.printf("El resultado de la media de dos números es: %.2f", media(num1int, num2int));
        System.out.println("");
        System.out.printf("El resultado de la media de tres números es: %.2f", media(num1, num2, num3));
    
        // Cerramos escaner
        key.close();
    }

}
