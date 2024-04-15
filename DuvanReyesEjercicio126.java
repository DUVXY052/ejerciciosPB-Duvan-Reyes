import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DuvanReyesEjercicio126 {
    public static void main(String[] args) {
        Scanner noth=new Scanner(System.in);

        LocalDate today = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String fechaFormateada = today.format(formato);
        System.out.println();

        DateTimeFormatter formatoLatino = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String fechaLatina = today.format(formatoLatino);

        System.out.println("Fecha actual: \n" + fechaFormateada);
        
        System.out.println("Fecha latina: " + fechaLatina);

    }
}