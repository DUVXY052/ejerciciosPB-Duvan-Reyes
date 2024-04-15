import java.util.Scanner;

public class DuvanReyesEjercicio139 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int num = inter.nextInt();

        int fact= 1;

        for(int i=1; i<= num; i++){
            System.out.println(fact+"x"+i);

            fact*=i;

        }System.out.println("=" + fact);
    }
}
