import java.util.Scanner;
public class DuvanReyesEjercicio11 {

    public static void main(String[] abc) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el largo del rectangulo:");

        float large=leer.nextFloat();

        System.out.println("Ingrese el ancho del rectangulo:");

        float broad=leer.nextFloat();

        float Area= large * broad;

        System.out.println("El area del rectangulo es de: " + Area);
    }
}