import java.util.Scanner;

public class DuvanReyesEjercicio128 {
    public static void main(String[] args) {
        Scanner inter =new Scanner(System.in);
        
        System.out.println("Ingrese un año: ");
        int year = inter.nextInt();

        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println("El año es biciesto");
            
        }else {
            System.out.println("el año no es biciesto");
        }
    }
}
