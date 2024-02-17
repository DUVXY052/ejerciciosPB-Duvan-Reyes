import java.util.*;
public class DuvanReyesEjercicio10 {

    public static void main(String[] abc) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese la altura del ttriangulo: ");

        float ALTR=inter.nextFloat();

        System.out.println("Ingrese la base del triangulo: ");

        float BAST=inter.nextFloat();

        Float areaT= (ALTR * BAST) / 2;

        System.out.println("El area del triangulo es de " + areaT + " CM");
    }
}
