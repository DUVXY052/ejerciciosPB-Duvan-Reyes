import java.util.Scanner;

public class DuvanReyesEjercicio179 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        double  notM=0, notI=0, notE=0;
        //double [] nots = new double[3];
        int nums=0, aprob=0, reprob=0 ;
        double [] nots= {notM , notI, notE};

        System.out.println("Ingrese su nota de matematicas: ");
        nots[0]=notM=inter.nextDouble();
        System.out.println("Ingrese su nota de ingles: ");
        nots[1]=notI=inter.nextDouble();
        System.out.println("Ingrese su nota de español: ");
        nots[2]=notE=inter.nextDouble();


        
        double suma=0;
        
        for(int i=0; i < 3; i++){
            suma+=nots[i];
            nums++;

            if (nots[i] > 3) {
                aprob++;
            } else {
                reprob++;
            }

        }System.out.println(suma);
        
        double promd= suma / nums;

        String[] materias = {"matematicas", "ingles", "español"};
        double min_nota = Math.min(Math.min(notM, notI), notE);
        String min_materia = materias[0];
        if (min_nota == notI) {
            min_materia = materias[1];
        } else if (min_nota == notE) {
            min_materia = materias[2];
        }
        System.out.println("Materia con menor calificación: " + min_materia + " [" + min_nota + "]");


        System.out.println("Promedio: "+promd);
        System.out.println("Materias aprobadas: " + aprob);
        System.out.println("Materias reprobadas: " + reprob);
   
    }
}
