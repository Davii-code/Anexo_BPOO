import java.lang.Math;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso da pessoa:");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura da pessoa:");
        double altura = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, idade, peso, altura);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("IMC: " + pessoa.setIMC());
    }

    public static class Pessoa {
        private String nome;
        private int idade;
        private double peso;
        private double altura;
        private double imc;

        public Pessoa(String nome, int idade, double peso, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
            this.imc = imc;
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

        public double setIMC(){
           return peso/(Math.pow(altura,2));
        }
    }
}