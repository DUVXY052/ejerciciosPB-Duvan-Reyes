import java.util.Scanner;

public class DuvanReyesEjercicio72 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double taf=5900;

        System.out.println("Ingrese las horas trabajadas: ");
        double hours=leer.nextDouble();

        double pago= hours * taf;

        if (hours > 40) {
            double hourExt= hours - 40;
            double incrm= hourExt * (taf * 0.50);
            double pagoT=pago + incrm;
            System.out.println("El trabajo por horas extras recibira " + pagoT);
        } else {
            System.out.println("El pago total sera de " + pago +"$");
        }
    }
}
