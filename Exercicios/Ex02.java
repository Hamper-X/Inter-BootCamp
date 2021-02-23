import java.util.Scanner;
class Carro{
    private String car_model;
    private String car_brand;
    private String variant;
    private int year;

    public Carro(){
        this.car_brand = "";
        this.car_model = "";
        this.variant = "";
        this.year= 0; 
    }
    
    public Carro(String car_mod,String car_bra,String car_var, int yea){
        this.car_brand = car_bra
        this.car_model = car_mod;
        this.variant = car_var;
        this.year= yea;
    }    
}
public class Ex02{
    public static void main(String [] args){
        int control = 1;
        String a,b,c,d;
        Scanner sc = new Scanner(System.in);
        Carro fiat = new Carro();

        System.out.println("Insira o modelo:");
        a = sc.nextLine();
        System.out.println("Insira a variante:");
        b = sc.nextLine();
        System.out.println("Insira a marca:");
        c = sc.nextLine();
        System.out.println("Insira o ano:");
        d = sc.nextLine();
    }
}