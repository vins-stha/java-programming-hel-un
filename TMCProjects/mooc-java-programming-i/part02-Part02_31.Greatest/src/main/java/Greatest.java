
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        if(number1 >= number2 && number1 >= number3) {
            return number1;
        }
        if(number2 >= number3 && number2 >= number1) {
            return number2;
        }
        if(number3 >= number2 && number3 >= number2) {
            return number3;
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
