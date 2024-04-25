import java.util.Scanner;

public class DuvanReyesEjercicio177 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = inter.nextInt();
        
        System.out.println("\nSus divisores son:");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
               System.out.println(i);
            }
        }
    }
}