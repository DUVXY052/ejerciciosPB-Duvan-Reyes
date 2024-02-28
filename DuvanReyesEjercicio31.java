import java.util.*;
public class DuvanReyesEjercicio31 {
    public static void main(String args[]){
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese la base del triangulo");

        float Base=leer.nextFloat();

        System.out.println("Ingrese la altura del triangulo");

        float Alt=leer.nextFloat();

        float Area= (Base * Alt) / 2;
        
        float AreaC = Area / 10;

        float Aream2 = AreaC / 10000;

        System.out.println("La area de el triangulo en mm es de: " + Area);
        System.out.println("En Cm es de : " + AreaC);
        System.out.println("En metros cuadrados es de : " + Aream2);
    } 

}