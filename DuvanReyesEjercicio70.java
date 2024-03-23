import java.util.Scanner;

public class DuvanReyesEjercicio70 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num=inter.nextInt();

        int sum=0;

        for(int i=1; i<=num; i++){
            System.out.print(i);
            if (i % 2 == 1) {
                
                sum += i;
            } else {
              
                sum -= i;
            }

            if (i % 2 ==0 && i < num){
                System.out.print(" + ");
            }else if (i < num) {
                System.out.print(" - ");
            }else{
                System.out.println(".");
            }
        }System.out.println("La suma de todos los valores es de " + sum);
    }
}


