import java.util.Scanner;

public class DuvanReyesEjercicio69 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int n = inter.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            } else {
                suma += 2;
            }
        }

        System.out.println("El valor es de: " + suma);
    }
}
