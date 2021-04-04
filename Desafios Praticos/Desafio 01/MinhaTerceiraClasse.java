import java.util.Scanner;

public class MinhaTerceiraClasse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if(num>=1 && num<=1000){
          for (int i = 1; i <= num; i = i++ ) { //complete seu codigo aqui
              if(i%2==0){
                System.out.println(i);
              }
          }
        }
    }

}