import java.util.Scanner;

public class DuvanReyesEjercicio55 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = inter.nextInt();

        if (Numprimo(num)) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }

    public static boolean Numprimo(int num){
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
