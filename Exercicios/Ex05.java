/**
 * Desenvolvimento Basico em Java
 * Trabalhando com Data: Exercicio final Classe Calendar 
*/
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void test(){
        Calendar now = Calendar.getInstance();
        //System.out.println(now);

        System.out.printf("%tc\n",now);
        
        now.add(Calendar.DATE, -2);
        System.out.println("2 dias para tras: "+now.getTime());
        now.add(Calendar.MONTH, 2);
        System.out.println("2 meses para frente: "+now.getTime());
        now.add(Calendar.YEAR, -2);
        System.out.println("2 anos para tras: "+now.getTime());
        
        
    }
    public static void getValid(String dat) throws Exception{
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        int base;
        cal.setTime(sdf.parse(dat));
        cal.add(Calendar.DATE, 10);

        base = cal.get(Calendar.DAY_OF_WEEK);
        //System.out.println(base);
        if(base==7){
            System.out.println("Validade cai no sabado -> Transferindo para Segunda");
            cal.add(Calendar.DATE, 2);
        }else{
            if(base==1){
                System.out.println("Validade cai no domingo -> Transferindo para Segunda");
                cal.add(Calendar.DATE, 1);
            }
        }
        System.out.printf("%tc\n",cal);

    }
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a data de vencimento no seguinte formato:\n'EEE MMM dd HH:mm:ss BRT yyyy'");
        String date_in = sc.nextLine();
        //test();
        getValid(date_in);
    }
}
