import java.util.Scanner;
public class DuvanReyesEjercicio67 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int n1=inter.nextInt();

        int fact=1;
        

        for(int i=1; i <= n1; i++){
            System.out.print(i);

            fact*=i;
            
            if (i < n1){
                System.out.print(" x ");
            }

        }System.out.println("= " + fact + " Es la factorial del numero " + n1);
          
    }
}

