import java.util.Scanner;
public class DuvanReyesEjercicio64 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese x");
        int numx= inter.nextInt();

        System.out.println("Ingrese y");
        int numy= inter.nextInt();

        int mult=1;

        for (int i=0; i < numy ; i ++){
            mult= mult * numx;
        }
        System.out.println("Total de " + numx + " elevado ala " + numy + " es " + mult);


    }
}
