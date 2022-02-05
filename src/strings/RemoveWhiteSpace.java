package strings;

import java.time.Duration;
import java.time.LocalDateTime;

public class RemoveWhiteSpace {

    public void whitespace(String str) {
        System.out.println("Removing whitespace.");
        LocalDateTime start = LocalDateTime.now();
        System.out.println("The string is " + str);
        System.out.println("The new string is " + str.replaceAll("\\s", ""));
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Time taken = " + Duration.between(start, end) + "\n");
    }

}
