import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivo = 0;
        int negativo = 0;
        int e;

        while (leitor.hasNextInt()) {
            e = leitor.nextInt();
            if(e%2==0){
                pares++;
            }else{
                impares++;
            }
            if(e>0){
                positivo++;
            }else{
                negativo++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}