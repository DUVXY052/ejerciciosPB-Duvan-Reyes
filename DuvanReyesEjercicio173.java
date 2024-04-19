import java.util.Scanner;

public class DuvanReyesEjercicio173 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);

        System.out.println("----FACTURA----\n");
        System.out.println("Introduzca la cantidad del producto: ");
        double cant= inter.nextDouble();

        System.out.println("Introduzca el precio: ");
        double price= inter.nextDouble();

        double Pgtot= cant * price;

        System.out.println("El total a pagar por su productos sera de: $" +Pgtot+ " pesos");
    }
}