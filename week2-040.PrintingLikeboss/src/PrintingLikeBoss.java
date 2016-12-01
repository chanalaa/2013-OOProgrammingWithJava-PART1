public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 0;
        int j = 1;
        while (i < size) {
            printWhitespaces(size - j);
            printStars(j);
            i++;
            j++;
        }
        
            
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        int j = 1;
        int k = 1;
        int p = 1;
        while (i < height) {

            printWhitespaces(height - j);
            printStars(k);
            k = k + 2;
            j++;
            i++;
        }

        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);

        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(1);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
