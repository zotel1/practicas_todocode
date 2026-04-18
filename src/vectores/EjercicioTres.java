package vectores;

import java.util.Scanner;

public class EjercicioTres {

    /*Realizar un programa que permita la carga de 15 números en un vector.
    * Una vez cargados, se necesita que el programa cuente e informe por pantalla cuantas veces se cargo el número 3.
    * */
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);
        int contadorTres = 0;

        // Cargamos los numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero para el indice: " + i);
            numeros[i] = teclado.nextInt();
        }

        // Mostramos los numeros
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 3){
                contadorTres = contadorTres + 1;
            }
        }
        System.out.println("La cantidad de numeros 3 es: " +  contadorTres);
    }
}
