import java.util.Scanner;
public class DuvanReyesEjercicio41 {
    public static void main(String[] args) {
        Scanner enter= new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = enter.nextInt();

        int months= edad * 12;

//                         centimetros / metros
        double cents= (months * 0.50) / 100;
        

        System.out.println("A la edad de " + edad + " años la longitud de su cabellera seria de " +cents+ " Mtrs");
    }
}
