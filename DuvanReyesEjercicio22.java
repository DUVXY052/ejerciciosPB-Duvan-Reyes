import java.util.Scanner;
public class DuvanReyesEjercicio22 {
    public static void main(String abx[]) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingresa un numero decimal: ");
        double num1 = leer.nextDouble();

        int Ent = (int) num1;

        double Dec = num1 - Ent;

        System.out.println("La parte entera del numero es " + Ent + " y la decimal es " + Dec);
        
    }
}
