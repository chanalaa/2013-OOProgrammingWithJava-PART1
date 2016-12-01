
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        float first = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        float sec = Integer.parseInt(reader.nextLine());
        
        float ans = first / sec;
        System.out.println("Division: " + first + "/" + sec + "=" + ans);
    }
}
