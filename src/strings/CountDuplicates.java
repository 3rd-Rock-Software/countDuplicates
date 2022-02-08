package strings;

import java.util.SortedMap;
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

    private SortedMap<Character, Integer> results = new TreeMap<>();

    /**
     * @return the results
     */
    public SortedMap<Character, Integer> getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(SortedMap<Character, Integer> results) {
        this.results = results;
    }

    public SortedMap<Character, Integer> countDuplicates(String str) {
        String lowerCase = str.toLowerCase();
        for (char ch : lowerCase.toCharArray()) {
            if (results.containsKey(ch)) {
                results.put(ch, results.get(ch) + 1);
            } else {
                results.put(ch, 1);
            }
        }
        return results;
    }
}
