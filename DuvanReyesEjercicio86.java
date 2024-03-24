import java.util.Scanner;

public class DuvanReyesEjercicio86 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los voltajes: ");
 
        int sum=0;

        for(int i=0; i < 5; i++){
            System.out.println("Vol " + (i+1)+ ": ");
            float Vol=leer.nextFloat();
            sum+=Vol;

        }

        int prom= sum/ 5;

        if (prom > 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("VOLTAJE CORRECTO");
        }
leer.close();
    }
}
