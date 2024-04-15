import java.util.Scanner;

public class DuvanReyesEjercicio92 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);

        // Solicitar el tamaño de los vectores
        System.out.println("Limite de vector: ");
        int lim = inter.nextInt();

        int [] notas = new int[lim];

        int [] estuds= new int[lim];

        System.out.println("Contenido del vector notas: ");

        for (int i=0; i< lim; i++){
            System.out.println("Notas " + (i+1) + ": ");
            notas[i] = inter.nextInt();
        }

        System.out.println(notas);

        for (int i=0; i< lim; i++){
            System.out.println("Est " + (i+1) + ": ");
            estuds[i] = inter.nextInt();
        }

        int escala =0;
        for (int i = 0; i<lim; i++ ){
            System.out.println();
            escala+= notas[i] * estuds[i];
        }System.out.println("El producto escalar del vector notas  y estuds es" + escala);

    }

}