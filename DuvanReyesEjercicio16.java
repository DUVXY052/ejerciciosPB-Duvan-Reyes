import java.util.*;
public class DuvanReyesEjercicio16 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("\nGUIA DE CALIFICACION");
        System.out.println("");
        System.out.println("Nota perfecta: 5.0");
        System.out.println("Nota promedio: 3.5");
        System.out.println("");
        System.out.println("Ingrese su nota: ");

        float note=leer.nextFloat();

        if (note >= 3.0) {
            System.out.println("Aprobo el examen");
        } else {
            System.out.println("Reprobo el examen");
        }

    }
}