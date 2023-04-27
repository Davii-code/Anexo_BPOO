import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitoScanner = new Scanner(System.in);
        
            System.out.println("Digite seu Nome");
            String nameString = leitoScanner.nextLine();

            System.out.println("Digite o número da conta");
            int conta = leitoScanner.nextInt();

            System.out.println("Digite sua agencia");
            int agencia = leitoScanner.nextInt();

            System.out.println("Digite seu saldo");
            double saldo = leitoScanner.nextDouble();

            Poupanca poupanca = new Poupanca(nameString, conta, agencia, saldo);
            System.out.println("deseja depositar? (Digite 'D')");
            String movimentaString = leitoScanner.nextLine();

            System.out.println("deseja sacar?(Digite 'S')");
            movimentaString = leitoScanner.nextLine();
            
            Poupanca poupanca2 = new Poupanca(movimentaString);
            System.out.println("Saldo atual: " + poupanca.Movimentacao(movimentaString));
            System.out.println("Nome do Proprietario: " + poupanca.nome());
            System.out.println("Numero da conta: " + poupanca.numeroConta());
            System.out.println("Numero da agencia: " + poupanca.numeroAgencia());
            
    }

    public static class Poupanca {
        Scanner leitoScanner = new Scanner(System.in);
        String nameString;
        int conta;
        int agencia;
        double saldo;
        String movimentaString;

        public Poupanca (String nameString, int conta,int agencia,double saldo) {
            this.nameString = nameString;
            this.conta = conta;
            this.agencia = agencia;
            this.saldo = saldo;

        }

        public Poupanca (String movimentaString){
            this.movimentaString =movimentaString;
        }

        public double Movimentacao( String movimentaString){
            if (movimentaString.equals("D")){
                System.out.println("Digite o valor");
                double deposito = leitoScanner.nextInt();
                return  saldo + deposito;
            }
            if (movimentaString.equals("S")){
                    System.out.println("Digite o valor");
                    double saque = leitoScanner.nextInt();
                    return saldo - saque;
            }


            return  saldo;
            
           
        }
        
        public String nome(){
            return nameString;
        }
        public int numeroConta(){
            return conta;
        }
        public int numeroAgencia(){
            return agencia;
        }
        

    }
}
