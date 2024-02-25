import java.util.Scanner;
public class DuvanReyesEjercicio25{
    public static void main(String [] a) {
        Scanner key=new Scanner(System.in);

        System.out.println("Ingrese los grados centigrados");
        
        double GCent = key.nextDouble();

        //Conversion a grados fahrenheit

        double Gfahr = (GCent * 9) / 5 + 32;
        System.out.println("La cantidad en grados fahrenheit es de: " + Gfahr + "°");
    }

}