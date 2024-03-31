import java.util.Scanner;

public class DuvanReyesEjercicio103 {
    public static void main(String[] args) {
        Scanner mew =new Scanner(System.in);

        System.out.println("Ingrese el 1er numero ");
        int n1=mew.nextInt();

        System.out.println("Ingrese el 2do numero ");
        int n2=mew.nextInt();

        System.out.println("Ingrese el 3er numero ");
        int n3=mew.nextInt();

        if (n1 < n2 && n1 < n3 ) {
            System.out.println("El menor es " + n1);
        } else if (n2 < n1 && n2 < n3){
            System.out.println("El menor es " + n2);
            
        }else{
            System.out.println("El menor es " + n3);
        }

    }
}
