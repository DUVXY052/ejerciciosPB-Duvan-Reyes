import java.util.Scanner;

public class DuvanReyesEjercicio108 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = inter.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Numero es par");
        }else{
            System.out.println("Numero es impar");
        }
    }
}