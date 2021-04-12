import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Encurtador{
    private String[] all_words; // Todas as palavras
    private String[] best_words; // Melhores palavras
    private int[] best_values;  // Melhores valores
    private Map<String,Integer> selected_words;   // Map melhores palavras e melhores valores 
    private int total;  // Total de palavras encurtadas
    private String text;  // Total de palavras encurtadas
    private int count;

    // Construtor padrão 
    public Encurtador(){
        best_words = new String[26]; // 26 letras do alfabeto
        best_values = new int[26];
        total = 0;  
        for(int i =0;i<26;i++){
            best_words[i]="";
            best_values[i]=0;
            total=0;
        }
        text = "";
        selected_words = new HashMap<String,Integer>();
        count = 0;
    }

    // Retira possiveis erros de tratamento 
    public void stringTreatment(String txt){
        this.text = txt.trim().toLowerCase().replaceAll("\t", " ").replaceAll("\n", " ");
    }

    // Fraguimentar palavras
    public void splitall_words(){
        this.all_words = text.split(" ");
    }

    // Separar todas as palavras com seus respectivos valores
    public void wordSeparator(){
        splitall_words();
        int sun=0;
        
        // Pegando q auntidade de caracteres gastos por todas as diferentes palavras 
        for(int i=0;i<all_words.length;i++){
            if(selected_words.containsKey(all_words[i])==true && all_words[i].length()>2){
                sun = selected_words.get(all_words[i]);
                sun = sun + (all_words[i].length()-2);
                selected_words.put(all_words[i],sun);
            }else{
                if(all_words[i].length()>2){
                    selected_words.put(all_words[i],all_words[i].length()-2);
                }
            }
        }
    }

    // Selecionar melhor palavra para cara letra
    public void selectBestWords(){
        int key=0;
        for(int i=0;i<all_words.length;i++){
            if(selected_words.containsKey(all_words[i])){
                key = ((int)all_words[i].charAt(0))-97;

                if(selected_words.get(all_words[i])>best_values[key]){
                    best_values[key] = selected_words.get(all_words[i]);
                    best_words[key] = all_words[i];
                }
            }
        }

        for(int i=0;i<best_values.length;i++){
            if(best_values[i]!=0){
                this.count++;
            }
        }
    }

    // Printar texto encurtado e corrigido
    public void getResult(){
        String resp = "";
        boolean verify = false;

        for (int i=0;i<all_words.length;i++){
            verify = false;
            for(int j=0;j<26;j++){
                if(all_words[i].compareTo(best_words[j])==0){
                    if(resp == ""){
                        resp = best_words[j].charAt(0)+".";
                        verify = true;
                    }else{
                        resp = resp + " " + best_words[j].charAt(0)+".";
                        j = 26; 
                        verify = true;
                    }
                }
            }
            if(verify==false){
                if(resp == ""){
                    resp = all_words[i];
                }else{
                    resp = resp + " " + all_words[i];;
                }
            }
        }

        System.out.println(resp);
        System.out.println(count);
        for(int i=0;i<26;i++){
            if(best_values[i]!=0){
                char ch = best_words[i].charAt(0);
                System.out.println(ch+". = "+best_words[i]);
            }
        }
    }

    public void systemCall(String resp){
        stringTreatment(resp);
        wordSeparator();
        selectBestWords();
        getResult();
    }
}


public class MinhaPrimeiraClasse{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String resp = br.readLine();
        String resp_out = "";
        
        while(resp.compareTo(".")!=0){
            Encurtador enc = new Encurtador();
            enc.systemCall(resp);
            resp = br.readLine();
        }
    }
}
