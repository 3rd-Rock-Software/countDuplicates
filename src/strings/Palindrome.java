package strings;

public class Palindrome {

    public void isPalindromeV1(String str) {
        // This involves comparing the string characters using a meet in the middle
        // approach. Compare the first and last character, then the second and second to
        // last etc.
        int left = 0;
        int right = str.length() - 1;
        boolean palindrome = true;
        while (left < right && palindrome) {
            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
            }
            left++;
            right--;
        }
        if (!palindrome) {
            System.out.println("The string " + str + " is not a palindrome");
        } else {
            System.out.println("The string " + str + " is a palindrome");
        }
    }

}
