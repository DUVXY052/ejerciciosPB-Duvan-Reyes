import java.util.Scanner;

public class DuvanReyesEjercicio118 {
    public static void main(String[] args) {
        Scanner rand=new Scanner(System.in);
        int []productos= new int[10];

        System.out.println("Ingrese los precios de los productos");

        int plus=0;

        for(int i = 0; i < 10 ; i++ ){
            System.out.println("PRODUCTO " + (i+1)+ ": ");
            int prod=rand.nextInt();

            plus+=prod;

        }

        int Tpag=plus;

        System.out.println("::::TOTAL A PAGAR::::");
        System.out.println("     $"+plus+ " COP");
        System.out.println("\ngracias por su compra....");
    }
}
