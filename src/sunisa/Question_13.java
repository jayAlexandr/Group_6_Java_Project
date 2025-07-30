package sunisa;

import java.util.Arrays;

public class Question_13 {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZero (int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}

/*
Array -- Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
*/