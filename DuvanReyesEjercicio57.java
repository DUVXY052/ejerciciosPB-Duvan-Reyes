import java.util.Scanner;
public class DuvanReyesEjercicio57 {
    static Scanner inter = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Ingrese un numero de 2 a 5 digitos : ");

        String num=inter.next();

        int num1= Integer.parseInt(num);

        int n1 = num.length();

        if (n1 == 2){
            int dg1 = num1 / 10;

            int dg2 = num1 % 10;
            
            System.out.println("La suma de los dígitos de " + num1 + " es " + (dg1 + dg2));

        }else if (n1 ==3) {
            
            int dg1 = num1 / 100;

            int dg2 = (num1 /10) % 10;

            int dg3= num1 % 10;

            System.out.println("La suma de los dígitos de " + num1 + " es " + (dg1 + dg2 + dg3));
            
        }else if (n1 == 4) {

            int dg1 = num1 / 1000;

            int dg2 = (num1 /100) % 10;

            int dg3= (num1 /10) % 10;

            int dg4= num1 % 10;

            System.out.println("La suma de los dígitos de " + num1 + " es " + (dg1 + dg2 + dg3 + dg4));
        }else if (n1 == 5) {

            int dg1 = num1 / 10000;

            int dg2 = (num1 /1000) % 10;

            int dg3= (num1 /100) % 10;

            int dg4= (num1 /10) % 10;

            int dg5= num1 % 10;

            System.out.println("La suma de los dígitos de " + num1 + " es " + (dg1 + dg2 + dg3 + dg4 + dg5)); 
        }else{
            System.out.println("Numero de caracteres no permitidos");
        }

    }
    
}