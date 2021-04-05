
public class Statistics {
    //instance variable
    private int count;
    private int sum;
    
    //constructor
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    //method adds a new number to the statistics
    public void addNumber(int number) {
        this.count++;
        this.sum = number + this.sum;
    }
    // method tells the number of added numbers
    public int getCount() {
        return this.count;
    }
    //method -> sum of the numbers added
    public int sum() {
        if( this.count == 0){
            return this.sum = 0;
        }
        return this.sum;
    }
    //method -> average of the numbers added
    public double average() {
        if( this.count == 0){
            return 0;
        }
        return (double) this.sum / this.count;
    }
}
