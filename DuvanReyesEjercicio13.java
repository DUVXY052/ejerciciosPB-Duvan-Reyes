import java.util.*;
public class DuvanReyesEjercicio13 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        
        System.out.println("Ingrese tres numeros: ");

        int num1=key.nextInt();
        int num2=key.nextInt();
        int num3=key.nextInt();
        

        String nchain = Integer.toString(num1);
        String nchain2 = Integer.toString(num2);
        String nchain3 = Integer.toString(num3);

        char Fdig = nchain.charAt(nchain.length() - 1);
        char Fdig2 = nchain2.charAt(nchain2.length() - 1);
        char Fdig3 = nchain3.charAt(nchain3.length() - 1);

        System.out.println("El ultimo caracter de los numeros "+num1+ num2 + Fdig);
    }
}
