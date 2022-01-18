package strings;

import java.util.Map;
import java.util.TreeMap;

public class CountDuplicates {
    /*
     * iterate the characters of a string and store them in a map
     * 
     * create a map to store strings where the character is the key
     * and the value is an integer representing the count of each character.
     * 
     * if the character is already present in the map then increment the character
     * count by 1
     * otherwise add the character to the map with a value of 1
     */
    public void countDuplicates(String str) {
        String lowerCase = str.toLowerCase();
        Map<Character, Integer> results = new TreeMap<>();
        for (char ch : lowerCase.toCharArray()) {
            if (results.containsKey(ch)) {
                results.put(ch, results.get(ch) + 1);
            } else {
                results.put(ch, 1);
            }
        }
        System.out.println("sorted by key:");
        System.out.println(results);
        System.out.println();
        // System.out.println("sorted by value:");
        // System.out.println(sortMapByValues(results));
    }

    // private Map sortMapByValues(Map<Character, Integer> results)
    // {
    // Map<Character, Integer> sortedMapByValues = new TreeMap<>(valueComparator);
    // }
}
