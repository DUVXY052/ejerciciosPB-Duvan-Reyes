import java.util.Scanner;
public class DuvanReyesEjercicio50 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");

        float n1= inter.nextFloat();

        float n2= inter.nextFloat();

        float sum= n1 + n2;

        float mult= n1 * n2;

        System.out.println("La suma de los numeros "+ n1 +" y "+ n2 +" es de " + sum +" y la multiplicacion es de " +mult);
    }
}
