import java.util.Scanner;

public class EjemploVectores {

    public static void main(String[] args) {

        int numeros [] = new int[8];

        numeros[0] = 14;
        numeros[1] = 53;
        numeros[2] = 21;
        numeros[3] = 11;
        numeros[4] = 32;
        numeros[5] = 23;
        numeros[6] = 42;
        numeros[7] = 63;

        int[] numeroEntrada = new int[8];
        Scanner teclado = new Scanner(System.in);


        System.out.println("mostramos el elemento de la quinta posicion: " + numeros[4]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Estoy en el indice: " + i + " y el elementos de mi Array: "  + numeros[i]);
        }

        // carga mas recorrido de datos
        for  (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor para el indice: " + i);
            numeroEntrada[i] = teclado.nextInt();
        }
        System.out.println("Los valores ingresados fueron: ");

        // recorrido y muestra de datos
        for (int i = 0; i < numeroEntrada.length; i++) {
            System.out.println("Indice: "+ i + " su valor es: " + numeroEntrada[i]);
        }

    }
}
