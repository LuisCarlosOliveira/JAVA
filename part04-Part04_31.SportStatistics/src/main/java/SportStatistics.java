
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while( fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                int firstResult = Integer.valueOf(parts[2]);
                int secondResult = Integer.valueOf(parts[3]);
                
                if(parts[0].equals(team)){
                    if(firstResult > secondResult){
                        wins++;
                    } else {
                        losses++;
                    }
                    games++;
                } else if(parts[1].equals(team)){
                    if(firstResult < secondResult){
                        wins++;
                    } else {
                        losses++;
                    }
                    games++;
                }
                
            }
        }catch( Exception e){
            
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
