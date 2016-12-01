
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]:");
        int point = Integer.parseInt(reader.nextLine());
        
        if (29 >= point) {
            System.out.println("Grade: failed");
        } else if (34 >= point) {
            System.out.println("Grade: 1");
        } else if (39 >= point) {
            System.out.println("Grade: 2");
        } else if (44 >= point) {
            System.out.println("Grade: 3");
        } else if (49 >= point) {
            System.out.println("Grade: 4");
        } else if (60 >= point) {
            System.out.println("Grade: 5");
        }
    }
}
