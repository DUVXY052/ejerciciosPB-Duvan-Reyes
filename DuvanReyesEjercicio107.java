import java.util.Scanner;

public class DuvanReyesEjercicio107 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int birth = inter.nextInt();

        if (birth < 1 || birth > 100){
            System.out.println("ERROR: dato invalido");
        }else if (birth > 18 && birth <= 100){
            System.out.println("ES MAYOR DE EDAD");
        }else {
            System.out.println("ES MENOR DE EDAD");
        }
           
    }
}