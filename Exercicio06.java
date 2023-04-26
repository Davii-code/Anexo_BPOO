import java.util.Scanner;
import java.lang.Math;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double raioCilindro=0;
        double alturaCilindro =0;

        while(alturaCilindro<=0 || raioCilindro<=0){

        System.out.println("Digite o a altura do Cilindro:");
        alturaCilindro = leitor.nextDouble();

        System.out.println("Digite o raio do cilindro");
        raioCilindro = leitor.nextDouble();

        }

        Cilindro cilindro = new Cilindro(alturaCilindro,raioCilindro);

        System.out.println("Area Total: "+ cilindro.calculaAreaTotalCilindro());
        System.out.println("Area Lateral: "+ cilindro.calculaAreaLateralCilindro());
        System.out.println("Geratriz: "+ cilindro.calculaGeratrizCilindro());
        System.out.println("Volume: "+ cilindro.calculaVolumeCilindro());
    }

    public static class Cilindro {
        private double raioCilindro;
        private double alturaCilindro;


    public Cilindro (double raioCilindro, double alturaCilindro){
        this.alturaCilindro = alturaCilindro;
        this.raioCilindro = raioCilindro;
    }

    
        public double calculaGeratrizCilindro(){
            return Math.sqrt((Math.pow(raioCilindro, 2))+(Math.pow(alturaCilindro,2)));
        }

        public double calculaAreaTotalCilindro(){
          return 3.14*raioCilindro*( calculaGeratrizCilindro() + raioCilindro);
        }

        public double calculaAreaLateralCilindro(){
            return 3.14*raioCilindro*calculaGeratrizCilindro();
        }

        public double calculaVolumeCilindro(){
            return 3.14*((Math.pow(raioCilindro,2))*alturaCilindro);
        }

      
    }
}
