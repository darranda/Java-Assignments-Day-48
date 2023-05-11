import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userInput = new ArrayList<>();

        System.out.println("Enter a string: ");

        String string = scanner.nextLine();
        userInput.add(string);

        while (!string.isEmpty()) {
            string = scanner.nextLine();
            userInput.add(string);
        }

            System.out.println("The fifth item in the list is: " + userInput.get(4));
        }
    }
