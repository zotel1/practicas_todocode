package vectores;

import java.util.Scanner;

public class EjercicioDos {

    /*Realizar un programa que permita la carga de 10 números en un vector.
    * Una vez cargados, se necesita que el programa determine cual es el mayor y cual es el menor de ellos.*/

    public static void main(String[] args) {

        int[] numeros = new int[4];
        int numeroMayor = 0;
        int numeroMenor = 1000000000;

        Scanner teclado  = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero que quiere cargar en la posicion: " + i);
            numeros[i] = teclado.nextInt();

        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + numeroMayor);
        System.out.println("El menor es: " + numeroMenor);
    }
}
