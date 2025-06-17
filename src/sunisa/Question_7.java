package sunisa;

public class Question_7 {
    public static void main(String[] args) {

        System.out.println("Unique characters from string: " + unique("AAABBBCCCDEF"));

    }

    public static String unique(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
        return result;
    }
}

/*

Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"

*/
