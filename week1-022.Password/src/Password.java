
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String secret = "JJ Lin";
        // Write your code here
        
        while (true) {
            System.out.println("Type the password:");
            String pass = reader.nextLine();
            
            if (pass.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: JJ lin");
        
    

            }
       }
