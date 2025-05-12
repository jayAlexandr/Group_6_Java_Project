package sunisa;

public class Question_3 {

    public static void main(String[] args) {

        System.out.println(swap("Programing Language", "Java"));

    }

    public static String swap(String word1, String word2) {

        word1 = word1 + word2;
        word2 = word1.substring(0, word1.length() - word2.length());
        word1 = word1.substring(word2.length());

        return word1 + " " + word2;
    }
}

/*

Swap two variables' values without using a third variable

*/
