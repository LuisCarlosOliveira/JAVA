
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics evenStatics = new Statistics();
        Statistics oddStatics = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        while( true){
            int number = Integer.valueOf(reader.nextLine());
            if(number == -1){
                break;
            }
            statistics.addNumber(number);
            if(number % 2 == 0){
                evenStatics.addNumber(number);
            } else {
                oddStatics.addNumber(number);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenStatics.sum());
        System.out.println("Sum of odd numbers: " + oddStatics.sum());
    }
}
