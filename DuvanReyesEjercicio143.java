import java.util.Scanner;

public class DuvanReyesEjercicio143 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        
        int suma=0;

        for (int i=1; i<= 100; i++){

            if (i % 2 == 0) {
                suma+=i;
                System.out.print(i);
                if(i < 100){
                    
                    System.out.print(" + ");
                }
            }
        }System.out.println(" = " +suma);
    }
}
