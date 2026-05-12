package estructuraRepetitiva;

public class EjercicioTres {
    public static void main(String[] args) {
        /**
         * Realizar un programa que muestre por pantalla los números
         * del 200 al 250 saltando de 2 en 2.
         * La secuencia deberia ser: 200...202...204...etc.*/

        int cont = 200;

        while (cont < 251) {
            System.out.println(cont);
            cont = cont + 2;
        }
    }
}
