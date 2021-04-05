
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter
    
    //constructor
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }
    //method to print
    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }
    //method to decrease value
    public void decrement() {
        if(this.value > 0){
            this.value = this.value - 1;
        }
    }

    public void reset(){
        this.value = 0;
    }
}
