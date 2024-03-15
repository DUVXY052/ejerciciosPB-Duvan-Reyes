import java.util.Scanner;
public class DuvanReyesEjercicio54 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);
        double tombs=2.54;

        System.out.println("Ingrese los centimetros: ");
        double cm=inter.nextDouble();

        double pulgs= cm / tombs;

        System.out.println("En " + cm + " centimetros hay " + Math.round(pulgs) + " pulgadas");
    }
}
