import java.util.Scanner;

public class DuvanReyesEjercicio44 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Numero pi!!\n");

        double PI =3.1416;

        Potencia210(PI);
    }
      
    
    public static void Potencia210(double a){

        for (int i=2; i<=10; i++){
           double POT=Math.pow(a, i);
           double raid = Math.sqrt(POT);

           System.out.println(i + ": " + POT + " y su raiz es: " + raid);
           System.out.println();
   
        }

    }

}

