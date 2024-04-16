import java.util.Scanner;

public class DuvanReyesEjercicio106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int m = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n = input.nextInt();

        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }

        System.out.println("El máximo común divisor es: " + m);
    }
}

