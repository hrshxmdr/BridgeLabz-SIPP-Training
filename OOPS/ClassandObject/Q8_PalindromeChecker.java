class Q8_PalindromeChecker {
    String text;

    Q8_PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        return new StringBuilder(text).reverse().toString().equals(text);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("'" + text + "' is a palindrome");
        } else {
            System.out.println("'" + text + "' is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Q8_PalindromeChecker checker = new Q8_PalindromeChecker("madam");
        checker.displayResult();
    }
}