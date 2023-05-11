import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numberInput = new ArrayList<>();

        System.out.println("Enter numbers: ");

        int numInput = scanner.nextInt();

        while (numInput != 0) {
            numberInput.add(numInput);
            numInput = scanner.nextInt();
        }
        Integer sumOfArray = sum(numberInput);
        System.out.print(numberInput + " were the items in the list. The sum of that list is: " + sumOfArray);
    }

    public static int sum(ArrayList<Integer> list) {
        int sumOfArray = 0;
        for (int i = 0; i < list.size(); i++) {
            sumOfArray += list.get(i);
        }
        return sumOfArray;
    }
}