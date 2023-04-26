import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       double alturaParalepipedo = 0;
       double larguraParalepipedo = 0;
       double comprimentoParalepipedo = 0;

        while(larguraParalepipedo <= 0 || larguraParalepipedo <= 0 || comprimentoParalepipedo <= 0){
        System.out.println("Digite a largura do Parelelepipedo ");
        larguraParalepipedo = leitor.nextDouble();
        
        System.out.println("Digite a altura do Parelelepipedo ");
        alturaParalepipedo = leitor.nextDouble();

        System.out.println("Digite a comprimento do Parelelepipedo ");
        comprimentoParalepipedo = leitor.nextDouble();
        }

        Paralepipedo paralepipedo  = new Paralepipedo(alturaParalepipedo , larguraParalepipedo, comprimentoParalepipedo);
        System.out.println("A area do Paralelepipedo é: "+ paralepipedo.calculaAreaParalepipedo());
        System.out.println("A Perimetro do Parelelepipedo é: "+ paralepipedo.calculaVolumeParalepipedo());
 
    }

    public static class Paralepipedo{
        private double alturaParalepipedo;
        private double larguraParalepipedo;
        private double comprimentoParalepipedo;

        public Paralepipedo (double alturaParalepipedo, double larguraParalepipedo, double comprimentoParalepipedo){
            this.alturaParalepipedo = alturaParalepipedo;
            this.larguraParalepipedo = larguraParalepipedo;
            this.comprimentoParalepipedo = comprimentoParalepipedo;
        }

        public double calculaAreaParalepipedo(){
            return 2*((alturaParalepipedo*larguraParalepipedo )+ (alturaParalepipedo+comprimentoParalepipedo)+(larguraParalepipedo*comprimentoParalepipedo));
        }

        public double calculaVolumeParalepipedo(){
            return alturaParalepipedo*comprimentoParalepipedo*larguraParalepipedo;
        }

        
    }
}
