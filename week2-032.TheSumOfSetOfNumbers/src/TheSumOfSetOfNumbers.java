
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        int i = 0, j = 0;
        int sum = 0;
               
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        j = Integer.parseInt(reader.nextLine());
        
        while (i <= j) {
            sum += i;
            i++;   
        }
        System.out.println("Sum is " + sum);
        
    }
} 
