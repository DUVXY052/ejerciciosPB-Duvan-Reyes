import java.util.Scanner;

public class DuvanReyesEjercicio94 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num=key.nextInt();

        int vabs= Math.abs(num);
        
        System.out.println("El valor absoluto es de " + vabs);
    }
}
