package iskandar;

public class Question_10 {

    public static void main(String[]  args){

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println("minNumber(arr) = " + minNumber(arr));

    }

    public static int minNumber(int[] arrayNums){

        int result = arrayNums[0];

        for (int arrayNum : arrayNums) {

            if (arrayNum < result) {

                result = arrayNum;
            }
        }
        return result;
    }

    /*
         Write a method that can find the minimum number from an int Array
         Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
         */
}
