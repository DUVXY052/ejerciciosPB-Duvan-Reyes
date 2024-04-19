import java.util.Scanner;

public class DuvanReyesEjercicio170 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("------DIVISIONES------\n");
        System.out.println("Ingrese el numerador: ");
        double numr = inter.nextInt();

        System.out.println("Ingrese el denominador : ");
        double denom= inter.nextInt(); 

        System.out.println("Ingrese el numerador 2: ");
        double numr2 = inter.nextInt();

        System.out.println("Ingrese el denominador 2: ");
        double denom2= inter.nextInt();

        double fracS= numr + numr2;

        double fracR=  numr - numr2;

        System.out.println("Resultado Suma: " + fracS+"/"+denom);
        System.out.println("Resultado Resta: " + fracR+"/"+denom);

    }
}