import java.time.LocalDate;
import java.util.Scanner;

public class DuvanReyesEjercicio127 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        System.out.println("Ingrese el dia: ");
        int dia = inter.nextInt();

        System.out.println("Ingrese el mes: ");
        int mes = inter.nextInt();

        System.out.println("Ingrese el año");
        int año = inter.nextInt();

        var fecha = dia+ "/" + mes+ "/" + año;

        if (dia >=1 && dia <= 31 && mes >= 1 && mes <=12){
            if ((mes==3 && dia >= 20) || (mes ==4 || mes==5) || (mes==6 && dia <= 20)) {
                System.out.println("Primavera");
            } else if ((mes==6 && dia >= 21) || (mes== 7 || mes==8) || (mes == 9 && dia <= 23)) {
                System.out.println("Verano");
            } else if ((mes==9 && dia >= 24) || (mes== 10 || mes == 11) || (mes ==12 && dia <= 21)) {
                System.out.println("Otoño");
            } else {
                System.out.println("Invierno");
            }
        }else {
            System.out.println("Fecha invalida! ingresela nuevamente");
        }     
        
    }
}