import java.util.Scanner;

public class DuvanReyesEjercicio122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums, cont=0;

        System.out.println("Ingrese numeros: \n");

        int sum=0;
        
        do {
             cont++;

            System.out.println("Ingrese el numero " + cont);

            nums=scanner.nextInt();
    
            sum+= nums;

            if (nums == 0 ) {
                break;
            }
        
            
        } while (true);
        
        System.out.println("La suma de los numero es de: " + sum);

    }
}