import java.util.Scanner;
    public class DuvanReyesEjercicio135 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de números: ");
        int Totnum = leer.nextInt();

        int up = Integer.MIN_VALUE;
        int down = Integer.MAX_VALUE;

        for (int i= 1; i <= Totnum; i++) {
            System.out.println("Ingresa el número " + i + ": ");
            int nums = leer.nextInt();

            if (nums > up) {
                up = nums;
            }

            if (nums < down) {
                down = nums;
            }
        }

        System.out.println("El número mayor es " + up + " y el menor es " + down);
    }
}
 