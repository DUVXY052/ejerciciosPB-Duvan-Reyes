import java.util.Scanner;

public class DuvanReyesEjercicio88 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los voltajes: ");
 
        int sum=0;

        for(int i=0; i < 3; i++){
            System.out.println("Vol " + (i+1)+ ": ");
            float Vol=leer.nextFloat();
            sum+=Vol;

        }

        int prom= sum/ 3;

        if (prom < 115) {
            System.out.println("VOLTAJE CORRECTO");
        } else if(prom > 115 && prom < 220){
            System.out.println("ALTO VOLTAJE");
        }else{
            System.out.println("PELIGRO");
        }
leer.close();
    }

}
