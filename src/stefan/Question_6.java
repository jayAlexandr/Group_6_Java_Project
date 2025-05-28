package stefan;
/*
Write a return method that can remove the duplicated values from the String
         Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class Question_6 {

    public static class RemoveDuplicates {


        public static String removeDuplicates(String str) {
            String result = "";


            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);


                if (result.indexOf(eachChar) == -1) {
                    result = result + eachChar;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String input = "AAABBBCCC";
            String output = removeDuplicates(input);


            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }
    }



}