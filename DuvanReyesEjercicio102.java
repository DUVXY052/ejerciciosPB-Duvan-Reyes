import java.util.Scanner;

public class DuvanReyesEjercicio102 {
    public static void main(String[] args) {
        Scanner yuls= new Scanner(System.in);
        float taf=8000;

        System.out.println("Horas trabajadas: ");
        float hors=yuls.nextFloat();

        float pqg= taf * hors;

        if (hors > 40) {
            float hsx= hors - 40;
            float incrm= hsx * (taf * 0.25f);
            float pagE= pqg + incrm;

            System.out.println("El pago mas las " + Math.round(hsx) + " horas extras es de " + pagE);

        }else{
            System.out.println("El pago por sus horas trabajadas sera de " + pqg);
        }
        
    }
}
