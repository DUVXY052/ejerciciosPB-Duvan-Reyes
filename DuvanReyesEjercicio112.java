import java.util.Scanner;

public class DuvanReyesEjercicio112 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Línea de autobuses ADO, seleccione su destino:");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");


        System.out.println("a) Cartagena.    [$150]");
        System.out.println("b) Barranquilla. [$320]");
        System.out.println("c) Sincelejo.    [$120]");
        System.out.println("d) Valledupar.   [$90]");
        System.out.println("e) Santa Marta.  [$110]");

        int key=inter.nextInt();

        
        switch (key) {
            case 1:
                System.out.println("Su destino es “Cartagena”, tiempo de traslado 2 hrs, costo $150.");
                break;

            case 2:
                System.out.println("Su destino es “Barranquilla”, tiempo de traslado 3 hrs y 20 min, costo $320.");
                break;
                
            case 3:
                System.out.println("Su destino es “Sincelejo”, tiempo de traslado 1 hrs y 30 min, costo $120.");
                break;
                
            case 4:
                System.out.println("Su destino es “Valledupar”, tiempo de traslado 1 hrs y 10 min, costo $90.");
                break;  
        
            case 5:
                System.out.println("Su destino es “Santa Marta”, tiempo de traslado 1 hrs y 20, costo $110.");
            break;
        }
    }
}
