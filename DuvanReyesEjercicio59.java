import java.util.Scanner;
public class DuvanReyesEjercicio59 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int nmber= leer.nextInt();

        int a=0;

        for(int i=0; i <= 10; i++) {
            a= nmber * i;
            System.out.println(nmber + " x " + i + " = " + a);
        } 


    }
}
