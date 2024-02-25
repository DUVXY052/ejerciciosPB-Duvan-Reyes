import java.util.Scanner;
public class DuvanReyesEjercicio24 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Ingrese el numero de pulgadas: ");

        double tombs= key.nextDouble();
        
        double NCMs= tombs * 2.54;

        System.out.println("El numero de cm obtenido de las pulgadas es de: " + NCMs);
    }
}