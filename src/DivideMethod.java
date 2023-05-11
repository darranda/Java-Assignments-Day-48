public class DivideMethod {
    public static void main(String[] args) {
        int numOne = 1;
        int numTwo = 3;
        divide(numOne, numTwo);
    }

    public static void divide(int numOne, int numTwo) {
        double result = (double) numOne / numTwo;
        System.out.println(numOne + "/" + numTwo + "=" + result);
    }
}
