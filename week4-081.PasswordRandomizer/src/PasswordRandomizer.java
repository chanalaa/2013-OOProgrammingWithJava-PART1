import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int value;
    private final int length;
    private Random random = new Random();
    private String pass = ""; 
    private String resetPass ="";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.pass += "abcdefghijklmnopqrstuvwxyz".charAt(value);
        this.value = this.random.nextInt(26);
    }

    public String createPassword() {
        // write code that returns a randomized password
        for (int i =0; i < this.length; i++) {
            this.resetPass += "abcdefghijklmnopqrstuvwxyz".charAt(value);
            this.value = this.random.nextInt(26);
        }
        this.pass = this.resetPass;
        this.resetPass = "";
        return this.pass;
    }
}
