
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0, sum = 0;
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        while (i <= number) {
             int result = (int)Math.pow(2, i);
             i++;
             sum += result;
        }
        System.out.println("The result is " + sum);
    }
}
