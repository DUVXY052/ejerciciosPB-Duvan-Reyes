import java.util.Scanner;

public class DuvanReyesEjercicio77 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int years, N;
        
        System.out.println("Ingrese el capital: ");
        double C=leer.nextDouble();
        System.out.println("Ingrese el interes anual: ");
        double R=leer.nextDouble();

        System.out.println("Ingrese el número de años:");
        years = leer.nextInt();

        N = years * 12;
        double intMn = R / (12 * 100);
        double pagMn = (C * intMn) / (1 - Math.pow(1 + intMn, - N));
        double Pt = pagMn * N;

        System.out.printf("El pago mensual es: %.2f\n", pagMn);
        System.out.printf("El total a pagar es: %.2f\n", Pt);

    }
}
// Calcular los pagos mensuales de una hipoteca y el total a pagar.
// El programa debe solicitar el capital, el interés anual y el número de años y debe escribir la cuota a
// pagar mensualmente. Para calcular la cuota se utiliza la siguiente fórmula: sea C el
// capital del préstamo, R la tasa de interés mensual y N el número de pagos. La
// cuota mensual viene dada por:
