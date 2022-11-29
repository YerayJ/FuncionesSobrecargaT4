import java.util.Scanner;

public class Ejercicio3 {
    // Creamos función de tipo int le pedimos un valor de tipo int
    static int sumaEnteros(int num1) {
        // Creamos la variable res para almacenar resultado
        int res = 0;
        // En este bucle vamos desde uno hasta el número pasado
        for (int i = 1; i <= num1; i++) {
            // Por cada vuelta le sumamos i al resultado
            res += i;
        }
        // Devolvemos el resultado total
        return res;
    }

    // Creamos función de tipo int le pedimos dos valores de tipo int
    // Precondición: num1 < num2
    static int sumaEnteros(int num1, int num2) {
        // Creamos la variable res para almacenar resultado
        int res = 0;
        // En este bucle comprobamos cual es el menor para empezar y le sumamos uno ya
        // que solo queremos el rango. Llegará hasta el número mayor entre ellos.
        for (int i = num1 + 1; i < num2; i++) {
            // Por cada vuelta le sumamos i al resultado
            res += i;
        }
        // Devolvemos el resultado total
        return res;
    }

    public static void main(String[] args) {
        // Creamos variable de tipo int para la primera función
        int num1;
        // Creamos variables de tipo int para la segunda función
        int num2, num3;

        // Creamos escaner
        Scanner key = new Scanner(System.in);

        // Pedimos variables al usuario de tipo int y double
        System.out.println("Deme un número: ");
        num1 = key.nextInt();
        System.out.println("Deme dos números: ");
        num2 = key.nextInt();
        num3 = key.nextInt();

        // Imprimimos el resultado de cada una de las funciones
        System.out.println("La suma de 1 hasta " + num1 + " es: " + sumaEnteros(num1));
        System.out.println("La suma de los números comprendidos es: " + sumaEnteros(num2, num3));

        // Cerramos escaner
        key.close();
    }

}
