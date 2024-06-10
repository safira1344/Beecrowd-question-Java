import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int testes = teclado.nextInt();
        int contador = 0;

        for (int i = 0; i < testes; i++) {
            int numero = teclado.nextInt();

            for (int j = 2; j < numero; j++) {
                if (numero % j == 0) {
                    contador++;
                }
            }

            if (contador == 0) {
                System.out.println(numero + " eh primo");
            } else {
                System.out.println(numero + " nao eh primo");
            }

        }

    }

}