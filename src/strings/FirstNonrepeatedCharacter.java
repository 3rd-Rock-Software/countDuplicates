package strings;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.SortedMap;

public class FirstNonrepeatedCharacter {
    /**
     *
     */
    private static final String nonDuplicateString = "There are no non duplicate characters!\n";
    /**
     *
     */
    private static final String outputLead = "The first non repeating character is : ";
    /*
     * there are 3 solutions to this.
     * The first solution uses a single traversal approach. An array is populated
     * which stores the indexes of all the characters that appear exactly once in
     * the string. By using the array, it is possible to just return the smallest
     * index containing a non repeating character.
     * 
     * The second solution consists of looping the string for each character and
     * counting the number of occurences. Every second occurrence simply breaks the
     * loop, jumps to the next character and repeats the algorithm. If the end of
     * the string is reached the current character is returned as that will be the
     * first non repeating character
     * 
     * The third solution uses a linkedHashMap. This is an insertion order map. The
     * character are counted and added to the map in the order that they appear. The
     * hashMap is then iterated and the first character with a value of 1 will be
     * returned.
     */
    /*
     * this solution uses a single traversal
     */
    private CountDuplicates cd = new CountDuplicates();
    private String testString = "aabbccdffgg";
    private boolean nonDuplicate = true;

    public void getFirstNonRepeatedCharacterV1() {
        System.out.println("The string is " + testString + "\n");
        System.out.println("Running first non repeated character V1\nThis uses a single traversal approach");
        LocalDateTime startTime = LocalDateTime.now();
        // the algorithm checks to see if a character is repeated using "indexOf" and
        // "lastIndexOf"
        // a counter is used to check the position in the string
        // if the end of the string is reached, there are no duplicate characters
        for (char i : testString.toCharArray()) {
            if (testString.indexOf(i) == testString.lastIndexOf(i)) {
                System.out.println(outputLead + i);
                nonDuplicate = false;
                break;
            }
        }
        if (nonDuplicate) {
            System.out.println(nonDuplicateString);
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("The method took " + Duration.between(startTime, endTime) + "\n");
    }

    // this method loops the string and counts the occurence of each character in
    // the same way as the countDuplicates class. the results can then be scanned
    // for the first character with a value of 1
    public void getFirstNonRepeatedCharacterV2() {
        LocalDateTime startTime = LocalDateTime.now();
        nonDuplicate = true;
        System.out.println(
                "Running first non repeated character V2\nThis counts all the characters in the string and returns the first character with a value of 1");
        SortedMap<Character, Integer> results = cd.countDuplicates(testString);
        for (Entry<Character, Integer> entry : results.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(outputLead + entry.getKey());
                nonDuplicate = false;
                break;
            }
        }
        if (nonDuplicate) {
            System.out.println(nonDuplicateString);
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("The method took : " + Duration.between(startTime, endTime) + "\n");
    }

    public void getFirstNonRepeatedCharacterV3() {
        System.out.println(
                "Running first non repeating character V3.\nThis populates a linkedHashMap using characters as keys and Integers as values. It then just returns the first key with a value of 1.\n");
        nonDuplicate = true;
        // This method uses a linkedHashMap. This is an insertion order map so
        // characters are added to the map in the order that they are found in the text.
        // The count of each character is then incremented as they are found. It is then
        // simply a matter of iterating the map and returning the first character with a
        // value of 1
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : testString.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }
        for (Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(outputLead + entry.getKey() + "\n");
                nonDuplicate = false;
                break;
            }
        }
        if (nonDuplicate) {
            System.out.println(nonDuplicateString);
        }
    }
}
