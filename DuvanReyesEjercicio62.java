import java.util.Scanner;
public class DuvanReyesEjercicio62 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);
        int temp;

        int suma = 0;
        int hight= Integer.MIN_VALUE;
        int low= Integer.MAX_VALUE;

        System.out.println();

        for (int i = 1; i <= 24; i += 4) {
            System.out.println("Ingrese la temperatura a la hora " + i);
            temp = inter.nextInt();
            suma += temp;

            if (temp > hight) {
                hight = temp;
            }

            if (temp < low) {
                low = temp;
            }
        }

        int medtemp = suma / 6;

        System.out.println("La temperatura más alta del día es de: " + hight);
        System.out.println("La temperatura más baja del día es de: " + low);
        System.out.println("La temperatura media del día es de: " + medtemp);
    }
}
