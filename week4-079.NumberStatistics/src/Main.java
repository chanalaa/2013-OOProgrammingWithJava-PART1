
import java.util.Scanner;



public class Main {
    
   public static void main(String[] args) {
       
        Scanner reader = new Scanner(System.in);
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
      
      System.out.println("Type numbers:");
      while (true) {
        
        int num = Integer.parseInt(reader.nextLine());
        if (num == -1) {
            break;
        }
        
        sum.addNumber(num);
            if ((num % 2) == 1) {
                odd.addNumber(num);
            } else {
                even.addNumber(num);
            }
      }
      
      System.out.println("sum: " + sum.sum());
      System.out.println("sum of even: " + even.sum());
      System.out.println("sum of odd: " + odd.sum());
    }
}
