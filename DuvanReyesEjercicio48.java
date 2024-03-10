import java.util.Scanner;
public class DuvanReyesEjercicio48 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese 2 numeros: ");

        int num1=leer.nextInt();

        int num2=leer.nextInt();

        System.out.println();

        int suma= num1 + num2;

        int multip= num1 * num2;

        int div= num1 / num2;

        int divr= num1 % num2;
 
        System.out.print("La suma de los numeros " + num1 +" y "+ num2 + " es de " + suma + " La multiplicacion es de " + multip + " la division de " +div+ " y el resto de " +divr);
    }
}
