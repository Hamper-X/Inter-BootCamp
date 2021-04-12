import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class minhaClasse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//declare suas variaveis
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        br.close();   

        //declare suas variaveis com o valor correto 
        int menorNumero = -1;       

//continue o codigo
        if (c%a==0){
            for(int i=1;i<=c/a;i++){                
                if((c%(a*i)==0) && ((a*i)%b!=0) && (d%(a*i)!=0)){
                    menorNumero = (a*i);
                    i = c;
                }         
            }
        }
        System.out.println(menorNumero);        
    }    
}