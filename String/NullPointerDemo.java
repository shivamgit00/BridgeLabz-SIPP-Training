public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length of the string: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of the string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
