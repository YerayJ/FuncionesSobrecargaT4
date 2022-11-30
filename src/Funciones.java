
public class Funciones {

    // Resultado en variable booleana la inicializamos en true.
    // parseToBoolean
    static boolean res = true;

    // Precondición num = 0 || num = 1 
    static boolean parseToBoolean(int num1) {
        // Si num1 es 0 el valor de res cambia a false
        if (num1 == 0) {
            res = false;
        }
        // Devolvemos el resultado
        return res;
    }  

        // Precondición condicion = true || condicion = false 
        static boolean parseToBoolean(String condicion) {
            // Si condicion es 0 el valor de res cambia a false
            if (condicion.equals("false")) {
                res = false;
            }
            // Devolvemos el resultado
            return res;
        }  

}
