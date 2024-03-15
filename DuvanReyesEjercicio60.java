import java.util.Scanner;
public class DuvanReyesEjercicio60 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, a=0 ;

        //System.out.println("Ingresa un numero: ");
        do {
            System.out.println("Ingresa un numero: ");

            num=leer.nextInt();

            if (num > 0) {
              a++; 
            }
            
            
        } while (num != 0);

        System.out.println("La cantidad de valores ingresados mayores a cero es de " + a);
    }
}
