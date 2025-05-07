package igorkidd;

public class Question_3 {
    public static void main(String[] args) {
            String a = "Hello";
            String b = "World";

            a = a + b;
            b = a.substring(0, a.length() - b.length());
            a = a.substring(b.length());

            System.out.println("a = " + a);
            System.out.println("b = " + b);


            int a1 = 5;
            int b1 = 10;

            a1 = a1 + b1;
            b1 = a1 - b1;
            a1 = a1 - b1;

            System.out.println("a = " + a1);
            System.out.println("b = " + b1);
    }
}
