import java.util.Scanner;

public class DuvanReyesEjercicio121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros: \n");

        int sum=0;

        for(int i=0; i < 5; i++){
            System.out.println("Ingrese el numero " + (i+1));
            int nums=scanner.nextInt();

            sum+= nums;
        }
        System.out.println("La suma de los numero es de: " + sum);
    }
}
