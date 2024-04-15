import java.util.Scanner;

public class DuvanReyesEjercicio149 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        int num, attmps=0;
        
        System.out.println("Adivina el numero!!!");

        int random = (int) (Math.random()* 100) + 1;
        System.out.println(random);

        do {
           
            num = inter.nextInt();
            attmps++;

            if (num > 100) {
                System.out.println("Solo numeros entre 1 y 100");
            }

        } while (num != random);
        System.out.println("#" + random);
        System.out.println("Adivinaste el numero en " + attmps + " intentos!");
    }
}
