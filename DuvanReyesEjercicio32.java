import java.util.Scanner;
public class DuvanReyesEjercicio32 {
    public static void main(String abc[]) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el largo del rectangulo:");

        double large=leer.nextDouble();

        System.out.println("Ingrese el ancho del rectangulo:");

        double broad=leer.nextDouble();

        double Area= large * broad;

        double AreaC= Area * 100;

        double Armm= AreaC * 10;

        int Aream= (int) Armm;

        System.out.println("El area del rectangulo es de: " + Area);
        System.out.println("El area expresada en centimetros es de: " + AreaC);
        System.out.println("El area expresada en milimetros es de: " + Aream );
    }
}