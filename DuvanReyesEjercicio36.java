import java.util.Scanner;
public class DuvanReyesEjercicio36 {
    public static void main(String abc[]) {
        Scanner inter= new Scanner(System.in);
        
        double tarifa = 15.00; 

        System.out.println("Ingrese el numero de horas estacionado");
        
        //HORAS
        double park= inter.nextDouble();
 
        //MINS
        double parkMin= inter.nextDouble();

        if (parkMin > 0) {
            park++;
        }
        
        double Totpark= park * tarifa;

        System.out.println("Tarifa de aparcamiento: " + "$" +Totpark );
        
    }
}
