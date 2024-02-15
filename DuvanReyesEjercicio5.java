import java.util.*;
public class DuvanReyesEjercicio5{

    public static void main(String arg[]){

        Scanner leer=new Scanner(System.in);

        System.out.println("AREA DE UN ROMBO");
        System.out.println("");
        
        System.out.println("Ingrese la longitud de la 1ra diagonal: ");

        double DIAG1=leer.nextDouble();

        System.out.println("Ingrese la longitud de la 2da diagonal: ");

        double DIAG2=leer.nextDouble();

        double AREA= (DIAG1 * DIAG2) / 2;

        System.out.println("El area del rombo es de: " + AREA);



    }

}