import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String alteracao(String nomes, char a, char b) {
        String resp = "";

        for (int i = 0; i < nomes.length(); i++) {
            if (nomes.charAt(i) == a) {
                resp += b;
            } else {
                resp += nomes.charAt(i);
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        String nomes = "";
        char a, b;
        Random gerador = new Random();
        gerador.setSeed(4);
        Scanner leitor = new Scanner(System.in);
        while (nomes.contains("FIM") != true) {
            a = (char) ('a' + Math.abs(gerador.nextInt() % 26));
            b = (char) ('a' + Math.abs(gerador.nextInt() % 26));
            System.out.println(alteracao(nomes, a, b));
            nomes = leitor.nextLine();
        }
    }

}