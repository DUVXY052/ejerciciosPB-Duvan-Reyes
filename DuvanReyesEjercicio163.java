import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class DuvanReyesEjercicio163 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese el numero A: ");
        int nA= inter.nextInt();

        System.out.println("Ingrese el numero B: ");
        int nB= inter.nextInt();

        int sumAyB= nA + nB;

        int resAyB= nA - nB;

        int multi = nA * nB;

        int div = nA / nB;

        int res = nA % nB;

        System.out.println("LAS OPERACIONES ENTRE LOS NUMEROS " + nA +" y "+ nB + " son:");
        System.out.println("SUMA: " + sumAyB);
        System.out.println("RESTA: " + resAyB);
        System.out.println("MULTIPLICACION: " + multi);
        System.out.println("DIVISION: "+ div);
        System.out.println("Resto: " + res);
    }
}
