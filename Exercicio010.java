import java.util.Scanner;

public class Exercicio010 {
public static void main(String[] args) {
Scanner leitoScanner = new Scanner(System.in);
System.out.println("Digite seu Nome");
String nameFuncString = leitoScanner.nextLine();

System.out.println("Digite quantos filhos você tem:");
int filhosFunc= leitoScanner.nextInt();

System.out.println("Digite seu salário");
double salario = leitoScanner.nextDouble();

System.out.println("Digite o valor em porcentagem do seu aumento");
double porcentagem= leitoScanner.nextDouble();

Funcionario funcionario= new Funcionario(salario,filhosFunc);
System.out.println("valor do salário com aumento: " + funcionario.aumentoSalario(porcentagem) );
System.out.println("Reajuste do INSS: " + funcionario.calculoINSS());
System.out.println("Desconto por filhos no imposto de renda: " + funcionario.calcularDescontoFilhos());


}

public static class Funcionario{
private int filhosFunc;
private double salario;
private double reajusteSalario;

public Funcionario(double salario, int filhosFunc){
this.salario=salario;
this.filhosFunc = filhosFunc;
}

public double aumentoSalario(double porcentagem){
reajusteSalario = salario + (porcentagem*salario)/100;
return reajusteSalario;
}

public double calculoINSS (){
if (salario<=2545.00){
return reajusteSalario - (6*salario)/100;
}
return reajusteSalario - (10*salario)/100;
}
public double calcularDescontoFilhos() {
    double desconto = 1250.25 * filhosFunc;
    return desconto;
}

}


}