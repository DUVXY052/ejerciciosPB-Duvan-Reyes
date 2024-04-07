import java.util.Scanner;
import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class DuvanReyesEjercicio120 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        String op,OP="HOLA USUARIO..."; 
        do {
            
            JOptionPane.showMessageDialog(null, OP);
                       
            System.out.println("Desea seguir imprimiendo el texto [S/N]?");
            op=inter.next();

            if (op.equalsIgnoreCase("N")){
                break;
                
            } else if (!op.equalsIgnoreCase("S")) {
                System.out.println("ERROR INTENTE OTRA VEZ");

                try {
                    System.in.read();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }else{
                continue;
            }
        
        } while (true);

    }
}