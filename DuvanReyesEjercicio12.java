import java.util.Scanner;
public class DuvanReyesEjercicio12 {

    public static void main (String abc[]) {
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese 3 numeros...");

        int n1=leer.nextInt();
        //DOBLE
        int n1dob= n1 * 2;

        int n2=leer.nextInt();
        //TRIPLE
        int n2tri= n2 * 3;

        int n3=leer.nextInt();
        //CUADRADO
        int n3cuad= n3 * n3;

        //PROMEDIO
        int med= (n1 + n2 + n3) / 3;

        //SUMA
        int suma= n1 + n2 + n3;

        System.out.println("El promedio de los numeros " + n1+ ", " + n2 + " y " + n3 + " es de " + med + " y la suma es de " + suma);
        System.out.println("El doble de " + n1 + " es " + n1dob +", el triple de " + n2 +" es "+ n2tri+ " y el cuadrado de " + n3 + " es de "+ n3cuad);
      
    }
}