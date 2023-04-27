import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitoScanner = new Scanner(System.in);
        System.out.println("Digite seu Nome");
        String nameFuncString = leitoScanner.nextLine();

        System.out.println("Digite seu CPF");
        long cpfFunc= leitoScanner.nextLong();

        System.out.println("Digite suas horas Trabalhadas");
        double horasTrab = leitoScanner.nextDouble();

        System.out.println("Digite o valor das horas");
        double valorHoras= leitoScanner.nextDouble();

        System.out.println("Nome do Funcionario: " + nameFuncString);
        System.out.println("CPF: " + cpfFunc);
        System.out.println("Horas Trabalhada:" + horasTrab );
        System.out.println("Valor da hora: " + valorHoras);
        Funcionario funcionario = new Funcionario(horasTrab,valorHoras);
        System.out.println("Salario: " + funcionario.salario());


    }

    public static class Funcionario{
        private double horasTrab;
        private double valorHoras;

        public Funcionario(double horasTrab, double valorHoras){
            this.horasTrab=horasTrab;
            this.valorHoras = valorHoras;        
        }
        public double salario(){
            return horasTrab * valorHoras;
        }

    }

   
}
