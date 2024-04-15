import java.util.Scanner;

public class DuvanReyesEjercicio154 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String salud= "Hola que tal ";

        System.out.println("Cual es tu nombre? ");
        String name = leer.nextLine();

        salud= salud + name;

        System.out.println(salud);
    }
}
