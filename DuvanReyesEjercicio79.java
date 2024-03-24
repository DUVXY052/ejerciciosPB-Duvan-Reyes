import java.util.Scanner;

public class DuvanReyesEjercicio79 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);

        System.out.println("Ingrese el numero de bombillos: ");
        int focus=inter.nextInt();

        System.out.println("Voltaje por bombillo: ");
        double volt=120;

        double kilov= (focus * volt) / 1000;

        System.out.println("El total de voltaje para " + focus + " bombillos es de " + kilov + " Kilovoltios");
    }
}
