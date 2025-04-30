package sino;

public class Question_1 {

    public static void main(String[] args) {


        /*
         * Odd or Even
         * Write  a method which can identify given number is even or odd
         *          Output ex:
         *          identify(5); ->"Odd"
         *          identify(6); ->"Even"
         */
        identify(3);

    }

    public static void identify(int num){

        if(num%2 ==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }



    }

