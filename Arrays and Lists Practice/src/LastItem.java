
import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter an integer: ");

        int numInput = scanner.nextInt();

        while (numInput != 0) {
            numbers.add(numInput);
            numInput = scanner.nextInt();
        }
        System.out.println("Done entering integers into the list");

        System.out.println("What number are you looking for in the list?");

        int numSearch = scanner.nextInt();
        int index = numbers.indexOf(numSearch);

            System.out.println("The index of the number is: " + index);
        }
    }
