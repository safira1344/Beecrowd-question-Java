import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        double[] a = new double[100];

        for (int i = 0; i < 100; i++) {
            a[i] = teclado.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            if (a[i] <= 10.0) {
                System.out.println("A[" + i + "] = " + a[i]);
            }
        }
    }
}