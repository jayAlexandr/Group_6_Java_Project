package igorkidd;

public class Question_2 {
    public static void main(String[] args) {
        String str = "People";
        String reversed = new StringBuilder(str).reverse().toString();
        String reversed2 = "";
        System.out.println(reversed);

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed2 += str.charAt(i);
        }
        System.out.println(reversed2);

    }
}
