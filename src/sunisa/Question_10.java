package sunisa;

public class Question_10 {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("Minimum number: " + miniNumber(arr));
    }

    public static int miniNumber(int[] arr) {
        int minimumNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimumNumber) {
                minimumNumber = arr[i];
            }
        }
        return minimumNumber;
    }
}

/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
*/
