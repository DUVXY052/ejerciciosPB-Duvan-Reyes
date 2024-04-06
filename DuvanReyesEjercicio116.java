import java.util.Scanner;
public class DuvanReyesEjercicio116 {
    public static void main(String[] args) {

        int suma=0;
        int sum=1;
        for(int i=1; i <= 1000; i++){
            
            if (i % 2 == 0) {
                suma+=i;
                System.out.print(suma);
                if (i < 1000){
                    System.out.print(", ");
                }
            }

            if (i <= 50 && i % 2 != 0) {
                sum *=i;
               
            } 
        }
        System.out.println("");
        System.out.print("\nMult de numeros impares del 1 al 50: " + sum);

    }
}
