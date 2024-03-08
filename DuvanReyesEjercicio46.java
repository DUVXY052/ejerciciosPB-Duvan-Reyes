import java.util.Scanner;

public class DuvanReyesEjercicio46 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        double metrs=1852; 

        System.out.println("Ingrese las millas");
        
        double miles=leer.nextInt();

        double meters= miles * metrs;

        System.out.println("La distancia en millas expresada en metros es de " + meters);
    }
}
