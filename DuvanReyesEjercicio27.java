import java.util.Scanner;
public class DuvanReyesEjercicio27 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name=inter.next();

        System.out.println("Genero:  (1)M  (2)F");
        int opGEN=inter.nextInt();

        if (opGEN==1) {
            System.out.println("Bienvenido " + name);
        }else if(opGEN==2){
            System.out.println("Bienvenida " + name);
        }else{
            System.out.println("Bienvenido indeciso" + name);
        }
       


    }
}
