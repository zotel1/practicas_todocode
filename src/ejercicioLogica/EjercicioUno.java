package ejercicioLogica;

import java.util.Scanner;

/**
 * Realizar un programa que permita el intercambio de valores entre dos variables.
 * Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20,
 * realizar las acciones necesarias para que el numero pase a valer 20 y numero 2 pase a valer 35.
 * Una vez realizado el intercambio mostrar el resultado por pantalla.*/
public class EjercicioUno {

    public static void main(String[] args) {

        int numeroUno, numeroDos, numeroTres, opcion;

        Scanner teclado = new Scanner(System.in);

        numeroUno = 35;
        numeroDos = 20;
        System.out.println("a vale: " + numeroUno);
        System.out.println("b vale: " + numeroDos);
        System.out.println("Elija una opcion: ");
        System.out.println("Si desea que el valor de a cambie a: " + numeroDos + " presione [1]");
        System.out.println("Si desea que el valor de a siga siendo el mismo presione [2]");
        opcion  = teclado.nextInt();

        if (opcion == 1){
            numeroTres = numeroDos;
            numeroUno = numeroTres;

        } else if (opcion == 2){
            numeroUno = numeroUno;
        }

        System.out.println("a vale: " + numeroUno);
    }

}
