import java.util.Scanner;

public class DuvanReyesEjercicio133 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese 2 numeros: ");
        int n1=inter.nextInt();

        int n2=inter.nextInt();

        if (n1 > n2) {
            System.out.println("El mayor es " + n1 +" y el menor es " + n2);
        } else {
            System.out.println("El mayor es " + n2 +" y el menor es " + n1);
        }
    inter.close();  
    }
}