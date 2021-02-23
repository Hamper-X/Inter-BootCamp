import java.util.Scanner;
class Carro{
    public String car_model;
    public int number_people;
    private final int max_people = 5;

    public Carro(){
        this.car_model = "";
        this.number_people = 0;  

    }
    
    public Carro(String name_car, int number){
        this.car_model = name_car;
        if(number>max_people){
            System.out.println("O carro so cabe: "+max_people); 
        }else{
            this.number_people = number_people;   
        }        
    }

    public void addPeople(int people){
        if(number_people+people>max_people){
            System.out.println("Não é possivel adicionar esse numero de pessoas. O carro não comporta. \n O numero atual de pessoas que ja estão no carro é de: "+number_people+"\nO numero maximo de pessoas que podem ser adicionadas e de: "+(max_people-number_people));
        }else{
            number_people = number_people + people;
        }
    }
    public void removePeople(int people){
        if(number_people-people<0){
            System.out.println("Não é possivel remover esse numero de pessoas. O carro não tem isso tudo. \n O numero atual de pessoas que ja estão no carro é de: "+number_people+"\nO numero maximo de pessoas que podem ser removidas e de: "+number_people);
        }else{
            number_people = number_people - people;
        }
    }

    
}
public class Ex01{
    public static void main(String [] args){
        int control = 1;
        Scanner sc = new Scanner(System.in);
        Carro fiat = new Carro();

        while(control != 0){
            System.out.println("Deseja adicionar ou remover pessoas?\nTecle:\n1- Para adicionar\n2- Para remover.\n0- Sair\n");
            control = sc.nextInt();
            if(control==1){
                System.out.println("Quantas pessoas quer adicionar?\n");
                int add_number = 1;
                add_number = sc.nextInt();
                fiat.addPeople(add_number);
            }else{
                if(control==2){
                    System.out.println("Quantas pessoas quer remover?\n");
                    int remove_number = 1;
                    remove_number = sc.nextInt();
                    fiat.removePeople(remove_number);
                }               
            }
        }
    }
}