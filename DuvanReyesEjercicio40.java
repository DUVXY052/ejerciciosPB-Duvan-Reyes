import java.util.Scanner;
public class DuvanReyesEjercicio40 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese los kilos de oro ");
        double KgGold=entrada.nextDouble();

        System.out.println("Precio por onza en pesos: ");
        double Price=entrada.nextDouble();

        double gramos= (KgGold * 1000) / 28.3495 ;

        double PrxOz= gramos * Price;

        System.out.println("El precio por Onza es de " + PrxOz);
    }
}
