import java.util.Scanner;

public class DuvanReyesEjercicio166 {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);

        System.out.println("Ingrese su peso: ");
        double kgpeso= sal.nextDouble();

        System.out.println("Ingrese su altura: ");
        double estature= sal.nextDouble();

        double Imc = kgpeso / Math.pow(estature, 2);

        if (Imc <= 18.5) {
            System.out.println("Estas llevao");
        } else if (Imc < 25) {
            System.out.println("Estas bien pelao!");
        } else {
            System.out.println("Deja la tragadera que estaaas gordo");
        }
        System.out.println("Su IMC dados el peso de " + kgpeso + " kg y la altura " + estature + " es de " + Imc );
    }
}