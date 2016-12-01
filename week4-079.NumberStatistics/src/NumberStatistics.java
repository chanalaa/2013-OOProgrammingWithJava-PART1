
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum = 0;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.sum += number;
        this.amountOfNumbers++;        
    }
    
    public int sum() {
        return this.sum;
    }

    public double average(){
        double average;
        if (this.sum == 0) {
            average = 0;
        } else {
            average = (double)sum/amountOfNumbers();}
        return average;
    }
    
    
    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
}