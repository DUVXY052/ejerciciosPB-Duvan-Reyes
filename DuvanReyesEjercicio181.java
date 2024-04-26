import java.util.Scanner;
public class DuvanReyesEjercicio181 {

    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
    
        System.out.println("Ingrese un numero: ");
        int num = inter.nextInt();
    
        if (num <= 1) {
            System.out.println("numero invalido ingrese un entero positivo");
        }
 
        int sum = 1;
        for (int i= 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        
        if ( sum == num) {
            System.out.println("Es un numero perfecto");
            
        } else {
            System.out.println("No es un numero entero perfecto");
        }

    }
}