import java.util.*;
public class DuvanReyesEjercicio4{

    public static void main(String args[]){
    Scanner inter= new Scanner(System.in);

    System.out.println("Ingrese el radio del circulo: ");
    
    double Rd=inter.nextDouble();

    double Area= Math.PI * (Rd * Rd);

    System.out.println("El area de un circulo cuyo radio es " + Rd + " es de " + Area);

    }
}