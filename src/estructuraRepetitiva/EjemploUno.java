package estructuraRepetitiva;

public class EjemploUno {

    public static void main(String[] args) {

        int cont = 0;
        int contDos = 0;

        System.out.println("Inicio bucle While: ");
        while (cont <= 10) {
            System.out.println("Estoy en la vuelta " + cont);

            cont++;
        }

        System.out.println("Fin bucle While...");

        System.out.println("Inicio bucle for: ");


        for (contDos = 0; contDos <= 10; contDos++) {
            System.out.println("Estoy en la vuelta " + contDos);
        }
    }
}
