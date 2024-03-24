import java.util.Scanner;
public class DuvanReyesEjercicio83 {
    public static void main(String[] args) {
        Scanner intro= new Scanner(System.in);

        System.out.println("Ingrese sus notas: ");
        
        int sum=0;

        for(int i=0; i < 3; i++){
            System.out.print("Nota " + (i+1)+ ": ");
            float Nt=intro.nextFloat();
            sum+=Nt;

        }
        
        float prom= sum / 3;

        if (prom > 7){
            System.out.println("APROBADO");
        }else{
            System.out.println("MEJORE LA NOTA");
        }

        System.out.println(prom);
    }
}
