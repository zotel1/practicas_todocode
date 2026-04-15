import java.util.Scanner;

public class EjemploWhileCentilena {
    public static void main(String[] args) {

        boolean bandera  = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        while (bandera == true) {
            System.out.println("El valor de mi bandera es: " + bandera);

            System.out.println("Queres que el bucle termine? presiona [si]");
            respuesta = teclado.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("El bucle finalizo!");
                bandera = false;
            }
        }
    }
}
