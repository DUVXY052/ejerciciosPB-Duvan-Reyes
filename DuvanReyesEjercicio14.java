import java.util.Scanner;
public class DuvanReyesEjercicio14 {
   public static void main(String[] args){
      Scanner inter=new Scanner(System.in);

      System.out.println("Ingrese un numero de 4 digitos...");
 
      int numb=inter.nextInt();

      int dg1 = numb / 1000;
      int dg2 = (numb / 100) % 10;
      int dg3 = (numb / 10) % 10;
      int dg4 = numb % 10;

      System.out.println("La suma de los dígitos de " + numb + " es " + (dg1 + dg2 + dg3 + dg4));
   } 
}