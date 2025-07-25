package nick;

public class Question_11 {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        arr = sortAscendingOrder(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortAscendingOrder(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

/*
Sort Ascending
Write a return method that can sort an int array in Ascending order
without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
*/
