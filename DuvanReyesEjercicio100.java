import java.util.Scanner;
public class DuvanReyesEjercicio100 {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int n1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int n2 = leer.nextInt();
        
        int sum = n1 + n2;
        System.out.println("suma: "+sum);
        
        if (sum % 2 == 0) {
            System.out.println("La suma de " + n1 + " y " + n2 + " es par");
        } else {
            System.out.println("La suma es impar");
        }
    }
}
