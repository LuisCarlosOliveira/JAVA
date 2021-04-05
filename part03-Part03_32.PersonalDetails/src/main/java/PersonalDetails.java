
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int length = 0, count = 0;
        String name = "aaaa";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            
            int temp = parts[0].length();
            if(temp > length){
                length = temp;
                name = parts[0];
            }
            sum = sum + Integer.valueOf(parts[1]);
            count++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum  / count));
    }
}
