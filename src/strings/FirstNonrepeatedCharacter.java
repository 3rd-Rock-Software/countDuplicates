package strings;

import java.util.TreeMap;

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
     * this solution uses the linkedHashMap
     */
    CountDuplicates cd = new CountDuplicates();
    TreeMap<Character, Integer> text = cd.getResults();

    public void getFirstNonRepeatedCharacter() {
        // TODO document why this method is empty
    }

}
