package hayden;

import java.util.Scanner;

public class Question_1 {

    public static void main(String[] args) {


        /**
         Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Whole Number");
        int number = scn.nextInt();

        identify(number);

    }
    private static void identify(int i) {

        if(i % 2 == 0) {
            System.out.println(i + " is Even Number");
        }else {
            System.out.println(i + " is Odd Number");
        }

    }

}
