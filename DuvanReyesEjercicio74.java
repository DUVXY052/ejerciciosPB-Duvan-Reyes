import java.util.Scanner;

public class DuvanReyesEjercicio74 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int n1 = leer.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int n2 = leer.nextInt();

        System.out.println("Ingrese el numero 3: ");
        int n3 = leer.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El número mayor es: " + n1);
            if (n2 > n3) {
                System.out.println("El número intermedio es: " + n2);
                System.out.println("El número menor es: " + n3);
            } else {
                System.out.println("El número intermedio es: " + n3);
                System.out.println("El número menor es: " + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El número mayor es: " + n2);
            if (n1 > n3) {
                System.out.println("El número intermedio es: " + n1);
                System.out.println("El número menor es: " + n3);
            } else {
                System.out.println("El número intermedio es: " + n3);
                System.out.println("El número menor es: " + n1);
            }
        } else {
            System.out.println("El número mayor es: " + n3);
            if (n1 > n2) {
                System.out.println("El número intermedio es: " + n1);
                System.out.println("El número menor es: " + n2);
            } else {
                System.out.println("El número intermedio es: " + n2);
                System.out.println("El número menor es: " + n1);
            }
        }
    }
}
