import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int[] n = new int[20];
        int aux = 0;

        for (int i = 0; i < 20; i++) {
            n[i] = teclado.nextInt();
        }

        for (int i = 0; i < (n.length / 2); i++) {
            aux = n[i];
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = aux;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}