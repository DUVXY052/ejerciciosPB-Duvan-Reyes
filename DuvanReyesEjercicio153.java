import java.util.Scanner;

public class DuvanReyesEjercicio153 {
    public static void main(String[] args) {
        Scanner key =new Scanner(System.in);
        
        System.out.println("Cadena 1: ");
        String chain1= key.nextLine();

        System.out.println("Cadena 2: ");
        String chain2= key.nextLine();

        if (chain1.equals(chain2)){
            System.out.println("Ambas cadenas son iguales");

        } else {
            if (chain1.length() > chain2.length()){
                System.out.println(chain1 + "!"+ " es la cadena mas larga");
            } else {
                System.out.println(chain2 + "!"+ " es la cadena mas larga");
            }
        }
    }
}
