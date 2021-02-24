import java.util.Scanner;
class Funcionario{
    private double salario;

    public Funcionario(){
        this.salario = 0;
    }

    public double calculaImposto(){
        return this.salario;
    }

    public void setSalario(double sar){
        this.salario = sar;
    }

    public double getSalario(){
        return this.salario;
    }

}

class Gerente extends Funcionario{
    public double calculaImposto(){
        return this.getSalario()*0.1;
    }
}
class Supervisor extends Funcionario{
    public double calculaImposto(){
        return this.getSalario()*0.05;
    }
}
class Atendente extends Funcionario{
    public double calculaImposto(){
        return this.getSalario()*0.01;
    }
}

public class Ex03{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        Funcionario generico = new Funcionario();
        generico.setSalario(1000.0);
        System.out.println(generico.calculaImposto());

        Funcionario gerente = new Gerente();
        gerente.setSalario(1000.0);
        System.out.println(gerente.calculaImposto());

        Funcionario supervisor = new Supervisor();
        supervisor.setSalario(1000.0);
        System.out.println(supervisor
        .calculaImposto());

        Funcionario atendente = new Atendente();
        atendente.setSalario(1000.0);
        System.out.println(atendente.calculaImposto());

    }
}