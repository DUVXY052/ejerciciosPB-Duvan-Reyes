import java.util.Scanner;

public class DuvanReyesEjercicio96 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        
        System.out.println("Ingresa una frase:");
        String frase ="My echo my shadow and me";

        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            System.out.println(palabra + " | characts: " + palabra.length()+"\n");
        }
    }
}