import java.util.Scanner;
public class DuvanReyesEjercicio101 {
    public static void main(String[] args) {
        Scanner iner= new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = iner.nextInt();

        do {
            
            for (int i=1; i <= 99; i++){
                System.out.println(num + " ÷ " + i);
               int div = num % i;

               if (div == 0) {
                System.out.println("Divisible");
               }else{
                System.out.println("No es divisible");
                break;
               }
            }
            
        } while (false);

    }
}
