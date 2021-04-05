
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int old = 0;
        String name = "aaaa";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            
            int age = Integer.valueOf(parts[1]);
            if(age > old){
                old = age;
                name = parts[0];
            }
        }
        System.out.println("Age of the oldest: " + name);


    }
}
