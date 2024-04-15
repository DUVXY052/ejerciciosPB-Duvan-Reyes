import java.util.Scanner;
public class DuvanReyesEjercicio140 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int opt;

        do {
            System.out.println("Digita una opcion: ");
            menuMath();
            
            opt = leer.nextInt();

            switch (opt) {
                case 1:
                    break;
    
                case 2:
                System.out.println("Ingrese un numero: ");

                int num = leer.nextInt();

                int sum=0;

                for(int i=0; i <=num; i++){
                    System.out.println(sum + "+" + i);
                    sum+=i;
                }System.out.println("La suma de los numeros "+ sum);

                    pausa();
                    break;
    
                case 3:
                
                System.out.println("Ingrese un numero: ");
    
                num = leer.nextInt();
        
                int fact= 1;
        
                for(int i=1; i<= num; i++){
                    System.out.println(fact+"x"+i);
        
                    fact*=i;
        
                }System.out.println("=" + fact); 
                pausa();
                break;
    
               
                default:
                System.out.println("Error opcion invalida");
                break;
            }

        } while (opt <= 3 && opt > 1);

    }
    public static void menuMath(){

        System.out.println("1) Salir");
        System.out.println("2) Sumatoria");
        System.out.println("3) Factorial");
    }
    public static void pausa(){
        leer.nextLine(); //Limpiamos buffer del System.in
        System.out.println("\t\nPresione enter para continuar...");
        leer.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER
    }
}