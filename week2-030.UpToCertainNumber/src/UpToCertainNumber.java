
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 1, i = 1;
        
        System.out.println("Up to what number? ");
        number = Integer.parseInt(reader.nextLine());
        
        while (i <= number) {
            System.out.println(i);
            i++;
        }
        
        
    }
}
