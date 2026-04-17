public class EjemploForWhile {

    // Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo.
    //La cuenta debe comenzar en 10 y terminar en 1

    public static void main(String[] args) {

        int cont = 10;

        while (cont >= 0) {
            System.out.println(cont );
            cont += -1;
        }
        System.out.println("Feliz año nuevo con while");

        System.out.println("Ejemplo for: ");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Feliz año nuevo con for");
    }
}
