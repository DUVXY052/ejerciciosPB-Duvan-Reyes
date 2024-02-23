import java.util.Scanner;

public class DuvanReyesEjercicio20 {
    public static void main(String[] args) {
        Scanner inter= new Scanner(System.in);
         
        System.out.println("Ingrese la nota 1:");
        float note1=inter.nextFloat();
        float dob1= note1 * 2;

        System.out.println("Ingrese la nota 2:");
        float note2=inter.nextFloat();
        float dob2= note2 * 2;

        System.out.println("Ingrese la nota 3:");
        float note3=inter.nextFloat();
        float dob3= note3 * 2;

        System.out.println("Ingrese la nota 4:");
        float note4=inter.nextFloat();
        float dob4= note4 * 2;

        System.out.println("Ingrese la nota 5:");
        float note5=inter.nextFloat();
        float dob5= note5 * 2;

        float notesum= note1 + note2 + note3 + note4 + note5;

        float noteprom= (note1 + note2 + note3 + note4 + note5) / 5;

        System.out.println("La suma de las notas " + note1 +", "+ note2 + ", "+note3+", " + note4 + " y " + note5 + " es de " + notesum);
        System.out.println("EL promedio es de " + noteprom + " y el doble de cada una es de " + dob1+", "+dob2+", "+dob3+", "+dob4+", "+dob5);

    }
}
