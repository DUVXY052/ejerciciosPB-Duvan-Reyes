import java.util.Scanner;

public class DuvanReyesEjercicio105 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int [] nots = new int[4];
        
        System.out.println("Ingrese las notas: ");

        double sum=0;

        for(int i=0; i < 4; i++){
            System.out.println("Nt " + "[" +(i+1) +"]" + " : ");
            double Nt= leer.nextDouble();
            sum+=Nt;
        }
        double prom = sum / 4;
        System.out.println("PROMEDIO: "+prom);
        
        if (prom > 14.5) {
            System.out.println("APROBADO");
        } else if (prom < 14.5 && prom > 10) {
            System.out.println("SUPLETORIO");
        } else {
            System.out.println("PERDIDO EL AÑO");
        }
    }
}
