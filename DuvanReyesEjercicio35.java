import java.util.Scanner;
public class DuvanReyesEjercicio35 {
    public static void main(String[] args) {
        Scanner Intro=new Scanner(System.in);

        System.out.println("Ingrese las horas");
        int Hwork= Intro.nextInt();
          
        int Trif=8500;

        int PxHrs= Hwork * Trif;

        if (Hwork > 40) {
            double horasEx= Hwork - 40;
            double incrm= horasEx * (Trif * 0.50);
            double PxHrExt= PxHrs + incrm;
            System.out.println("El trabajo por horas extras recibira " + PxHrExt);
        } else {
            System.out.println("El pago total sera de " + PxHrs +"$");
        }
    }
}
