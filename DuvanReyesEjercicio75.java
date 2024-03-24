import java.util.Scanner;

public class DuvanReyesEjercicio75 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese el año: ");
        int year=leer.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("El año es biciesto...");
        }else{
            System.out.println("El año no es biciesto...");
        }
    }
}
