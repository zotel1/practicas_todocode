import java.util.Scanner;

public class EjemploWhileEjercicioCinco {

    public static void main(String[] args) {

        String palabra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la palabra que quiera por teclado: ");
        palabra = teclado.nextLine();

        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es: " +  palabra);
            teclado = new Scanner(System.in);
            System.out.println("Ingrese nuevamente la palabra que quiera por teclado: ");
            System.out.println("Si quiere terminar la aplicación escriba [salir]");
            palabra = teclado.nextLine();

        }
        System.out.println("Fin de la aplicación...");
    }
}
