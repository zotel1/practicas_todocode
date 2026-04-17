import java.util.Scanner;

public class EjercicioEstacionamiento {

    public static void main(String[] args) {
        /*Un administrador de un estacionamiento necesita un programa que permita calcular el total a pagar de varios clientes
        * que utilizan el servicio.
        * El programa debe solicitar por teclado dos datos:
        * La patente del vehiculo
        * El tipo de estacionamiento
        *
        * Los tipos de estacionamientos disponibles son 3:
        * Por hora (cuyo valor es de $3 USD por hora)
        * Media jornada (cuyo valor total es de $15 USD y posee 5% de descuento)
        * Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento)
        *
        * El programa debe calcular el monto a pagar para cada cliente en funcion del tipo
        * de estacionamiento seleccionado. La carga de datos debe continuar hasta que el usuario ingrese la palabra "FIN"
        * en lugar de la patente
        *
        * Al finalizar el programa debe mostrar por pantalla
        * La cantidad total de estacionamientos por hora
        * La cantidad total de estacionamientis de media jornada
        * La cantitad total de estacionamientos de jornada completa
        * La suma total de ingresos en USD que hubo durante el dia*/

        String patente = "";
        int tipoServicio;
        int cantHoras;
        Scanner tecladoHoras = new Scanner(System.in);
        Scanner tecladoStr = new Scanner(System.in);
        Scanner tecladoEnt =  new Scanner(System.in);
        double total;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        double totalDia= 0;


        while (!patente.equalsIgnoreCase("fin")) {
            System.out.println("Ingrese la patente de su vehiculo: ");
            patente = tecladoStr.nextLine();
            if (!patente.equalsIgnoreCase("fin")) {

                System.out.println("Ingrese el tipo de servicio: ");
                System.out.println("1- Por hora");
                System.out.println("2- Media Jornada (5 horas");
                System.out.println("3- Jornada Completa (10 horas)");
                tipoServicio = tecladoEnt.nextInt();

                if (tipoServicio <= 0 || tipoServicio > 3) {
                    System.out.println("No ingreso un tipo de servicio correcto!");
                } else {
                    if (tipoServicio == 1) {
                        System.out.println("Ingrese la cantidad de horas que desea estacionar");
                        cantHoras = tecladoHoras.nextInt();
                        total = cantHoras * 3;
                        System.out.println("El total de su estacionamiento es: " + total);
                        cont1 = cont1 + 1;
                        totalDia = totalDia + total;
                    } else {
                        if (tipoServicio == 2) {
                            System.out.println("El servicio de media jornada corresponde a 6 horas y posee un descuento del 5%");
                            total = 15 - (15 * 0.05);
                            System.out.println("El total de su estacionamiento es: " + total);
                            cont2 = cont2 + 1;
                            totalDia = totalDia + total;
                        } else {
                            System.out.println("El servicio de jornada completa corresponde a 10 horas y posee un descuento del 10%");
                            total = 30 - (30 * 0.10);
                            System.out.println("El total de su estacionamiento es: " + total);
                            cont3 = cont3 + 1;
                            totalDia = totalDia + total;
                        }
                    }
                }
                System.out.println("******************* MUCHAS GRACIAS POR SU COMPRA *******************");
                tecladoStr = new Scanner(System.in);
            }
        }
        System.out.println("===================================================================");
        System.out.println("Totales monetarios del dia");
        System.out.println("Cantidad de servicios por hora: " + cont1);
        System.out.println("Cantidad de servicios media jornada: " + cont2);
        System.out.println("Cantidad de servicios jornada completa: " + cont3);
        System.out.println("El monto total recaudado del dia es de: $" + totalDia + "USD.");

    }
}