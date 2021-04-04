import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


// criar um vetor de a-z em que cada letra tem um vetor com as palavras de começam com a, nesse vetor, esse sub vetor tera um objeto que tem o nome e a quantidade de vezes que a a palavra apareceu
// temos que pegar a palavra que mais se ganha ao encurtar
// map<palavra,quantidade>
class Shortener{
    private String[] words;
    private String[] bestWords;
    private Map<String,Integer> bestWord;       // < Palavra,N° de vezes que aparece > 
    private int total;
    private String text;

    // Construtor padrão 
    public Shortener(){
        bestWords = new String[26];
        total = 0;
        for(int i =0;i<26;i++){
            bestWords[i]="";
            total=0;
        }
        text = "";


        bestWord = new HashMap<String,Integer>();
    }

    public void stringTreatment(String txt){
        this.text = txt.trim().toLowerCase().replaceAll("\t", " ").replaceAll("\n", " ");
    }

    public void selectWord(){
        this.words = text.split(" ");
        int count =0;
        for (int i=0;i<words.length;i++){
            char initial = words[i].charAt(0);
            switch (initial){
                case 'a':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[0])!=null){
                            if(bestWord.get(bestWords[0])<count){
                                bestWord.remove(bestWords[0]);
                                bestWord.put(words[i], count);
                                bestWords[0] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'b':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[1])!=null){
                            if(bestWord.get(bestWords[1])<count){
                                bestWord.remove(bestWords[1]);
                                bestWord.put(words[i], count);
                                bestWords[1] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'c':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[2])!=null){
                            if(bestWord.get(bestWords[2])<count){
                                bestWord.remove(bestWords[2]);
                                bestWord.put(words[i], count);
                                bestWords[2] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'd':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[3])!=null){
                            if(bestWord.get(bestWords[3])<count){
                                bestWord.remove(bestWords[3]);
                                bestWord.put(words[i], count);
                                bestWords[3] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'e':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[4])!=null){
                            if(bestWord.get(bestWords[4])<count){
                                bestWord.remove(bestWords[4]);
                                bestWord.put(words[i], count);
                                bestWords[4] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'f':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[5])!=null){
                            if(bestWord.get(bestWords[5])<count){
                                bestWord.remove(bestWords[5]);
                                bestWord.put(words[i], count);
                                bestWords[5] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'g':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[6])!=null){
                            if(bestWord.get(bestWords[6])<count){
                                bestWord.remove(bestWords[6]);
                                bestWord.put(words[i], count);
                                bestWords[6] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'h':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[7])!=null){
                            if(bestWord.get(bestWords[7])<count){
                                bestWord.remove(bestWords[7]);
                                bestWord.put(words[i], count);
                                bestWords[7] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;  
                case 'i':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[8])!=null){
                            if(bestWord.get(bestWords[8])<count){
                                bestWord.remove(bestWords[8]);
                                bestWord.put(words[i], count);
                                bestWords[8] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'j':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[9])!=null){
                            if(bestWord.get(bestWords[9])<count){
                                bestWord.remove(bestWords[9]);
                                bestWord.put(words[i], count);
                                bestWords[9] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'k':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[10])!=null){
                            if(bestWord.get(bestWords[10])<count){
                                bestWord.remove(bestWords[10]);
                                bestWord.put(words[i], count);
                                bestWords[10] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'l':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[11])!=null){
                            if(bestWord.get(bestWords[11])<count){
                                bestWord.remove(bestWords[11]);
                                bestWord.put(words[i], count);
                                bestWords[11] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'm':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[12])!=null){
                            if(bestWord.get(bestWords[12])<count){
                                bestWord.remove(bestWords[12]);
                                bestWord.put(words[i], count);
                                bestWords[12] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'n':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[13])!=null){
                            if(bestWord.get(bestWords[13])<count){
                                bestWord.remove(bestWords[13]);
                                bestWord.put(words[i], count);
                                bestWords[13] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'o':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[14])!=null){
                            if(bestWord.get(bestWords[14])<count){
                                bestWord.remove(bestWords[14]);
                                bestWord.put(words[i], count);
                                bestWords[14] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'p':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[15])!=null){
                            if(bestWord.get(bestWords[15])<count){
                                bestWord.remove(bestWords[15]);
                                bestWord.put(words[i], count);
                                bestWords[15] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'q':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[16])!=null){
                            if(bestWord.get(bestWords[16])<count){
                                bestWord.remove(bestWords[16]);
                                bestWord.put(words[i], count);
                                bestWords[16] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'r':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[18])!=null){
                            if(bestWord.get(bestWords[18])<count){
                                bestWord.remove(bestWords[18]);
                                bestWord.put(words[i], count);
                                bestWords[18] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 's':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[19])!=null){
                            if(bestWord.get(bestWords[19])<count){
                                bestWord.remove(bestWords[19]);
                                bestWord.put(words[i], count);
                                bestWords[19] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 't':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[20])!=null){
                            if(bestWord.get(bestWords[20])<count){
                                bestWord.remove(bestWords[20]);
                                bestWord.put(words[i], count);
                                bestWords[20] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'u':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[21])!=null){
                            if(bestWord.get(bestWords[21])<count){
                                bestWord.remove(bestWords[21]);
                                bestWord.put(words[i], count);
                                bestWords[21] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'v':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[22])!=null){
                            if(bestWord.get(bestWords[22])<count){
                                bestWord.remove(bestWords[22]);
                                bestWord.put(words[i], count);
                                bestWords[22] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'w':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[23])!=null){
                            if(bestWord.get(bestWords[23])<count){
                                bestWord.remove(bestWords[23]);
                                bestWord.put(words[i], count);
                                bestWords[23] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'x':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[24])!=null){
                            if(bestWord.get(bestWords[24])<count){
                                bestWord.remove(bestWords[24]);
                                bestWord.put(words[i], count);
                                bestWords[24] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'y':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[25])!=null){
                            if(bestWord.get(bestWords[25])<count){
                                bestWord.remove(bestWords[25]);
                                bestWord.put(words[i], count);
                                bestWords[25] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;
                case 'z':
                    if(bestWord.containsKey(words[i])==false && words[i].length()>2){
                        count = searchNumberWords(words[i]);
                        if(bestWord.get(bestWords[26])!=null){
                            if(bestWord.get(bestWords[26])<count){
                                bestWord.remove(bestWords[26]);
                                bestWord.put(words[i], count);
                                bestWords[26] = words[i];
                            }
                        }else{
                            bestWord.put(words[i], count);
                        }
                    }
                    break;  
            }
        }
    }

    public int searchNumberWords(String txt){
        int resp = 0;
        for (int i=0;i<words.length;i++){
            if(words[i].compareTo(txt)==0){
                resp++;
            }
        }
        resp = resp*txt.length();
        return resp;
    }


    // encurtamento das palavras
    public void shortWords(){
        for (int i=0;i<words.length;i++){
            for(int j=0;j<26;j++){
                if(words[i].compareTo(bestWords[j])==0){
                    words[i] = bestWords[j].charAt(0) + ".";
                    total++;
                }
            }
        }
    }

    // Monta a frase novamente, aderindo aos encurtamentos
    public String getResp(){
        String result = words[0];
        for (int i=1;i<words.length;i++){
            result = result + " "+ words[i];
        }
        return result;
    }

    public int getTotal(){
        return this.total;
    }

    public void printWords(){
        char amg = ' ';
        for(int i=0;i<26;i++){
            if(bestWords[i]!="" && bestWords[i]!=" " && bestWords[i]!=null){
                amg = bestWords[i].charAt(0);
                System.out.println(amg+". = "+ bestWords[i]+"");
            }
        }
    }

    public void printAll(){
        for (int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        System.out.println("=====================================================");
        for (int i=0;i<26;i++){
            System.out.println(bestWords[i]);
        }
    }

}


public class MinhaPrimeiraClasse {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String resp = br.readLine();
        String resp_out = "";
        
        while(resp.compareTo(".")!=0){
            Shortener shortns = new Shortener();
            shortns.stringTreatment(resp);
            shortns.selectWord();
            shortns.shortWords();
            System.out.println(shortns.getResp());
            System.out.println(shortns.getTotal());
            shortns.printWords();
            shortns.printAll();

            resp = br.readLine();
        }
    }
}