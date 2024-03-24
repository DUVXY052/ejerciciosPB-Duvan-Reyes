import java.util.Scanner;

public class DuvanReyesEjercicio87 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Ingrese la altura: ");
        int Alt=input.nextInt();

        System.out.println("Ingrese la base: ");
        int bas=input.nextInt();

        int Area= (bas * Alt) / 2;
        
        if (Area > 1000){
            System.out.println("DATOS INVALIDOS...");
        }

        System.out.println("Area es igual a " + Area);
        input.close();
    }
}
