import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int numero;
        long[] fib = new long[61];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= 60; i++)
            fib[i] = fib[i - 1] + fib[i - 2];

        int testes = teclado.nextInt();
        for (int i = 1; i <= testes; i++) {
            numero = teclado.nextInt();
            System.out.println("Fib(" + numero + ") = " + fib[numero]);
        }
    }
}