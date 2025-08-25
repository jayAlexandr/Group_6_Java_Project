package iskandar;

public class Question_4 {
    public static void main(String[] args){

        int num = -543;

        System.out.println(reverseNegativeNum(num));
    }

    public static int reverseNegativeNum(int num){
        int reversed = 0;

        while (num != 0){

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    /*
     Java Question 04 - Reverse Negative Numbers
     Write a return method that can reverse negative number and return it as int
     */
}
