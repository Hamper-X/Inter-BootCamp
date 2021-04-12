import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;


class Prefixo{
    private String[] words;
    private String all_words;
    
    public Prefixo(int nPalavras){
        words = new String[nPalavras] ;
        all_words = "";
    }
    
    public void setWords(String txt){
        this.all_words = txt;
        words = all_words.split(" ");
    }

    public void searchPre(){
        boolean resp = false;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j){
                    if(words[i].startsWith(words[j])==true){
                        resp = true;
                        i=words.length;
                        j=words.length;
                    }
                }
            }
        }

        if(resp == false ){
            System.out.println("Conjunto Bom");
        }else{
            System.out.println("Conjunto Ruim");
        }
    }
    public void print(){
        for (int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}
public class MinhaPrimeiraClasse{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nPalavras = Integer.valueOf(br.readLine());
        String resp;
        
        while(nPalavras!=0){
            resp = "";
            Prefixo enc = new Prefixo(nPalavras);
            resp = br.readLine() + " ";
            for(int i=1;i<nPalavras;i++){
                resp = resp + br.readLine()+" ";
            }
            enc.setWords(resp);
            enc.searchPre();
            nPalavras = Integer.valueOf(br.readLine());
        }
    }
}