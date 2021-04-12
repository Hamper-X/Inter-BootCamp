import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class minhaClasse {
    public static void testarPalavra(String txt){
        boolean resp = false;
        String reserva = "";
        for(int i=0; i <= txt.length() - 1; i++) {
            reserva = txt.substring(0, i); 
            if( reserva.endsWith(txt.substring(i)) ) {
                System.out.println(txt.substring(0, i));
                resp = true;
            }
        }
        if(resp==false) 
            System.out.println(txt);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        while((entrada = in.readLine()) != null) {
            testarPalavra(entrada);
        }
    }
}
