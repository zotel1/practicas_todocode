import java.util.Scanner;

public class EjemploMatrices {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[][] matrizCuadrada = new int[3][3];

        System.out.println("Primero se completa el segundo bucle, el de las columnas" +
                "ya que estamos parados en el bucle de las filas hasta que el segundo bucle se complete");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para la fila i: " + i + " y para la columna j: " + j);
                matrizCuadrada[i][j] = teclado.nextInt();

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Fila i: " + i + " Columna j: " + j + " Valor: " + matrizCuadrada[i][j]);
            }
        }

    }
}
