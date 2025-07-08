package hayden;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_5 {

    public static void main(String[] args) {


        /**
         Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String value");

        String str = scn.nextLine();

        FrequencyTest(str);

        scn.close();
    }

    public static void FrequencyTest(String  str ) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
