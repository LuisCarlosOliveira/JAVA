
import java.nio.file.Paths;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luís Oliveira <github.com/LuisCarlosOliveira>
 */
public class IsItInTheFile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int lines = 0;
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while( fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                if( !row.contains(searchedFor)){ //if string not found continues
                    continue;
                }
                lines++;
            }
        } catch (Exception e) {

            System.out.println("Reading the file " + file + " failed.");
        }
        if (lines == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }
    }        
}
