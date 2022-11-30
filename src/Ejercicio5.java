import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Variables de tipo int para pedirla al usuario 
        int cantidad, minimo, maximo;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.println("Deme la cantidad de veces : ");
        cantidad = key.nextInt();
        System.out.println("Deme el rango mínimo: ");
        minimo = key.nextInt();
        System.out.println("Deme el rango máximo: ");
        maximo = key.nextInt();

        // Imprimimos las funciones
        Funciones.numerosAleatorios(cantidad);
        System.out.println("----------------------------");
        Funciones.numerosAleatorios(cantidad,maximo);
        System.out.println("----------------------------");
        Funciones.numerosAleatorios(cantidad,maximo,minimo);

        // Cerramos escaner
        key.close();
    }

}
