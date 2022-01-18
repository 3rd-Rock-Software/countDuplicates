package strings;

import java.util.Map;
import java.util.TreeMap;

public class CountDuplicates {
    char minCH;
    char maxCH;
    int minValue = 0;
    int maxValue = 0;

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
    /**
     * @return the minValue
     */
    public int getMinValue() {
        return minValue;
    }

    /**
     * @param minValue the minValue to set
     */
    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    /**
     * @return the maxValue
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * @param maxValue the maxValue to set
     */
    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * @return the minCH
     */
    public char getMinCH() {
        return minCH;
    }

    /**
     * @param minCH the minCH to set
     */
    public void setMinCH(char minCH) {
        this.minCH = minCH;
    }

    /**
     * @return the maxCH
     */
    public char getMaxCH() {
        return maxCH;
    }

    /**
     * @param maxCH the maxCH to set
     */
    public void setMaxCH(char maxCH) {
        this.maxCH = maxCH;
    }

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
        getMinValue(results);
        System.out.println("sorted by key:");
        System.out.println();
        System.out.println(results);
        System.out.println();
        System.out.println("The least used character is : " + getMinCH());
        // System.out.println("sorted by value:");
        // System.out.println(sortMapByValues(results));
    }

    private void getMinValue(Map<Character, Integer> results) {

        // int maxValue = 0;

        // there is a bug in the logic for the if statement here. on the initial
        // iteration getminvalue = 0

        // the logic needs to:

        // initialise min value with the first entry value
        // if minvalue is more than the next entry value, minValue = entry value
        for (Map.Entry<Character, Integer> entry : results.entrySet()) {
            if (getMinValue() < entry.getValue()) {
                setMinValue(entry.getValue());
                setMinCH(entry.getKey());
            }
            // if (entry.getValue() > maxValue){
            // maxValue = entry.getValue();
            // maxCH = entry.getKey();
            // }
        }
    }

    // private Map sortMapByValues(Map<Character, Integer> results)
    // {
    // Map<Character, Integer> sortedMapByValues = new TreeMap<>(valueComparator);
    // }
}
