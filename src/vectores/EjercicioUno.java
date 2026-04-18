package vectores;

import java.util.Scanner;

public class EjercicioUno {
    /*Llevar a cabo un programa que incluya un vector que almacene los nombres:
    * Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y ludmila.
    * Realizar un recorrido del vector para cargar los datos y
    * otro recorrido para mostrar los mismos por pantalla*/

    public static void main(String[] args) {

        String[] nombres = new String[8];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre que quiera guardar para el indice: " + i);
            nombres[i] = teclado.nextLine();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Indice: " + i + " Nombre guardado: " +  nombres[i]);
        }


    }
}
