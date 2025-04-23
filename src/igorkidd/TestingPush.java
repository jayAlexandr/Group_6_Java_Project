package igorkidd;

import java.util.function.BiPredicate;

public class TestingPush {
    public static void main(String[] args) {
        BiPredicate<int[],Integer> contains = (a, b) ->{
            for (int each : a) {
                if(each==b){
                    return true;
                }
            }
            return false;
        };

        int[]nums = {1,3,2,5,76,7,8};
        System.out.println(contains.test(nums,1));//1 contains inside the array
    }
}
