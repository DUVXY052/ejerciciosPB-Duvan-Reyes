import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DuvanReyesEjercicio136 {
    public static void main(String[] args) {
        // Obtenemos la hora actual
        Calendar calendario = Calendar.getInstance();
        int horas = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);

        // Formateamos la hora para mostrarla en el formato deseado
        String horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);

        // Mostramos la hora en la consola
        System.out.println("Hora actual: " + horaFormateada);
    }
}