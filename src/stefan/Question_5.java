package stefan;
/*
Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class Question_5 {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }


    public static String frequencyOfChars(String str) {
        String result = "";
        if (str == null || str.isEmpty()) return result;

        char current = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == current) {
                count++;
            } else {
                result += current + "" + count;
                current = str.charAt(i);
                count = 1;
            }
        }
        result += current + "" + count;

        return result;
    }
}
