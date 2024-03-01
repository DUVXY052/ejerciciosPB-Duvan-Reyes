import java.util.Scanner;
public class DuvanReyesEjercicio34 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("\nCosto del producto: ");
        double Price= leer.nextDouble();

        if (Price > 1000 ) {
            double Descuento = Price - (Price * 0.10);
            System.out.println("El total a pagar es de: " + Descuento); 
            
        } else if(Price > 500 & Price <= 1000 ) {
            double Descuento = Price - (Price * 0.20);
            System.out.println("El total a pagar es de: " + Descuento);
            
        } else {
            System.out.println("No hay escuento");
        }
    }
}
