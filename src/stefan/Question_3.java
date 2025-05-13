package stefan;
/*
Swap two variables' values without using a third variable
*/
public class Question_3 {
    public static void main(String[] args) {

        int var1 = 1;
        int var2 = 2;

        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
    }
}
