import java.util.Scanner;

public class DuvanReyesEjercicio89 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los metros: ");
        double mtrs=input.nextInt();

        double klmtr= mtrs / 1000;

        System.out.println("Los " + mtrs + " metros expresados en Klmtrs son de " + klmtr + " Km");
    }
}
