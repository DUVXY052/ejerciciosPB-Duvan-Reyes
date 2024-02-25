import java.util.*;
public class DuvanReyesEjercicio19 {
    
    public static void main(String abc[]) {
        Scanner leer= new Scanner(System.in);
        double sueldo, Hext, PxHora=7000, Extra, Desc;

        System.out.println("Ingrese el sueldo del trabajador: ");
        
        sueldo = leer.nextFloat();

        System.out.println("Ingrese las horas extras: ");

        Hext=leer.nextFloat();

        Extra= (PxHora * Hext) + sueldo;

        Desc= Extra - (Extra * 0.20) ;

        System.out.println("El sueldo basico del trabajador es de $ "+ sueldo + ", el 20% descuento es de $ " + (Extra * 0.20) + " y el total ganado es de $ " + Desc);
    }
}
