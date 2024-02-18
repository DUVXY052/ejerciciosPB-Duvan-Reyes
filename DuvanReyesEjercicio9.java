import java.util.*;
public class DuvanReyesEjercicio9{

    public static void main(String[] arg) {
        Scanner leer =new Scanner(System.in);
        double valor, Civa=19, iva, Vtotal;
        
        System.out.println("\nCALCULADORA DE IVA");
        System.out.println("");

        System.out.println("Ingrese el valor del producto: ");

        valor=leer.nextDouble();
        
        iva = valor * Civa / 100;

        Vtotal= valor + iva;

        System.out.println("Valor sin iva: " + valor);

        System.out.println("Valor total: " + Vtotal);
    }
}