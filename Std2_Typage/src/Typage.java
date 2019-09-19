public class Typage {

public static void main(String[]args) {

    // variables
    int var1 = 10;
    float var2 = 6/5;
    char var3 = 5;

    //premiere conversion
    String var1String = Integer.toString(var1);
    System.out.println("conversion #1 : " + var1String);


    //deuxieme conversion
    boolean var1Boolean = (var1 == 10);
    System.out.println("Conversion #2 : " + var1Boolean);
    //La vrai conversion sans == est impossible puisqu'un vrai ou faux n'est pas un entier

    //troisieme conversion
    int var2Int = (int)var2;
    System.out.println("Conversion #3 : " + var2Int);

    //quatrieme conversion
    String var2IntString = Integer.toString(var2Int);
    System.out.println("conversion #4 : " + var2IntString);

    //cinquieme conversion
    int var3Int = (int)var3;
    System.out.println("conversion #5 : " + var3Int);



}



}
