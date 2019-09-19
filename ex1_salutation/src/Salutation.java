 import java.util.Scanner;

public class Salutation {
    public static void main(String[] args) {

        String nom = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Quel est votre nom? ");

        nom = sc.next();
        System.out.print("Bonjour " + nom);

        sc.close();

    }

}
