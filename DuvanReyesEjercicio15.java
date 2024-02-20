import java.util.Scanner;
public class DuvanReyesEjercicio15 {

    public static void main(String[] arb) {
        Scanner key=new Scanner(System.in);

        System.out.println("Introduce la fecha de nacimiento: ");

        int birth= key.nextInt();

        int year= 2024 - birth;

        if (year <= 17 ) {
            System.out.println("ES menor de edad");

        } else if (year >= 18){
            System.out.println("Es mayor de edad");
            
        }  else {
            System.out.println("//{ERROR-}");
        
        }
    }
}