
class MethodReturnTypes {
    public static void main (String[] args) {
        String myString = getString();
        int myInt = getInt();
        boolean myBool = getBoolean();


        System.out.println (myString);
        System.out.println (myInt);
        System.out.println (myBool);
    }

    public static String getString() {

        return "String of Text";
    }
    public static int getInt () {
        return 5;
    }
    public static boolean getBoolean() {
        return false;
    }
}
