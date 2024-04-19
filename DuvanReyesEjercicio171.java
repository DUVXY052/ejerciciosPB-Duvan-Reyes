import java.util.Scanner;

public class DuvanReyesEjercicio171 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
    
        menuMasas();

        int opt=inter.nextInt();
        
        switch (opt) {
            case 1:
                System.out.println("\nCONV. A Kg\n");
                System.out.println("Ingrese las libras: ");
                double libs= inter.nextDouble();
                double KGs= libs / 2205;
                System.out.println("Total de kg en " +libs+ " libras: " + KGs);
                break;

            case 2:
                System.out.println("\nCONV. A Km\n");
                System.out.println("Ingrese las millas");
                double miles=inter.nextDouble();
                
                double kils=miles * 1609;
                System.out.println("Total de Kl en " +miles+ " millas: " + kils);
    
            
                break;
                
            case 3:
                System.out.println("\nCONV. A Ltrs\n");
                System.out.println("Ingrese los litros: ");
                double gals= inter.nextDouble();
                double ltrs= gals * 3785;
                System.out.println("Total de ltrs en " +gals+ " galones: " + ltrs);
                break;
                
            case 4:
                System.out.println("\nCONV. A °Cn\n");
                System.out.println("Ingrese los grados Farenheit");
                double Fhri=inter.nextDouble();
                double cents=(Fhri-32)* 5/9;
                System.out.println("Total de °Cn en " +Fhri+ " grados °Farenheit: " + cents);
                break;    
        
            default:
            System.out.println("GOODBYE");
                break;
        }

    }
    public static void menuMasas(){
        System.out.println("\n------CONVERSIONES-------\n");
        System.out.println("1) Libras a kilogramos");
        System.out.println("2) Millas a kilómetros");
        System.out.println("3) Galones a litros");
        System.out.println("4) Farenheit a centígrados");
        System.out.println("5) - Salir");

    }
}

