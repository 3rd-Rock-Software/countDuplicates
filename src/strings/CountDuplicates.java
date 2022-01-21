package strings;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

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
        TreeMap<Character, Integer> results = new TreeMap<>();
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
        System.out.println("sorted by value:");
        System.out.println(sortMapByValues(results));
    }

    private String sortMapByValues(TreeMap<Character, Integer> results) {
        Entry<Character, Integer> firstEntry = results.firstEntry();
        int minValue = firstEntry.getValue();
        int maxValue = firstEntry.getValue();
        char minKey = firstEntry.getKey();
        char maxKey = firstEntry.getKey();
        for (Map.Entry<Character, Integer> entry : results.entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                minKey = entry.getKey();
            }
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return "The lowest used character is " + minKey + " with a value of " + minValue
                + ".\nThe most used character is " + maxKey + " with a value of " + maxValue + ".";
    }
}
