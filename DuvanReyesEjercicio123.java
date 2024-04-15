import java.util.Scanner;

public class DuvanReyesEjercicio123 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el capital: ");
        
        double cap=leer.nextDouble();

        System.out.println("tasa de interes: ");
        double inters= leer.nextDouble();

        System.out.println("Numero de dias: ");
        double days=leer.nextDouble();

        double Fincap = cap * (1 + inters * days);

        System.out.println("El capital final es: " + Fincap);

        System.out.println();
    }
}
