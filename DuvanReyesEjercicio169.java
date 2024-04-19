import java.util.Scanner;

public class DuvanReyesEjercicio169 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int now=2024;

        System.out.println("Ingrese su año de nacimiento: ");
        int yearB= leer.nextInt();

        int edad= now - yearB;

        if (edad >= 1 && edad <= 12){
            System.out.println("Estas en la niñez.");
        } else if (edad >= 13 && edad <= 18) {
            System.out.println("Ested estas en la adolescencia");
        } else if (edad >= 19 && edad <= 30) {
            System.out.println("Ested esta en la juventud");
        } else if (edad >= 31 && edad <= 60) {
            System.out.println("Estas en la adutez");
        } else if (edad >= 60 && edad <= 100) {
            System.out.println("Estas en la vejez");
        } else {
            System.out.println("Rango de edad invalido...");
        }
    }
}