public class EjemploDoWhile {

    public static void main(String[] args) {

        int contador = 0;

        do {
            System.out.println("Estoy en la vuelta numero: " + contador);
            contador = contador + 1;
        } while (contador < 10);

    }
}
