import java.text.DecimalFormat;
import java.util.Scanner;

public class convertisseur2 {
    public static void main(String[] args){

        int angleDeg;
        double angleRad;

        Scanner sc = new Scanner(System.in);
        System.out.print("Quel est l'angle en degré ? ");

        angleDeg = sc.nextInt();
        angleRad = Math.toRadians(angleDeg);
        DecimalFormat df = new DecimalFormat(".##");

        System.out.print("Valeur en radian : " + df.format(angleRad));

        sc.close();
    }

}
