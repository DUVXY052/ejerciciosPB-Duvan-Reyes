import java.util.Scanner;

public class DuvanReyesEjercicio1582 {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        int a=0, e=0, i=0, o=0, u=0;

        String chainex= inter.nextLine();

        for(int j=0; j < chainex.length(); j++){
            char cadn = chainex.charAt(j);

            if (cadn == 'a'){
                a++;
            } else if (cadn == 'e'){
                e++;
            } else if (cadn == 'i'){
                i++;
            } else if (cadn == 'o'){
                o++;
            } else if (cadn == 'u'){
                u++;
            }
        }
        System.out.println("Vocales en la oracion A: "+a +" E: "+e+ " I: "+i+ " O: "+o+ " U: "+u );

    }
}
