import java.util.*;
public class DuvanReyesEjercicio6{

    public static void main (String arg[]){
    Scanner inter=new Scanner(System.in);

    System.out.println("..MEDIA ARITMETICA..");

    System.out.println("Ingrese 3 numeros: ");

    float n1=inter.nextFloat();

    float n2=inter.nextFloat();

    float n3=inter.nextFloat();

    Float MedArt= (n1 + n2 + n3) / 3;

    System.out.println("La media aritmetica es de " + MedArt);

    }

}