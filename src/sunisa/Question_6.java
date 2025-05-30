package sunisa;

import java.util.Set;

public class Question_6 {

    public static void main(String[] args) {

        System.out.println(removeDuplicated("AAABBBCCC"));

    }

    public static String removeDuplicated(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char charactor = str.charAt(i);
            if (result.indexOf(charactor) == -1) {
                result += charactor;
            }
        }

        return result;
    }
}

/*

Write a return method that can remove the duplicated values from the String
Ex: removeDup("AAABBBCCC") ==> ABC

 */