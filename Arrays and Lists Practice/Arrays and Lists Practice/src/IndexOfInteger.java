import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers: ");

        int input = scanner.nextInt();
        while (input != 0) {
            numbers.add(input);
            input = scanner.nextInt();
        }
        System.out.println("Done entering integers into the list.");

        System.out.println("What number are you looking for in the list?");
        int search = scanner.nextInt();
        int index = numbers.indexOf(search);
        if (index == -1) {
            System.out.println("The number was not found in the list.");
        } else {
            System.out.println("The index of the number is: " + index);
        }
    }
}
