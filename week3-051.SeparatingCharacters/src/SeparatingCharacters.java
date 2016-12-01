
import java.util.Scanner;

public class SeparatingCharacters {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0, number = 1;
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
       
        while (i <= (name.length() - 1)) {
            System.out.println(number + ". character: " + name.charAt(i));
            i++;
            number++;
            
        }
       
    }
}
