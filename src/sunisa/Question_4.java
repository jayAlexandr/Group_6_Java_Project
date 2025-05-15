package sunisa;

public class Question_4 {

    public static void main(String[] args) {

        System.out.println("reverseNegative(-12345) = " + reverseNegative(-12345));

    }

    public static int reverseNegative(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}

/*

Write a return method that can reverse negative number and return it as int

*/
