import java.util.*;
public class DuvanReyesEjercicio3 {

    public static void main(String args[]){
        
        Scanner Enter=new Scanner(System.in);
        
        System.out.println("Ingrese la base del triangulo");

        float Base=Enter.nextFloat();

        System.out.println("Ingrese la altura del triangulo");

        float Alt=Enter.nextFloat();

        float Area= (Base * Alt) / 2;

        System.out.println("La area de el triangulo es de: " + Area);
    } 


    


}