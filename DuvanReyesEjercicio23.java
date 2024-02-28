import java.util.*;
public class DuvanReyesEjercicio23 {
    public static void main(String abc[]) {
        Scanner inter= new Scanner(System.in);
        int intentos=0;

        System.out.println("Poicion 1: ?");
        int dig1 = (int)(Math.random()*10);

        System.out.println("Poicion 2: ?");
        int dig2 = (int)(Math.random()*10);

        System.out.println("Poicion 3: ?");
        int dig3 = (int)(Math.random()*10);

       System.out.println(dig1);
        System.out.println(dig2);
       System.out.println(dig3);

        do {
            System.out.println("Indique un numero para cada posicion!!!... ");

            System.out.println("Poicion 1 ?");
            int pos1=inter.nextInt();
            if (pos1==dig1) {
                System.out.println("Verde");
            }else if(pos1==dig2 || pos1 == dig3){
                System.out.println("Amarillo");
            }else{
                System.out.println("Rojo");
            }

            System.out.println("Poicion 2 ?");
            int pos2=inter.nextInt();
            if (pos2==dig2) {
                System.out.println("Verde");
            } else if(pos2 == dig1 || pos2==dig3){
                System.out.println("Amarillo");
            }else{
                System.out.println("Rojo");
            }

            System.out.println("Poicion 3 ?");
            int pos3=inter.nextInt();
            if (pos3==dig3) {
                System.out.println("Verde");
            } else if(pos3== dig1 || pos3==dig2){
                System.out.println("Amarillo");
            }else{
                System.out.println("Rojo");
            }

            intentos++;

        } while (intentos <4);
        System.out.println("No de intentos alcanzado!...");

    }
}