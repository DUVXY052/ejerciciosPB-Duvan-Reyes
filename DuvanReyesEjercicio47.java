import java.util.Scanner;
public class DuvanReyesEjercicio47 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double price=leer.nextDouble();

        System.out.println("Ingrese la cantidad del producto: ");
        double cant=leer.nextDouble();

        System.out.println("Ingrese el valor pagado: ");
        double val=leer.nextDouble();

        double desc=((price * cant) - val) / (price * cant) * 100;
        //double descT= desc * 100;

        System.out.println("El descuento por su compra es del " + desc+"%");



    }
}
