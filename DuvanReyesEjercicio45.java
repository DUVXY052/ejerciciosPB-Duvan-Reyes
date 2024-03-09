import java.util.Scanner;
public class DuvanReyesEjercicio45 {
    public static void main(String[] args) {
        Scanner inter =new Scanner(System.in);

        System.out.println("Ingrese un numero decimal: ");
        double numb=inter.nextDouble();
        NumeroDev(numb);
        

    }
    public static int NumeroDev(double num1){

        int num=0;

        if (num1 > 0) {
            num=1;
        } else if (num1 < 0) {
            num=-1;
        }else {
            num=0;
        }
        System.out.println(num);
        return num;
    } 
}
