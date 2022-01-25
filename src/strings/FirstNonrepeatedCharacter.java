package strings;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FirstNonrepeatedCharacter {
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
    private String testString = "aabbccddeffggh";

    public void getFirstNonRepeatedCharacterV1() {
        System.out.println("Running first non repeated character V1\n");
        int counter = 0;
        // the algorithm checks to see if a character is repeated using "indexOf" and
        // "lastIndexOf"
        // a counter is used to check the position in the string
        // if the end of the string is reached, there are no duplicate characters
        for (char i : testString.toCharArray()) {
            counter++;
            if (testString.indexOf(i) == testString.lastIndexOf(i)) {
                System.out.println("The first non repeating character is " + i);
                break;
            } else {
                if (counter == testString.length()) {
                    System.out.println("There are no non duplicate characters!");
                }
            }
        }
    }

    // this method loops the string and counts the occurence of each character in
    // the same way as the countDuplicates class. the results can then be scanned
    // for the first character with a value of 1
    public void getFirstNonRepeatedCharacterV2() {
        System.out.println("Running first non repeated character V2\n");
        TreeMap<Character, Integer> results = cd.countDuplicates(testString);
        for (Entry<Character, Integer> entry : results.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The first non repeating character is " + entry.getKey());
                break;
            }
        }
    }

}
