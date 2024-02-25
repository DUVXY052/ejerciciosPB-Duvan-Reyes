import java.util.*;
public class DuvanReyesEjercicio13 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");

        int num1=key.nextInt();
        String chain=Integer.toString(num1);

        int num2=key.nextInt();
        String chain2=Integer.toString(num2);
        
        int num3=key.nextInt();
        String chain3=Integer.toString(num3);

        char fdigit = chain.charAt(chain.length() - 1);
        char fdigit2 = chain2.charAt(chain2.length() - 1);
        char fdigit3 = chain3.charAt(chain3.length() - 1);



        System.out.println("El ultimo digito de "+ num1+ " es " + fdigit);
        System.out.println("El ultimo digito de "+ num2+ " es " + fdigit2);
        System.out.println("El ultimo digito de "+ num3+ " es " + fdigit3);


    }
}