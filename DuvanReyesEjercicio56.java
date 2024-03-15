import java.util.Scanner;

public class DuvanReyesEjercicio56 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese los segundos: ");

        double sec = inter.nextInt();
        
        double mins = sec / 60;

        double hours = mins / 60;

        System.out.println("En " + sec + " segundos hay " + mins + " minutos y " + hours + " hora(s)");
    }
}
