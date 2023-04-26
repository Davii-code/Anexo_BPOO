import java.util.Scanner;
import java.lang.Math;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

            System.out.println("Digite a Altura da Pirâmede");
            int altura = leitor.nextInt();
            
            System.out.println("Digite a base da Pirâmede");
            int base = leitor.nextInt();

            Piramede Piramede = new Piramede(base, altura);
            System.out.println("Valor da Base: " + Piramede.getBase());
            System.out.println("Valor da Base: " + Piramede.getAltura());
            System.out.println("Valor da Volume: " + Piramede.Volume());
        
    }


    public static class Piramede {
        private int altura;
        private int base;
 


        public Piramede(int base , int altura){
            this.base=base;
            this.altura=altura;
        }

        public int getBase(){
            return base;
        }

        public void setBase(int base){
            this.base=base;
        }

        public int getAltura(){
            return altura;
        }

        public void setAltura(int altura){
            this.altura=altura;
        }
        
        public double Volume(){
            return (base*altura)/3;
        }
        
    }
}






