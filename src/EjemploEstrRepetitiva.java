public class EjemploEstrRepetitiva {
    // realiza un programa que muestre en pantalla los numeros del 1 al 35 (uno abajo de otro).

    public static void main(String[] args) {

        System.out.println("Solucion con for: ");
        for (int i = 0; i < 35; i++) {
            System.out.println(i + 1);
        }

        System.out.println("Solucion con while: ");
        int cont = 0;
        while (cont < 35) {
            System.out.println(cont + 1);
            cont += 1;
        }
    }
}
