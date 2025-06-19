public class Q8_NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length()); 
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception during generateException: " + e.getMessage());
        }

        handleException();
    }
}