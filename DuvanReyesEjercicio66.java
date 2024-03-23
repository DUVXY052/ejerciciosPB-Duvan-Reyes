import java.util.Scanner;

public class DuvanReyesEjercicio66 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num=inter.nextInt();

        int sum=0;

        for(int i=1; i<=2*num - 1; i +=2){
            System.out.println(sum + "+" + i);
            sum+=i;
            // 

        }System.out.println("La suma de todos los valores es de " + sum);
    }
}
