import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int[] n = new int[1000];
        int valor = teclado.nextInt();
        int posicao = 0;

        while (posicao < 999) {
            for (int i = 0; i < valor; i++) {
                if (posicao > 999) {
                    break;
                }
                n[posicao] = i;
                posicao++;
            }

        }

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}