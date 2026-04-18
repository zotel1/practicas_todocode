package vectores;

import java.util.Scanner;

public class EjercicioIntegradorMatrices {
    /*En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundario.
     * Cada fila corresponde a las notas de cada alumno*/

    public static void main(String[] args) {

        double[][] notas = new double[4][3];
        Scanner teclado = new Scanner(System.in);

        double[] promedios = new double[4];
        double total;

        double promedio = 0;

        // cargamos la matriz
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las 3 notas del alumno separadas por un ENTER: ");
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = teclado.nextDouble();
            }
        }
        // Calculamos promedios
        for (int i = 0; i < notas.length; i++) {
            total = 0;
            for (int j = 0; j < notas[0].length; j++) {
                total = total + notas[i][j];
            }
            promedio = total / notas[0].length;
            promedios[i] = promedio;
        }

        // Mostramos promedios
        System.out.println("---------------------------------- PROMEDIOS ----------------------------------");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Las notas del alumno numero: "+ (i +1) + " son: ");
            for (int j = 0; j < notas[0].length; j++) {
                System.out.println(notas[i][j]);
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
    }

}
