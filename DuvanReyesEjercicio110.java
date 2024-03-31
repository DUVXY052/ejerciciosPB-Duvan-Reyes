import java.util.Scanner;

public class DuvanReyesEjercicio110 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese la temperatura actual en grados: ");
        int temp=inter.nextInt();

        if (temp <= 0 || temp <= 10 ){
            System.out.println("Mucho frio");
        }else if (temp <=11 || temp <= 18){
            System.out.println("Frio");
        }else if (temp <=19 || temp <= 25){
            System.out.println("Templado");
        }else {
            System.out.println("Calor");
        }
    }
}