package iskandar;

public class Question_8 {

    /*
     Java Question 08 - Reverse The String
      Write a return method that can reverse  String
         Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args){

        System.out.println(reverse("ABCD"));

    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}
