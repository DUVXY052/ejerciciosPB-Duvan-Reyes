import java.util.Scanner;

public class DuvanReyesEjercicio104 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double num = inter.nextInt();

        System.out.println("Ingrese el indice: ");
        double ind= inter.nextInt();

        if (ind == 2) {
            double raid= Math.sqrt(num);
            System.out.println("La raiz cuadrada de " + num + " es " + raid);
        } else if (ind == 3){
            double raid= Math.pow(num, 1.0/ ind);
            System.out.println("La raiz cubica de " + num + " es " + raid);

        } else {
            double raid= Math.pow(num, 1.0/ ind);
            System.out.println("La raiz de " + num + " es " + raid);
        }

    }
}
