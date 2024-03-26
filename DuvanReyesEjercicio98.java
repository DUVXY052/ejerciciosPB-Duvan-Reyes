import java.util.Scanner;

public class DuvanReyesEjercicio98 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        float n1=leer.nextFloat();

        System.out.println("Ingrese un numero");
        float n2=leer.nextFloat();

        if (n1 - n2 !=0) {

            float div= (n1 + n2) / (n1 - n2);
            System.out.println("" + div);
  
            if (div == (int)div){
                System.out.println("Es exacta");
            }else{
                System.out.println("No es exacta");
            }     

        }else {
            System.out.println("ERROR... no se puede dividir entre cero");
        }

    }
}
