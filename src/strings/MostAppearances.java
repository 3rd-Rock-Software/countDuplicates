package strings;

import java.util.Map.Entry;
import java.util.SortedMap;

public class MostAppearances {

    public void findMostUsedcharacter(String str) {
        CountDuplicates cd = new CountDuplicates();
        SortedMap<Character, Integer> results = cd.countDuplicates(str);
        int maxValue = 0;
        char maxKey = ' ';
        for (Entry<Character, Integer> entry : results.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("The most used character is " + maxKey + " with a value of " + maxValue + "\n");
    }

}
