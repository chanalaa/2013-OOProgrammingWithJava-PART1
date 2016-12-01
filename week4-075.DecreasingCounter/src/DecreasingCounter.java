public class DecreasingCounter {
    private int value; // instance variable that remembers the value of the counter
    private int valueAtstart;
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        valueAtstart = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (this.value == 0) {
            
        } else {
            this.value--;
        }
    }
    
    public void reset() {
        this.value = 0;
    }
    
    public void setInitial() {
        this.value = valueAtstart;
    }
    // and here the rest of the methods
}
