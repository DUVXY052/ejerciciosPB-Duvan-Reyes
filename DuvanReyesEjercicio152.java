import java.util.Scanner;
public class DuvanReyesEjercicio152 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadenaOrig = "spidyrules";

        char[] caracteres = cadenaOrig.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }

    char[] arglo = new char[cadenaOrig.length()];

    for (int i = 0; i < cadenaOrig.length(); i++) {
        arglo[i] = cadenaOrig.charAt(i);
    }

    System.out.println("Contenido del arreglo de caracteres:");
    for (char c : arglo) {

        System.out.print(c + " ");
    }
}
}