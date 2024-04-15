import java.util.Scanner;

public class DuvanReyesEjercicio132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int disp=1000;    
        
        System.out.println("\nCAJERO AUTOMATICO");
        Cajero();

        int option=scanner.nextInt();

        switch (option) {
            case 1:

                System.out.println("*Deposito\n");
                System.out.println("Ingrese la cantidad a depositar! ");
                int depos=scanner.nextInt();

                int Stotal= disp + depos;

                System.out.println("Saldo final: $" + Stotal );
                break;

            case 2:

                System.out.println("*Retiro\n");
                System.out.println("Que cantidad que desea retirar");
                int ret=scanner.nextInt();
                Stotal= disp - ret;
                System.out.println("Saldo final: $" + Stotal);


                break;
        
            default:
            System.out.println("Vuelva pronto ;) !!");
            
                break;
        }
    }
    public static void Cajero(){

        System.out.println("\n:::::::::::::::::::");
        System.out.println("BIENVENIDO USUARIO");
        System.out.println(":::::::::::.::::::::\n");
        System.out.println("Seleccione la opcion...");
        System.out.println("1.Depósito");
        System.out.println("2.Retiro");
        System.out.println("3.Salir\n");
    }
}
