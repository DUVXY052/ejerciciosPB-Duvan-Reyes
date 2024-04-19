import java.util.Scanner;

public class DuvanReyesEjercicio162 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo: ");
        int num = inter.nextInt();

        if( num <= 0 || num > 10){
            System.out.println("Numero invalido solo enteros positivos menores de 10!");
        }else {
            int multi=1;
            for (int i=1; i <= 10; i++){
                multi = num * i;
                System.out.println(num + " X " + i + " = " + multi);
            }
        }
    }
}
