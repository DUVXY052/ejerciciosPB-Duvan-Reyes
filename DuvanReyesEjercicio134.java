import java.util.Scanner;

public class DuvanReyesEjercicio134 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese 3 numeros: ");
        int n1=inter.nextInt();

        int n2=inter.nextInt();

        int n3=inter.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("No se pueden repetir los numeros");
            
        } else if ((n1 > n2 && n2 > n3) || (n1 > n3 && n3 > n2)) {
            System.out.println("El mayor es " + n1 + " y el intermedio es " + n2 + " y el menor es " + n3);
        } else if ((n2 > n1 && n1 > n3) || (n2 > n3 && n3 > n1)) {
            System.out.println("El mayor es " + n2 + " y el intermedio es " + n1 + " y el menor es " + n3);
        } else if ((n3 > n1 && n1 > n2) || (n3 > n2 && n2 > n1)) {
            System.out.println("El mayor es " + n3 + " y el intermedio es " + n1 + " y el menor es " + n2);
        } else {
            System.out.println("El mayor es " + n3 + " y el intermedio es " + n2 + " y el menor es " + n1);
        }
        
    }
}

