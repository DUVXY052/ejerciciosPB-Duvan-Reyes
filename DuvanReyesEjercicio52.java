import java.util.Scanner;

public class DuvanReyesEjercicio52 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int n1=inter.nextInt();

        for(int i=0; i<=10; i++) {
           int mult = n1 * i;
           System.out.println(n1 + " x " + i + " = " + mult);
        }
    }
}
