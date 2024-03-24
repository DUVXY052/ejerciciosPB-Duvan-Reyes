import java.util.Scanner;
public class DuvanReyesEjercicio78 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese la cantidad a pagar: ");
        int valor=inter.nextInt();
        
        if (valor > 10000) { 
            System.out.println("Descuento del 20% para " + valor + " TOTAL: " + (valor - (valor * 0.20)));
        }else{
            System.out.println("Descuento del 10% para " + valor + " TOTAL: " + (valor - (valor * 0.10)));

        }

    }
}
