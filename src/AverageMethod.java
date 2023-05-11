
public class AverageMethod {
    public static void main (String[] args) {
        int numOne = 2;
        int numTwo = 5;
        int numThree =8;
        double avg = average(numOne, numTwo, numThree);

        System.out.println(avg);
        
    }

    public static int sum (int numOne, int numTwo, int numThree) {
        return numOne + numTwo + numThree;
    }
    public static int average(int numOne, int numTwo, int numThree) {
        int sum = sum (numOne, numTwo, numThree);
        double avg = (double) sum / 3;
        return (int) avg;
    }

}
