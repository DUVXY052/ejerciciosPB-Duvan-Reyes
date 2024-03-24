import java.util.Scanner;
public class DuvanReyesEjercicio33 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int empleados=0, salario=0, Men=0, Women=0 ;
        int sal=0;
        System.out.println("Registre los empleados...");

        do {
            System.out.println("ingrese su sexo:  M(1)  F(2)");
            int gend =enter.nextInt();
            if (gend == 1) {
               // System.out.println("Hombre");
            } else if(gend == 2){
                //System.out.println("Mujer");
            }
            System.out.println("Ingrese su salario: ");
            int cash =enter.nextInt();
            
            if (cash >= 700) {
                salario++;
            }
            
            if(gend == 1){
                Men++;
            } else if(gend == 2){
                Women++;
            }else{
                System.out.println("No pertenece a la empresa...");
            }

            sal+=cash;

            empleados++;
            
        } while (empleados < 7 );

            int promS= sal / empleados;
            double Pmen=(double) Men / empleados * 100;
            double Pwom= (double) Women / empleados * 100;

            System.out.println("Promedio de los salarios " + promS);
            System.out.println("Porcentaje de hombres " + Math.round(Pmen) +"%");
            System.out.println("Porcentaje de mujeres " + Math.round(Pwom) +"%");
            System.out.println("Personas con salario mayor a 700: " + salario);

    }
}
