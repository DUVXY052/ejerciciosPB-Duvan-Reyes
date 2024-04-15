import java.util.Scanner;

public class DuvanReyesEjercicio144 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        
        int suma=0;
        int mult=1;

        for (int i=1; i<= 100; i++){

            if (i % 2 == 0) {
                suma+=i;
                System.out.print(i);
                if(i < 100){
                    
                    System.out.print(" + ");
                }
            }
            
            
        }System.out.print(" = " +suma);
        System.out.println(" \n");

        for (int i=1; i<= 100; i++){
            if (i % 2 != 0) {
                mult*=i;
            
                System.out.print(i);
                if(i < 99){
                    System.out.print(" x ");
                }
            }
        }System.out.print(" = " +mult);

    }
}
