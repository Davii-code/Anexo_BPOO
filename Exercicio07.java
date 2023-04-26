import java.util.Scanner;
import java.lang.Math;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double raioCone=0;
        double alturaCone =0;

        while(alturaCone<=0 || raioCone<=0){

        System.out.println("Digite o a altura do cone:");
        alturaCone = leitor.nextDouble();

        System.out.println("Digite o raio do cone");
        raioCone = leitor.nextDouble();

        }

        Cone cone = new Cone(alturaCone,raioCone);

        System.out.println("Area Total: "+ cone.calculaAreaTotalCone());
        System.out.println("Area Lateral: "+ cone.calculaAreaLateralCone());
        System.out.println("Geratriz: "+ cone.calculaGeratrizCone());
        System.out.println("Volume: "+ cone.calculaVolumeCone());
    }

    public static class Cone {
        private double raioCone;
        private double alturaCone;


    public Cone (double raioCone, double alturaCone){
        this.alturaCone = alturaCone;
        this.raioCone = raioCone;
    }

    
        public double calculaGeratrizCone(){
            return Math.sqrt((Math.pow(raioCone, 2))+(Math.pow(alturaCone,2)));
        }

        public double calculaAreaTotalCone(){
          return 3.14*raioCone*( calculaGeratrizCone() + raioCone);
        }

        public double calculaAreaLateralCone(){
            return 3.14*raioCone*calculaGeratrizCone();
        }

        public double calculaVolumeCone(){
            return 3.14*((Math.pow(raioCone,2))*alturaCone);
        }

      
    }
}
