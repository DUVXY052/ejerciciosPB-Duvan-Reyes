import java.util.Scanner;

public class DuvanReyesEjercicio145 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros: ");

        int n1 = inter.nextInt();
        int n2 = inter.nextInt();
        int n3 = inter.nextInt();

        System.out.print("Segun las  medidas de los lados de un triangulo y los numeros dados estos formarian un triangulo: ");

        if (n1 == n2 && n1 == n3) {
            System.out.println("Equilatero");
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Isoceles");
        } else if (n1 != n2 && n2 != n3 || n1 != n3) {
            System.out.println("Escaleno");
        } else {
            System.out.println("Error los numeros no forman un triangulo");
        }
    }
}