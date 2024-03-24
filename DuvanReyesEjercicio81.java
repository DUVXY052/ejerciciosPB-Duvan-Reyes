import java.util.Scanner;

public class DuvanReyesEjercicio81 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        double rad=leer.nextInt();

        double Area= Math.PI * Math.pow(rad, 2);

        if (Area >= 5000){
            System.out.println("DATOS ERRÓNEOS");
        }
        
        System.out.println("El area del circulo es de: " + Math.round(Area));

    }
}
