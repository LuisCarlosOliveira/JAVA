
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to?");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int number2 = Integer.valueOf(scanner.nextLine());
        
        
        while(number2 <= number1){
            if (number2 > number1){
                break;
            }
            System.out.println(number2++);
        }
    }
}
