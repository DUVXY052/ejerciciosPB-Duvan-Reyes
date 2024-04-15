import java.util.Scanner;

public class DuvanReyesEjercicio142 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        double numbr= leer.nextDouble();

        System.out.println("Ingresa el exponente: ");
        double expo= leer.nextDouble();

        double Nexp= Math.pow(numbr,expo);

        System.out.println(numbr + " elevado a " + expo + " es igual a " + Nexp);
    }
}
