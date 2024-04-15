import java.util.Scanner;

public class DuvanReyesEjercicio151 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String chain= leer.nextLine();

        int longe = chain.length();

        if (longe > 10) {
            System.out.println(chain);
        }
    }
}
