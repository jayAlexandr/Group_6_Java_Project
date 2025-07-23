package sunisa;

public class Question_11 {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        int[] sorted = sortedAscending(arr);

        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }
        return arr;
    }
}

/*
Write a return method that can sort an int array in Ascending order
without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */
