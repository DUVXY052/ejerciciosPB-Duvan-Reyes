import java.util.Scanner;
public class DuvanReyesEjercicio68 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = inter.nextInt();

        int suma = 0;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
            suma += fact;
        }

        System.out.println("La suma de los factoriales es de: " + suma);
    }
}
