package nick;

public class Question_8 {
    public static void main(String[] args) {

        System.out.println(Reverse("ABCD"));
    }

    public static String Reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA