
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum =0;
        int count = 0;
        
        while( true ){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if( number == 0){
                break;
            }
            if( number > 0){
                sum = sum + number;
                count = count + 1;
            }
            
        }
        if(count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / count;
            System.out.println("Average of the numbers: " + average);
        }

    }
}
