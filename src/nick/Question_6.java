package nick;

public class Question_6 {
    public static void main(String[] args) {

        System.out.println(removeDuplicate("AAABBBCCC"));
    }

    public static String removeDuplicate(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}

//Write a return method that can remove the duplicated values from the String
//Ex: removeDup("AAABBBCCC") ==> ABC