import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt();
        System.out.println(valor);

        int notas100 = valor / 100;
        valor -= notas100 * 100;

        int notas50 = valor / 50;
        valor -= notas50 * 50;

        int notas20 = valor / 20;
        valor -= notas20 * 20;

        int notas10 = valor / 10;
        valor -= notas10 * 10;

        int notas5 = valor / 5;
        valor -= notas5 * 5;

        int notas2 = valor / 2;
        valor -= notas2 * 2;

        int notas1 = valor;

        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");        
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");

    }

}