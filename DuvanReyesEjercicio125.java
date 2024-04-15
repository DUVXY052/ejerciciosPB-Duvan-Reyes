import java.util.Scanner;

public class DuvanReyesEjercicio125 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");

        int num=inter.nextInt();

        for(int i=1; i <=3000; i++){

            if (i % num==0){
                System.out.println(i);
            }

        }
    }
}