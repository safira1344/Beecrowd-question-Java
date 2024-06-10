import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        teclado.nextLine();// limpa o buffer do teclado a quebra de linha

        int maiorAB;

        maiorAB = (a + b + Math.abs(a - b)) / 2;

        if (maiorAB > c) {
            System.out.println(maiorAB + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }

    }
}