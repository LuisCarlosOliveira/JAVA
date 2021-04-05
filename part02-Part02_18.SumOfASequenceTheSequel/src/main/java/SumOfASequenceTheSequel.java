
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number?");
        int min = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number?");
        int max = Integer.valueOf(scanner.nextLine());
        
        int sum = min;
        while(min < max){
            sum = sum + ++min;
        }
        System.out.print("The sum is " + sum);

    }
}
