import java.util.Scanner;

public class convertisseur {
    public static void main(String[] args){

        float angleRad;
        int angleDeg;

        Scanner sc = new Scanner(System.in);
        System.out.print("Quel est l'angle en radian ? ");
        angleRad = sc.nextFloat();

        angleDeg = (int) (180 * (angleRad/Math.PI));
        System.out.print("Valeur en degré : " + angleDeg);

        sc.close();
    }

}
