import java.util.Scanner;

public class DuvanReyesEjercicio51 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Ingrese la base y la altura del rectangulo: ");

        int base=key.nextInt();

        int alt=key.nextInt();

        int area= (base * alt) / 2;

        System.out.println("El area del rectangulo es de: " + area);

        int perim= 2 * (base + alt);

        System.out.println("El perimetro es de: " + perim);

    }
}
