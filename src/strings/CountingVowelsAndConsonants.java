package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingVowelsAndConsonants {
    // The solution to this problem involves traversing the string and checking
    // whether each character is a vowel or consonant.
    public void count(String str) {
        System.out.println("Running count.");
        char[] chars = str.toCharArray();
        Set<Character> count = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        System.out.println(chars);
    }

}
