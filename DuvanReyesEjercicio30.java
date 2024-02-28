import java.util.Scanner;
public class DuvanReyesEjercicio30 {
    public static void main(String abx[]) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los Km: ");
        float Kmtrs= leer.nextFloat();

        float Mtrs= Kmtrs * 1000;

        System.out.println("Los " + Kmtrs + " Km en metros son " + Mtrs + " mtrs");
    }
}
