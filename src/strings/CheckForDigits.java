package strings;

import java.util.HashSet;
import java.util.Set;

public class CheckForDigits {

    public void checkIfOnlyDigits(String characters) {
        System.out.println("Running check if only digits.");
        if (characters.length() > 201) {
            System.out.println(
                    "The string contains more than 200 characters. The first part is : " + characters.substring(0, 200)
                            + "\n");
        } else {
            System.out.println("The string is : " + characters + "\n");
        }
        boolean onlyDigits = false;
        // String characters1 = "jnoib ";
        Set<Character> numbers = new HashSet<>();
        Set<Character> letters = new HashSet<>();
        for (char ch : characters.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(ch);
            } else {
                letters.add(ch);
            }
            if (letters.isEmpty()) {
                onlyDigits = true;
            }
        }
        if (onlyDigits) {
            System.out.println(characters + " only contains the numbers : " + numbers);
        } else {
            if (numbers.isEmpty()) {
                System.out.println("There are no digits. The string only contains the characters " + letters + "\n");
            } else {
                System.out.println("The string contains numbers and letters.\nThe letters are :" + letters
                        + "\nThe numbers are :" + numbers + "\n");
            }
        }
    }

}
