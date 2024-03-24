import java.util.Scanner;

public class DuvanReyesEjercicio85 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresar un numero: ");
        int num1= leer.nextInt();

        if (num1 <= 1) {
          System.out.println("Error: Ingresa un número mayor que 1");
        }else{
            boolean Noprim = true;
            for (int i = 2; i <= Math.sqrt(num1); i++){
                if (num1 % i == 0) {
                    Noprim = false;
    
                    break;
                }
            }
            
            if (Noprim) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        

        }
    leer.close();
    }
}

