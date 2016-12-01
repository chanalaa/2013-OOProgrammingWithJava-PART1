
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int upper = 1, lower = 1; 
        System.out.println("First: ");
        lower = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        upper = Integer.parseInt(reader.nextLine());
        
        while (lower <= upper) {
            System.out.println(lower);
            lower++; 
            if (lower > upper) {
                break;
            }
        }
    }
}