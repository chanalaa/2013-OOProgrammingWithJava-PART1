
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatest = 0, greater = 0;
        if (number1 < number2) {
            greater = number2;
            } else if (number1> number2) {
                greater = number1;
            }
        if (number3>greater) {
            greatest = number3;
        } else {
            greatest = greater;
        }
        
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}