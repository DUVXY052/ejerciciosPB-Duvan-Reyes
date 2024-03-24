import java.util.Scanner;

public class DuvanReyesEjercicio82 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num1=intro.nextInt();

        if(num1 > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
