package strings;

import java.util.HashSet;
import java.util.Set;

public class CheckForDigits {

    public void checkIfOnlyDigits() {
        System.out.println("Running check if only characters.");
        boolean onlyDigits = false;
        String characters = "jnoib";
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
            System.out.println(characters + " only contains the characters : " + numbers);
        } else {
            if (numbers.isEmpty()) {
                System.out.println("There are no characters. The string only contains the letters " + letters);
            } else {
                System.out.println("The string contains numbers and letters.\nThe letters are :" + letters
                        + "\nThe numbers are :" + numbers);
            }
        }
    }

}
