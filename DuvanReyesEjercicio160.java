import java.util.Scanner;

public class DuvanReyesEjercicio160 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los segundos: ");
        double secs= leer.nextDouble();

        double days= secs / 86400;

        double horas = secs / 3600;

        double mins= secs / 60;

        System.out.println("En " + secs + " segundos hay " + days + " dias, " + horas + " horas y " + mins + " minutos");
    }
}