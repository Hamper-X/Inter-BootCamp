import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class suaClasseAqui {
    public static void passwordTest(String test){
        boolean let_maiuscula = false, let_minuscula = false , number = false;
        int string_validation=0;    // Sera somado a cada verificação para verificar o limite >=6 e <= 32 e para verificar se todas as letras passaram por pelo menos 1 dos tipos permitidos.

        // Conversão de cada char para int(ascii) para verificação de cada topico.
        for(int i=0;i<test.length();i++){
            // Verificação de algarismo 
            if((int)test.charAt(i)>=48 && (int)test.charAt(i)<=57){
                number = true;
                string_validation++;
            }else{
                // Verificação de maiuscula
                if((int)test.charAt(i)>=65 && (int)test.charAt(i)<=90){
                    let_maiuscula = true;
                    string_validation++;
                }else{
                    // Verificação de minuscula 
                    if((int)test.charAt(i)>=97 && (int)test.charAt(i)<=122){
                        let_minuscula = true;
                        string_validation++;
                    }
                }
            }
        }

        if(let_maiuscula==true && let_minuscula==true && number==true && (string_validation==test.length()) && (string_validation>=6 && string_validation<=32)){
            System.out.println("Senha valida.");
        }else{
            System.out.println("Senha invalida.");
        }
    }
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password;

        while ((password = br.readLine()) != null) {
            if(password.length()<6 && password.length()>32){
                System.out.println("Senha invalida");
            }else{
                passwordTest(password);
            }
        }
	}
}