/**
 * Desenvolvimento Basico em Java
 * Trabalhando com Data: Exercicio final Classe Date 
*/
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Scanner;

public class Ex04 {

    /*  
            METODO              Retorno     
        data.after(Date)        bool        
        data.before(Date)       bool
        data.compareTo(Date)    int 
        data.equals(Date)       bool      == ?
        data.getTime()          long         milesegundos     
        data.setTime(long)      void
        data.from(Instance)     static Date
        data.toInstant()        instance
    */

    public void test(){
        Long data_m2;

        Date data_m1 = new Date();
        System.out.println("Data modelo 01: "+data_m1);

        data_m2 = System.currentTimeMillis();
        System.out.println("Data modelo 02: "+data_m2);

        Date data_m3 = new Date(data_m2);
        System.out.println("Data modelo 02: "+data_m3);
    }
    public static long getLive(String dat) throws Exception{
        String myDate = "2000/02/16 12:30:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = sdf.parse(myDate);
        long mili = date.getTime();

        return mili;
    }
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String date_in;

        System.out.println("Digite a data que deseja procurar no formato:\nano/mes/dia hora:minuto:segundo");
        date_in = sc.nextLine();

        Date data_out = new Date(getLive(date_in));
        System.out.println("Data de nascimento em formato long: "+getLive(date_in)+"\n Em formato data: "+data_out);
        

    }
}
