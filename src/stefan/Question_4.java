package stefan;
/*
     Write a return method that can reverse negative number and return it as int
 */
public class Question_4 {

    public static void main(String[] args) {

        System.out.println("reverseNegative(-1995) = " + reverseNegativeNumber(-1995));

    }

    public static int reverseNegativeNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}





