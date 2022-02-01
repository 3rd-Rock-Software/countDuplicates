package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingVowelsAndConsonants {
    // The solution to this problem involves traversing the string and checking
    // whether each character is a vowel or consonant. If the character is not a
    // vowel, then check it is between a - z.
    public void count(String str) {
        System.out.println("Running count.");
        System.out.println("The string is : " + str);
        int vowelCount = 0;
        int consonantCount = 0;
        str = str.toLowerCase();
        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (char ch : str.toCharArray()) {
            if (vowels.contains(ch)) {
                vowelCount++;
            } else {
                if (ch >= 'a' && ch <= 'z') {
                    consonantCount++;
                }
            }
        }
        if (vowelCount == 1) {
            System.out.println("There is " + vowelCount + " vowel.");
        } else {
            System.out.println("There are " + vowelCount + " vowels.");
        }
        if (consonantCount == 1) {
            System.out.println("There is " + consonantCount + " consonant.\n");
        } else {
            System.out.println("There are " + consonantCount + " consonants.\n");
        }
    }

}
