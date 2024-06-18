import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int testes;
        testes = teclado.nextInt();
        String linha1[], linha2[], nome1, escolha1, nome2, escolha2;
        int NJogador1, MJogador2;
        for (int i = 0; i < testes; i++) {
            linha1 = teclado.nextLine().split(" ");
            linha2 = teclado.nextLine().split(" ");
            NJogador1 = Integer.parseInt(linha2[0]);
            MJogador2 = Integer.parseInt(linha2[1]);
            nome1 = linha1[0];
            escolha1 = linha1[1];
            nome2 = linha1[2];
            escolha2 = linha1[3];

            if (((NJogador1 + MJogador2) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) || ((NJogador1 + MJogador2) % 2 != 0 && escolha1.equalsIgnoreCase("IMPAR"))) {
                System.out.println(nome1);
            } else {
                System.out.println(nome2);
            }
        }
    }
}