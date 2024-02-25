import java.util.*;
public class DuvanReyesEjercicio17 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int num1=inter.nextInt();
        
        System.out.println("Ingrese otro numero: ");

        int num2=inter.nextInt();

        if (num1 > num2) {
            System.out.println("El numero 1 es el mayor");
            
        } else if (num1 < num2){
            System.out.println("El numero 2 es el mayor");
        }
    }
    
}
