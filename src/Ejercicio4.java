import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Variable de tipo int para pedirla al usuario
        int num1;
        // Variable de tipo String para pedirla al usuario;
        String condicion;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.println("Deme un 0 o un 1: ");
        num1 = key.nextInt();
        System.out.println("Deme true o false: ");
        condicion = key.next();

        // Comprobamos que han pasado los parámetros correctos
        if ((num1 == 0 || num1 == 1) && (condicion.equals("true") || condicion.equals("false"))) {
            // Imprimimos resultado llamando a las funciones de la clase Funciones
            System.out.println("El resultado es " + Funciones.parseToBoolean(num1));
            System.out.println("El resultado es " + Funciones.parseToBoolean(condicion));
        } else {
            System.out.println("Los parámetros no son correctos");
        }
        // Cerramos escaner
        key.close();
    }

}
