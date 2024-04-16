import java.util.Scanner;

public class DuvanReyesEjercicio157 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println("Ingrese su nombre en mayuscula: ");
        String name = inter.nextLine();
        
        if (name.startsWith("A")){
            String mname = name.toLowerCase();
            System.out.println("Nombre: " + mname);
        }else{
            System.out.println("Nombre: "+ name);
        }

    }
}
