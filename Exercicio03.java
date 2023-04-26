import java.util.Scanner;
import java.lang.Math;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int raio=0;
        while(raio <= 0){
            System.out.println("Digite o raio da esfera");
             raio = leitor.nextInt();
        }

        Esfera esfera = new Esfera(raio);

        System.out.println("A area da esfera " + esfera.calculaArea());
        System.out.println("A area da esfera " + esfera.calculaVolume());
}

    public static class Esfera{
        private int raio;

    public Esfera (int raio){
        this.raio =raio;
    }
    

        public double calculaArea(){
            return 4*3.14*Math.pow(raio, 2);
        }
        public double calculaVolume(){
            return (4*3.14*Math.pow(raio, 3))/3;
        }


    }
}
