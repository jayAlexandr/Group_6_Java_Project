package nick;

public class Question_1 {

    public static void main(String[] args) {

        identify(8);
        identify(5);

    }
    public static void identify (int number){
        if (number % 2 == 0 ){
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
/*
 * Odd or Even
 * Write  a method which can identify given number is even or odd
 *          Output ex:
 *          identify(5); ->"Odd"
 *          identify(6); ->"Even"
 */