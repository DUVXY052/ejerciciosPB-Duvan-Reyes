import java.util.*;
public class DuvanReyesEjercicio23 {
static  Scanner inter= new Scanner(System.in);
static int dig1=0, dig2=0, dig3=0;
    public static void main(String abc[]) {
        int intentos=0, pos1,pos2,pos3, V=0,A=0,R=0;

        System.out.println("Indique un numero para cada posicion!!!... ");
        
        randomNumbers();

        do {

            System.out.println("Poicion 1 ");
            pos1=inter.nextInt();
            VerificarNum(pos1);
            if (pos1==dig1) {
                System.out.println("Verde");
                V++;
            }else if(pos1==dig2 || pos1 == dig3){
                System.out.println("Amarillo");
                A++;
            }else{
                System.out.println("Rojo");
                R++;
            }
            pos1+= pos1;

            System.out.println("Poicion 2 ?");
            pos2=inter.nextInt();
            VerificarNum(pos2);
            if (pos2==dig2) {
                System.out.println("Verde");
                V++;
            } else if(pos2 == dig1 || pos2==dig3){
                System.out.println("Amarillo");
                A++;
            }else{
                System.out.println("Rojo");
                R++;
            }
            

            System.out.println("Poicion 3 ?");
            pos3=inter.nextInt();
            VerificarNum(pos3);

            if (pos3==dig3) {
                System.out.println("Verde");
                V++;
            } else if(pos3== dig1 || pos3==dig2){
                System.out.println("Amarillo");
                A++;
            }else{
                System.out.println("Rojo");
                R++;
            }
            pos3+= pos3;
            System.out.println("");

            intentos++;

        } while (pos1==V || pos2==V || pos3==V || intentos <4);
        if (pos1==dig1 || pos2==dig2 || pos3==dig3) {
            System.out.println("CONGRATULATIONS!");
        }
        System.out.println("Limite de intentos alcanzado!...\n");
        System.out.println("Los numeros son: " + dig1 +" "+ ""+ dig2 +" "+ dig3+"\n");
        System.out.print("Respuestas: " +"VERDE= "+ V + " AMARILLO= "+ A +" ROJO= "+ R);


    
    }
    
    public static int VerificarNum(int n1){

        while ( n1 > 0 || n1 <= 9) {
            
        break;
        }
            
        if (n1 < 0 || n1 > 9) {
            
            System.out.println("Num invalido");
            }
        
        return n1;
    }

    public static int[] randomNumbers(){

        int [] randoms = new int[3];
       
        do {
            dig1=(int)(Math.random()*9+1);
            dig2=(int)(Math.random()*9+1);
            dig3=(int)(Math.random()*9+1);
            
            if (dig1 != dig2 && dig1 != dig3 && dig2 != dig3){
                break;
            }

        } while (true);


        randoms[0] = dig1;
        randoms[1] = dig2;
        randoms[2] = dig3;

        return randoms;

    }    
     
}