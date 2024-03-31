import java.util.Scanner;

public class DuvanReyesEjercicio109 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra: ");
        double price= leer.nextInt();
        
        if (price > 1000){
            price = price - (price * 0.10);
            System.out.println("El monto de la venta con el descuento del 10% es de $" + price + " pesos");
        }else {
            System.out.println("El monto de la venta es de $" + price + " pesos");
        }
    }
}
