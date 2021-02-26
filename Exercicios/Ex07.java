/**
 * Desenvolvimento Basico em Java
 * Trabalhando com Data: Exercicio final Date java 8
*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Locale;
import java.util.Scanner;
import jdk.vm.ci.meta.Local;
import java.util.Date;

public class Ex07{
    
    public static void teste(){
        LocalDate today = LocalDate.now();
        
        today.minusDays(1); //substrai dias
        System.out.println(today);
        today.plusDays(1);  //adiciona dias 

        LocalTime now = LocalTime.now(); 
        System.out.println(now);

        LocalDateTime geral = LocalDateTime.now();
        System.out.println(geral);
    }

    public static void Exe(){
        LocalDateTime data = LocalDateTime.of(2010, 05, 15, 10,00,00);
        System.out.println(data);
        LocalDateTime future = data.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(future);        
    }

    public static void main(String[] args) {
        //teste();
        Exe();
    }
}