
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if( input == 9999){
                break;
            }
            list.add(input);
        }
        System.out.println("");
        
        int minimum = list.get(0); 
        
        for (int i = 0; i < list.size(); i++) {
            if (minimum > list.get(i)) {
                minimum = list.get(i);
            }
        }

        System.out.println("Smallest number: " + minimum);
        
        int index = 0;
        while(index < list.size()){
            if(list.get(index) == minimum ){
                System.out.println("Found at index: " + index);                
            }
            index++;
        }
    }
}
