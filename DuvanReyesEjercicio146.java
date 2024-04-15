import java.util.Scanner;
public class DuvanReyesEjercicio146 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int n=leer.nextInt();
         
        int num1=1;
        int num2=1;

        for(int i=1; i <= n; i++){
            
            int sumN= num1 +num2;

            System.out.println(" " + sumN);
            num1 = num2;
            num2 = sumN; 
              
        }
    }
}
