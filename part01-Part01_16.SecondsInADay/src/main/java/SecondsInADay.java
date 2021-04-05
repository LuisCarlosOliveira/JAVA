
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int secondsInDay = Integer.valueOf(scanner.nextLine());
        secondsInDay = secondsInDay * 24 * 60 * 60; //days * hoursIn1day * minutesIn1Hour * secondsIn1Minute
        System.out.println(secondsInDay);

    }
}
