
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = reader.nextLine();
        
        try( Scanner scanner = new Scanner(Paths.get(input))){
            while(scanner.hasNextLine()){
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
