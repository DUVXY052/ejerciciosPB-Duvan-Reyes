import java.lang.foreign.Arena;
import java.util.*;
public class DuvanReyesEjercicio5{

    public static void main(String arg[]){

        Scanner leer=new Scanner(System.in);

        System.out.println("AREA DE UN ROMBO");
        System.out.println("");
        
        System.out.println("Ingrese la longitud de la diagonal 1: ");

        float DIAG1=leer.nextFloat();

        System.out.println("Ingrese la longitud de la diagonal 2: ");

        float DIAG2=leer.nextFloat();

        float AREA= (DIAG1 * DIAG2) / 2;

        System.out.println("El area del rombo es de: " + AREA);



    }

}