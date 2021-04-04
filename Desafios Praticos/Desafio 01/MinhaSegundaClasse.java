import java.io.IOException;
import java.util.Scanner;

public class MinhaSegundaClasse {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   //tamanho do vetor
        int[] X = new int[N];   //declaração do vetor
        int menor = 0, posMenor = 0;
        for (int i = 0; i < N; i++) {
        	X[i] = sc.nextInt();
        	if (i == 0) {
        		menor = X[i];
        		posMenor = i;
        	} else if (X[i] < menor) {
        		menor = X[i];
        		posMenor = i;
        	}
        }
        System.out.println("Menor valor: " +menor ); //complete o codigo aqui de acordo com a variavel esperada
        System.out.println("Posicao: " +posMenor ); //complete o codigo aqui de acordo com a variavel esperada
    }
	
}