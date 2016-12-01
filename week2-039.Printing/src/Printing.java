
public class Printing {

    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i = 0;
        
        while (i < sideSize)  {
            printStars(sideSize);
            i++;
           
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int i =0;
        int j =0;
        
        while ((i < width) && (j <height)) {
            printStars(width);
            i++;
            j++;
        }
        System.out.println("");
     }
    

    public static void printTriangle(int size) {
        //39.4 
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(6, 2);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

}
