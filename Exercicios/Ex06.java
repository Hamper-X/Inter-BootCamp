/**
 * Desenvolvimento Basico em Java
 * Trabalhando com Data: Exercicio final Classe DataFormat
*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Ex06{
    
    public static void teste(){
        Date now = new Date();
        String nowStr = DateFormat.getInstance().format(now);
        System.out.println(nowStr);

        String nowStr2 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(now);
        System.out.println(nowStr2);

        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");
        String nowStr3 = form.format(now);
        System.out.println(nowStr3);

    }

    public static void main(String[] args) {
        teste();
    }
}