
// imort of needed Scanner class
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Please type your address and submit with 'enter' key");
        Scanner scanner = new Scanner(System.in);
        // nextline() - method that will return an input that user typed before hitting enter button
        String address = scanner.nextLine();
        System.out.println("Your address is: " + address);
    }
}
