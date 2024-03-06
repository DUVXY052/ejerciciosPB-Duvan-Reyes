import java.util.Scanner;
public class DuvanReyesEjercicio43 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        MayorandMenor();
          
    }
    public static void MayorandMenor(){
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        
        int n1 = read.nextInt();
        int n2 = read.nextInt();

        if (n1 > n2 ) {
            System.out.println("Numero mayor es " + n1);
            
        }else{
            System.out.println("mayor es " + n2);
        }

    }
}
