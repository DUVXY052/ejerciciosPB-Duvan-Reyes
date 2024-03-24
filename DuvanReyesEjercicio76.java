import java.util.Scanner;

public class DuvanReyesEjercicio76 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = inter.nextInt();

        int digits= Integer.toString(num).length();

        System.out.println("La cantidad de digitos de " + num + " es de " + digits);
    }
}