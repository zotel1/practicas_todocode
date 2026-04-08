import java.util.Scanner;

public class EjercicioIf {

    public static void main(String[] args) {
        int edad;
        String nombre;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre");

        nombre =  teclado.next();

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();


        if (edad > 18) {
            System.out.println("Felicidades " + nombre + " sos mayor de edad");
        } else {
            if (edad == 18) {
                System.out.println("Felicidades " + nombre + " sos mayor y tenes " +  edad + "años");
            }
            else
                System.out.println(nombre + "No podes acceder :/... " +  " sos menor de edad");
        }

    }
}
