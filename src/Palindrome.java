public class Palindrome {
    public static boolean isPalindrome(String str) {
        String reverse = Reverce.stringReverce(str);
        return reverse.equals(str);

    }
}
