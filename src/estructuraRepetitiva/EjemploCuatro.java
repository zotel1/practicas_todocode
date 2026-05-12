package estructuraRepetitiva;

import java.util.Scanner;

public class EjemploCuatro {

    /**
     * En la ciudad de Oberá, Misiones se realiza año a año la "Maraton del Inmigrante"
     * en el marco de la Fiesta Nacional del Inmigrante.
     * El evento cuenta con un dia de inscripciones el dia anterior a la carrera,
     * por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber.
     * Desde la Federación de Colectividades (Organismo que organiza),
     * manifestaron que se solicitan los siguientes datos para la inscripcion de cada participante: dni, nombre y edad.
     * En cuanto a las categorias posibles para una inscripcion, se manejan las siguientes:
     *
     * Menores A (de 6 a 10 años)
     * Menores B (de 11 a 17 años)
     * Juveniles (de 18 a 30 años)
     * Adultos (de 31 a 50 años)
     * Adultos mayores (mayores de 50 años)
     *
     * Se necesita un programa que, a partir del ingreso de los datos
     * y edad de cada participante, se muestre por pantalla a que categoria debe ser inscripto.
     * Cabe destacar que, al finalizar el dia, para dar fin a las inscripciones,
     * se debe ingresar un dni con el valor 0 y un nombre con la palabra "fin".*/

    public static void main(String[] args) {
        // Pedir datos a las personas dni, nombre y edad
        // determinar a que categoria se tiene que inscribir
        // informarle a la persona
        // no sabemos la cantidad de personas

        // dni
        System.out.println("Ingrese el dni de la persona: ");
        Scanner teclado1 = new Scanner(System.in);
        String dni = teclado1.nextLine();

        // nombre
        System.out.println("Ingrese el nombre del persona: ");
        String nombre = teclado1.nextLine();

        // edad
        System.out.println("Ingrese la edad de la persona: ");
        Scanner teclado2 = new Scanner(System.in);
        int edad = teclado2.nextInt();

        while ((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin"))) {
            if (edad >= 6 && edad <= 10) {
                System.out.println("La categoria es Menores A");
            } else {
                if (edad >= 11 && edad <= 17) {
                    System.out.println("La categoria es Menores B");
                } else {
                    if (edad >= 18 && edad <= 30) {
                        System.out.println("La categoria es Juveniles");
                    } else {
                        if (edad >= 31 && edad <= 50) {
                            System.out.println("La categoria es Adultos");
                        } else  {
                            if (edad >= 51) {
                                System.out.println("La categoria es Adultos Mayores");
                            } else {
                                System.out.println("La persona no cuenta con la edad adecuada");
                            }
                        }
                    }
                }
            }
            // dni
            System.out.println("Ingrese el dni de la persona: ");
            dni = teclado1.nextLine();
            // nombre
            System.out.println("Ingrese el nombre del persona: ");
            nombre = teclado1.nextLine();
            // edad
            System.out.println("Ingrese la edad de la persona: ");
            edad = teclado2.nextInt();
        }
    }
}
