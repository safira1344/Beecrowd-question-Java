import java.io.IOException;
import java.util.*; //consegue acessar todas as classes da biblioteca java.util

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int testes = teclado.nextInt();
        int soma;
        int numero;

        for (int i = 0; i < testes; i++) {
            numero = teclado.nextInt();
            soma = 0;

            for (int j = 1; j < numero; j++) {
                if (numero % j == 0) {
                    soma += j;
                }
            }
            if (soma == numero) {
                System.out.println(numero + " eh perfeito");
            } else {
                System.out.println(numero + " nao eh perfeito");
            }
        }
    }
}