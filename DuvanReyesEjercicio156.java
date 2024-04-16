import java.util.Scanner;

public class DuvanReyesEjercicio156 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Cadena 1: ");
        String chain1= inter.nextLine();
        String chain2= inter.nextLine();
        
        String Mchain1= chain1.toUpperCase();System.out.println(Mchain1);
        String Mchain2= chain2.toUpperCase();System.out.println(Mchain2);

        System.out.println();

        if ( Mchain1.equals(Mchain2)){
            System.out.println("Ambas cadenas son inguales...");
        } else { 
            System.out.println("Las cadenas no son iguales...");
        }
    }
}
