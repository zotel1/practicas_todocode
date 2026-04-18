package vectores;

import java.util.Scanner;

public class EjercicioCuatro {
    /*Un empleado desea almacenar en un vector sus 12 sueldos del año
    * A partir de esto, necesita un programa que determine y muestre por pantalla
    * la suma total de sus 12 sueldos y el promedio de sueldos que tuvo en el año.*/

    public static void main(String[] args) {

        double[] sueldos = new double[12];
        Scanner teclado = new Scanner(System.in);
        //variable auxiliar
        double suma = 0;
        double promedio = 0;

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el sueldo del mes: ");
            sueldos[i] = teclado.nextDouble();
            suma = suma + sueldos[i];
        }

        promedio = suma / sueldos.length;
        System.out.println("La suma de todos los sueldos del año es de: " + suma + " dolares.");
        System.out.println("El promedio de los sueldos es de: " + promedio + " dolares.");

    }

}
