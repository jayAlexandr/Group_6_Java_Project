package sunisa;

public class Question_5 {

    public static void main(String[] args) {

        System.out.println("frequencyOfChars(\"AAABBCDD\") = " + frequencyOfChars("AAABBCDD"));

    }

    public static String frequencyOfChars(String str) {
        String result = "";

        while (!str.isEmpty()) {
            char ch = str.charAt(0);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            result += ch + "" + count;
            str = str.replace("" + ch, "");
        }
        return result;
    }
}

/*

Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

*/