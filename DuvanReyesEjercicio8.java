import java.util.*;

public class DuvanReyesEjercicio8 {
    public static void main(String[] arg) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dividendo...");

        int div = leer.nextInt();

        System.out.println("Ingrese el divisor...");

        int divisor = leer.nextInt();

        int cocint = div / divisor;

        int Rest = div - (cocint * divisor);

        System.out.println("El resto es de :" + Rest);
    
    }
}