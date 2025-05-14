package nick;

public class Question_4 {
    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(92165));
    }

    public static int reverseNegativeNumber(int num) {

        if (num >= 0) {
            System.out.print("Number must be negative! ");
            return num;
        }
        int reversed = 0;
        num = -num;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.print("Reversed number: ");
        return reversed;
    }
}
//  Write a return method that can reverse negative number and return it as int