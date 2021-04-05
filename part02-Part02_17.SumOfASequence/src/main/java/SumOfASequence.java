
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        
        int sum = 1;
        for(int count = 2; count <=number; count++){
            sum= sum+count;
        }
        System.out.println("The sum is " + sum);
            

    }
}
