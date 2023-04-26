import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int alturaRetangulo = 0;
        int larguraRetangulo = 0;

        while(larguraRetangulo <= 0 || larguraRetangulo <= 0){
        System.out.println("Digite a largura do retangulo");
        larguraRetangulo = leitor.nextInt();
        
        System.out.println("Digite a altura do retangulo");
        alturaRetangulo = leitor.nextInt();
        }

        Retangulo retangulo= new Retangulo(alturaRetangulo , larguraRetangulo);
        System.out.println("A area do retangulo é: "+ retangulo.calculaAreaRetangulo());
        System.out.println("A Perimetro do retangulo é: "+ retangulo.calculaPerimetroRetangulo());
    }

    public static class Retangulo{
        private int alturaRetangulo;
        private int larguraRetangulo;


        public Retangulo (int alturaRetangulo, int larguraRetangulo){
            this.alturaRetangulo = alturaRetangulo;
            this.larguraRetangulo = larguraRetangulo;
        }

        public int calculaAreaRetangulo(){
            return alturaRetangulo * larguraRetangulo;
        }

        public int calculaPerimetroRetangulo (){
            return (alturaRetangulo+larguraRetangulo)*2;
        }

    }
}
