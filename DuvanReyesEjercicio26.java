import java.util.Scanner;
public class DuvanReyesEjercicio26 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese el lado del cateto a: ");
        double catA=leer.nextDouble();

        System.out.println("Ingrese el lado del cateto b: ");
        double catB=leer.nextDouble();

        double Hpten= (catA * catA) + (catB * catB);

        System.out.println("El cuadrado de la hipotenusa es de: " + Hpten);
        
    }
}
