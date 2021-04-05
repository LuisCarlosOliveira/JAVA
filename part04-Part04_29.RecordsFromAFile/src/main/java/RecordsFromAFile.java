
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while( fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                //split string
                String[] parts = line.split(",");
                String name = parts[0];
                System.out.println(name + ",age: " + parts[1] + " years" );
            }
        } catch (Exception e) {

            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
