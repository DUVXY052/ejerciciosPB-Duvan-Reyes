import java.util.*;
public class DuvanReyesEjercicio117 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, nums=0;
        do {
            System.out.println("Ingrese un numero: ");
            num=leer.nextInt();

            nums++;
            
            
        } while (num !=0);
        
        System.out.println("Numeros ingresados: " + nums);
    }
}
