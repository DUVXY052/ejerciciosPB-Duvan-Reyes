import java.util.Scanner;

public class DuvanReyesEjercicio65 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num1=inter.nextInt();
        
        int suma=0;

        for(int i=1; i<= num1; i++){
            System.out.println(suma + "+" + i );
            suma += i;
        }
        System.out.println("La suma de los numeros enteros hasta " + num1 + " es de " +suma);
    }
}
