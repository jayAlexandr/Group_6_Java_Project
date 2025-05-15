package nargiza;

public class test01 {
    public class Question_1 {

        public static void main(String[] args) {
            int number = 5;
            identify(number);


            /**
             * Odd or Even
             * Write  a method which can identify given number is even or odd
             *          Output ex:
             *          identify(5); ->"Odd"
             *          identify(6); ->"Even"
             */
        }

        public static void identify(int number){
            if (number%2==0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }
    }

}
