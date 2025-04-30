package fatih;

public class Question_1 {
    public static void main(String[] args) {

        oddOrEven(0);

    }
    public static void oddOrEven(int num){

        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}