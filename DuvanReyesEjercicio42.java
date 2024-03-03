import java.util.Scanner;
public class DuvanReyesEjercicio42 {
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        double Orange=0.05, GramosOrg=6;

        System.out.println("Cuantos kilovatios necesita el sistema de iluminacion");

        int lumin=enter.nextInt();

        double operacion= (lumin * 1000) / Orange;

        System.out.println("Se necesitarian " + operacion+ " naranjas para producir " + lumin + " kv");

        double Torange= operacion * GramosOrg;
        double OranKgr = Torange / 1000;
        double pesoTon = OranKgr / 1000;

        System.out.println("El peso convertido es de " + pesoTon + " toneladas de naranjas.");


    }
}
