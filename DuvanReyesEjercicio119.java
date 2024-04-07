import javax.swing.*;
public class DuvanReyesEjercicio119 {
    public static void main(String[] args) {
        int attemps=0;

        String user="Dreyes05X";
        String password="passwd";
        
        System.out.println("Hola usuario " + user + "...");
        do {
        
            String pass=JOptionPane.showInputDialog("Ingrese la contra");
            attemps++;

            if (!pass.equals(password)) {
                System.out.println("contraseña incorrecta");
            }else{
                System.out.println("contraseña aceptada");
                break;
            }
            if (attemps >= 3) {
                System.out.println("Intentos excedidos!!!...");
            }

        } while (attemps < 3);

    }
}