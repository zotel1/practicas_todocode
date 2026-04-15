import java.util.Scanner;

public class EjemploIncremento {

    public static void main(String[] args) {

        // Merceria mayorista --> vende al por mayor
        // Menos de cinco paquetes NO VENDE
        // ENtre 5 y 15 sale 10 USD el envio
        // Más de 15 el envio es gratis

        int cantidadPaquetes;
        double montoTotal;
        double diferencia;
        double descuento;
        double totalConDescuento;

        Scanner teclado = new Scanner(System.in);

        // Preguntamos por teclado cuantos paquetes son
        System.out.println("Ingrese el cantidad de paquetes: ");
        cantidadPaquetes = teclado.nextInt();



        // Evaluamos los posibles casos
        if (cantidadPaquetes <= 5) {
            System.out.println("No se permiten ventas minoristas (catidad de paquetes menor a 5)");
        } else {

            System.out.println("Preguntamos por el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();
            if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15) {

                System.out.println("El costo de envio es de 10 USD");
                montoTotal = montoTotal + 10;
            } else {
                System.out.println("Usted no tiene costo de envio. ¡Muchas gracias por su compra!");
            }
            if(montoTotal < 100) {
                diferencia = 100 - montoTotal;

                System.out.println("El monto es menor a 100 USD por lo que no posee promociones. Necesita comprar: " + diferencia + "USD para entrar en promo.");
            }
            else {
                if (montoTotal >= 100 &&  montoTotal <= 300) {

                    descuento = montoTotal * 0.05;
                    totalConDescuento = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 5% que equivale a: " + descuento + " pesos. El monto total con descuento es de: " + totalConDescuento + "USD." );
                }
                else {

                    descuento = montoTotal * 0.1;
                    totalConDescuento = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 10% que equivale a: " + descuento + " pesos. El monto total con descuento es de: " + totalConDescuento + "USD." );

                }

            }
        }
    }
}
