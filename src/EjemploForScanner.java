import java.util.Scanner;

public class EjemploForScanner {

    public static void main(String[] args) {

        /*Realizar un programa que dado por teclado un limite numeroco (por ejemplo 100)
        * muestre en pantalla todos los números hasta ese limite (empezando por 1)
        * */

        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese por teclado el limite : ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
