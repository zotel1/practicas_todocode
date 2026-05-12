package estructuraRepetitiva;

import java.util.Scanner;

/**
 * realizar un programa que dado por teclado uin limite numerico
 * por teclado(por ejemplo 100) muestre en pantalla todos los numeros hasta ese limite (empezando por 1).*/
public class EjemploDos {

    public static void main(String[] args) {
        // tenemos un limite hasta el que tenemos que contar
        // ingresar ese limite
        Scanner teclado = new Scanner(System.in);
        int limite;
        int cont = 1;

        System.out.println("Ingrese el límite hasta el que quiere contar: ");
        limite = teclado.nextInt();

        while (cont <= limite) {
            System.out.println(cont);
            cont++;
        }
    }
}
