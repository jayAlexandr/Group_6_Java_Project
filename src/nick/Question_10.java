package nick;

public class Question_10 {
    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int minNum = findMinNum(arr);
        System.out.println("Minimum number is: " + minNum);
    }

    public static int findMinNum(int[] arr){
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }
}

/*
Find Minimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
*/