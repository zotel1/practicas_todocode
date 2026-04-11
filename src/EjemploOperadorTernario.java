import java.util.Scanner;

public class EjemploOperadorTernario {
    public static void main(String[] args) {

        //Programa que dependiendo del promedio de un alumno nos diga si aprobo o no una materia

        // decharacion de promedios
        double promedio;
        String condicionFinal;

        Scanner teclado = new Scanner(System.in);

        // pedirle al usuario que ingrese promedio por teclado
        System.out.println("Ingrese el promedio del alumno: ");
        promedio = teclado.nextDouble();

        condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";

        System.out.println("La condicion final del alumno es: " +  condicionFinal);

    }
}
