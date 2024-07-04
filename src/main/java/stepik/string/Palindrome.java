package stepik.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));;
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        return text.equalsIgnoreCase(String.valueOf(new StringBuilder(text).reverse()));
    }

}
