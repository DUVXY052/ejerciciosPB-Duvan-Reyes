import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class DuvanReyesEjercicio93 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Ingrese los minutos: ");

        double mins=key.nextDouble();

        double hours = mins / 60;

        double minuts = mins;

        double secs = mins * 60;

        System.out.println("Los " + mins + " minutos expresados en horas son de " + hours + " HORA(S)");
        System.out.println("Los " + mins + " minutos expresados en minutos son de " + mins + " MINUTO(S)");
        System.out.println("Los " + mins + " minutos expresados en segundos son de " + secs + " SEGUNDOS(S)");
    }
}
