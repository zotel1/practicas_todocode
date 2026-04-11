import java.util.Scanner;

public class EjemploIncremento {

    public static void main(String[] args) {

        // Merceria mayorista --> vende al por mayor
        // Menos de cinco paquetes NO VENDE
        // ENtre 5 y 15 sale 10 USD el envio
        // Más de 15 el envio es gratis

        int cantidadPAquetes;
        Scanner teclado = new Scanner(System.in);

        // Preguntamos por teclado cuantos paquetes son
        System.out.println("Ingrese el cantidad de paquetes: ");
        cantidadPAquetes = teclado.nextInt();

        // Evaluamos los posibles casos
        if (cantidadPAquetes <= 5) {
            System.out.println("No se permiten ventas minoristas (catidad de paquetes menor a 5)");
        } else {
            if (cantidadPAquetes >= 5 && cantidadPAquetes <= 15) {
                System.out.println("El costo de envio es de 10 USD");
            } else {
                System.out.println("Usted no tiene costo de envio. ¡Muchas gracias por su compra!");
            }
        }
    }
}
