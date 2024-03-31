import java.util.Scanner;

public class DuvanReyesEjercicio111 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese el numero de dia: ");

        int op=inter.nextInt();

        switch (op) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Lunes");
                break;
                
            case 3:
                System.out.println("Martes");
                break;
                
            case 4:
                System.out.println("Miercoles");
                break;
                
            case 5:
                System.out.println("Jueves");
                break;
                
            case 6:
                System.out.println("Viernes");
                break;   
        
            case 7:
                System.out.println("Sabado");
            break;
        }
    }
}