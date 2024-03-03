import java.time.LocalDate;
import java.util.Scanner;
public class DuvanReyesEjercicio39 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double dream=0.34;

        LocalDate today = LocalDate.now();
        int yearNow = today.getYear();
        
        System.out.println("Ingrese su nombre: ");

        String name=leer.next();

        System.out.println("Ingrese su año de nacimiento: ");

        int birth= leer.nextInt();

        int edad= yearNow - birth;

        double years= dream * edad;

        double sleep=Math.round(years * 365);

        System.out.println("La cantidad de dias que " + name + " ha dormido en su vida es de " + sleep);

        
    }
}
