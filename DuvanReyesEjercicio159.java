import java.util.Scanner;

public class DuvanReyesEjercicio159 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        numPrimo(num);

        if (numPrimo(num)== true){
            System.out.println("Numero primo");
        } else {
            System.out.println("No es primo");
        }
    }
    public static boolean numPrimo(int num){
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
