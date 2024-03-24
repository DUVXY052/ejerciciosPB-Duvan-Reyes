import java.util.Scanner;

public class DuvanReyesEjercicio73 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese el sueldo del trabajador: ");
        double CASH=inter.nextDouble();

        if (CASH <=1000) {
            CASH = CASH - (CASH * 0.10);
            System.out.println("Su sueldo sera igual a " + CASH);
        }else if (CASH > 1000 && CASH <= 2000){
            CASH = CASH - (CASH * 0.05);
            System.out.println("Su sueldo sera igual a " + CASH);
        }else{
            CASH = CASH - (CASH * 0.03);
            System.out.println("Su sueldo sera igual a " + CASH);
        }
    }
}
