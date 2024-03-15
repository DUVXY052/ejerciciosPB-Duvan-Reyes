import java.util.Scanner;
public class DuvanReyesEjercicio58 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Vxhour=6800;

        System.out.println("Ingresar las horas trabajadas: ");
        
        int Hours=scanner.nextInt();

        int salario= Vxhour * Hours;

        System.out.println("El pago por hora sera de: " + salario);


    }
    
}
