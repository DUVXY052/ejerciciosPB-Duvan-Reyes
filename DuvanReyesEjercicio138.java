import java.util.Scanner;

public class DuvanReyesEjercicio138 {
    public static void main(String[] args) {
        Scanner inter=new Scanner(System.in);
        double area;

        menuOpt();

        int opt=inter.nextInt();

        switch (opt) {
            case 1:
                System.out.println("\n:::Triangulo:::\n");

                System.out.println("Ingrese la altura del triangulo: ");
                int alt = inter.nextInt();

                System.out.println("Ingrese la base del triangulo: ");
                int base = inter.nextInt();

                area = (base * alt) / 2;

                System.out.println("El area del triangulo es de: " + area +" cm");
                break;

            case 2:
                System.out.println("\n:::Rectangulo:::\n");

                System.out.println("Ingrese el largo del rectangulo: ");
                int large= inter.nextInt();

                System.out.println("Ingrese el ancho del rectangulo: ");
                int ancho= inter.nextInt();

                area= large * ancho;

                System.out.println("El area del rectangulo es de: " + area +" cm");
                break;
                
            case 3:
                System.out.println("\n:::Cilindro:::\n");

                System.out.println("Ingrese el radio del cilindro:");
                double radio = inter.nextDouble();

                System.out.println("Ingrese la altura del cilindro:");
                double h= inter.nextDouble();

                // AREA LATERAL

                double areaL= Math.PI*2 * radio * h;
                area = Math.PI * Math.pow(radio, 2);

                System.out.println("El area del cilindro es de: " + Math.round(area) +" cm");
                break;

            default:
                break;
        }
    }
    public static void menuOpt(){
        System.out.println("////////////////////////////////");
        System.out.println("_-------Math Operations--------_");
        System.out.println("////////////////////////////////");
        System.out.println("\nQUE OPERACION DESEA REALIZAR?...\n");
        System.out.println("1). El Area de un triangulo---");
        System.out.println("2). El Area de un rectangulo");
        System.out.println("3). El Area de un cilindro");
        System.out.println("4). Salir");

    }
}
