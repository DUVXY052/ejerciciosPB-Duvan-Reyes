import java.util.Scanner;

public class DuvanReyesEjercicio97 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        double Cgen=10000;

        System.out.println("Ingrese el consumo: ");
        double cons=inter.nextDouble();

        double consT= (cons / Cgen) * 100;
        
        if (consT >= 80 && consT <= 100){
            System.out.println("CONSUMO MEDIO");
        }else if(consT > 100){
            System.out.println("ALTO CONSUMO DE ENERGÍA");
        }else{
            System.out.println("CONSUMO NORMAL");
        }
    }
}