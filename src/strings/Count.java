package strings;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Count {
    // The solution to this problem involves traversing the string and checking
    // whether each character is a vowel or consonant. If the character is not a
    // vowel, then check it is between a - z.
    public void countVowelsAndConsonants(String str) {
        System.out.println("Running count.");
        // System.out.println("The string is : " + str);
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
    // There are two easy ways to solve this.

    public void countOccurencesV1(String str, char ch) {
        // The first involves replacing all
        // occurences of the 'char' with "" and then subtracting the length of the new
        // string from the length of the original string.
        // CAUTION. This method does not work with long strings.
        LocalDateTime start = LocalDateTime.now();
        System.out.println("Running count occurrences V1");
        int originalSize = str.length();
        String newString = "";
        for (int index = 0; index < originalSize; index++) {
            if (str.charAt(index) == ch) {
                newString = str.replace(String.valueOf(ch), "");
            }
        }
        int newSize = newString.length();
        int difference = originalSize - newSize;
        if (difference == 1) {
            System.out.println("There is " + difference + " occurrence of " + ch);// + " in the string " + str);
        } else {
            System.out.println("There are " + difference + " occurrences of " + ch); // + " in the string " + str);
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Time taken = " + (Duration.between(start, end)) + "\n");

    }

    public void countOccurencesV2(String str, char ch) {
        // The second involves using a single traversal of the string and counting each
        // occurence of the 'char' specified
        System.out.println("Running count occurrences V2");
        LocalDateTime startTime = LocalDateTime.now();
        int count = 0;
        for (char index : str.toCharArray()) {
            if (index == ch) {
                count++;
            }
        }
        LocalDateTime endTime = LocalDateTime.now();
        if (count == 1) {
            System.out
                    .println("There is " + count + " occurrence of " + ch + " in the string ");
        } else {
            System.out.println(
                    "There are " + count + " occurrences of " + ch + " in the string ");
        }
        System.out.println("Time taken = " + Duration.between(startTime, endTime) + "\n");
    }
}
