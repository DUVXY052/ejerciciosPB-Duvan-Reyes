import java.util.Scanner;

public class DuvanReyesEjercicio63 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);
        int num, ent=0;
        
        do {
            System.out.println("Introduzca un numero enteros: ");
            num=inter.nextInt();
            ent+= num;
            if (num >= 20 && num <= 30 || num<=0){
                break;
            }
            
        } while (true);

        System.out.println("La suma de los enteros ingresados es de: " + ent);
    }
}
