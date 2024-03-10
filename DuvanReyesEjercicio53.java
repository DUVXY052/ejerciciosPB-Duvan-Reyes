import java.util.Scanner;
public class DuvanReyesEjercicio53 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);

        System.out.println("Ingrese la medida de un lado del cuadrado: ");

        int lad1=key.nextInt();

        int area= lad1 * lad1;

        System.out.println("El area del cuadrado es de: " + area);

    }
}
