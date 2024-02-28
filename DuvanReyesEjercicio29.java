import java.util.Scanner;
public class DuvanReyesEjercicio29 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero real: ");

        float CUBE=leer.nextFloat();
        System.out.println("El cubo de " + CUBE + " es igual a " + CubeFlotante(CUBE));

    }

    public static float CubeFlotante(float n1){
        return n1 * n1 * n1;
    }
}
