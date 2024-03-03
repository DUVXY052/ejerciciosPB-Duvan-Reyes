import java.util.Scanner;
public class DuvanReyesEjercicio38 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int kg=8, Mz=4;

        System.out.println("Ingrese la edad de la persona: ");

        int birth=leer.nextInt();

        int GRMtotales= (birth * kg) * 1000;

        int Manzanas= GRMtotales / Mz;

        //System.out.println(Manzanas);

        System.out.println("La cantidad de fruta consumida en gramos es de: " + GRMtotales + " y las manzanas consumidas en esos años son " + Manzanas);
    }
}
