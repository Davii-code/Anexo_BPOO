import java.lang.Math;
import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da paciente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade da paciente:");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso da paciente:");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura da paciente:");
        double altura = scanner.nextDouble();

        Paciente paciente = new Paciente(nome, idade, peso, altura);
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Idade: " + paciente.getIdade());
        System.out.println("Peso: " + paciente.getPeso());
        System.out.println("Altura: " + paciente.getAltura());
        System.out.println("IMC: " + paciente.IMC());
        System.out.println("Faixa de Peso: " + paciente.calculaFaixa());
    }

    public static class Paciente {
        private String nome;
        private int idade;
        private double peso;
        private double altura;
        private double Imc;

        public Paciente(String nome, int idade, double peso, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double IMC(){
           Imc = peso/(Math.pow(altura,2));
           return Imc;
        }

        public String calculaFaixa(){
            if (Imc<20){
                return "Abaixo do peso ideal";
            }else {
                if(Imc>=20 && Imc<25){
                    return "Peso normal";
                }else{
                    if (Imc>=25 && Imc<30){
                        return "Excesso de Peso";
                    }else{
                        if(Imc>=30 && Imc<35){
                            return "Obesidade";
                        }
                    }
                }
            }
            return "Obesidade Mormida";
        }
    }
}