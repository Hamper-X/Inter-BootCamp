import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;

public class minhaClasse {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer,Integer> nNumber = new HashMap<Integer,Integer>();
        List<Integer> valores = new ArrayList<Integer>();
        int value,n;
        n = Integer.valueOf(br.readLine());
        System.out.println(n);
        for(int i=0;i<n;i++){
            value = Integer.valueOf(br.readLine());
            if(nNumber.containsKey(value)){
                int atual = nNumber.get(value);
                atual++;
                nNumber.put(value,atual);
            }else{
                nNumber.put(value,0);
                valores.add(value);
            }
        }

        for(int i=0;i<n;i++){
            if(nNumber.containsKey(valores.get(i))){
                System.out.println(valores.get(i)+" aparece "+nNumber.get(valores.get(i))+" vez(es)");
            }
        }
	}
}