import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int idadeDias = teclado.nextInt();

        int meses = 0;
        int anos = 0;

        if (idadeDias >= 365) {
            anos = idadeDias / 365;
            idadeDias = idadeDias % 365;
        } 
        
        if (idadeDias >= 30) {
            meses = idadeDias / 30;
            idadeDias = idadeDias % 30;
        } 
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(idadeDias + " dia(s)");
    }

}