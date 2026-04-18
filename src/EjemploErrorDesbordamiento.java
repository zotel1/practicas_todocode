public class EjemploErrorDesbordamiento {

    public static void main(String[] args) {
        int[] vector = new int[3];

        vector[0] = 1;
        vector[1] = 35;
        vector[2] = 13;

        // El error sucede cuando queremos acceder a un indice que no existe
        //System.out.println("El error de la 3ra posicion es: " + vector[4]);

        // Error por desbordamiento
        for (int i = 0; i < 4; i++) {
            System.out.println("Valor: " + vector[i]);
        }
    }
}
