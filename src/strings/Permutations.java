package strings;

import java.time.Duration;
import java.time.LocalDateTime;

public class Permutations {
    private int count = 1;

    public void permuteAndPrint(String str) {
        System.out.println("Running permutations of " + str);
        LocalDateTime start = LocalDateTime.now();
        permuteAndPrint("", str);
        LocalDateTime end = LocalDateTime.now();
        System.out.println("\nTime taken = " + Duration.between(start, end) + "\n");
        count = 1;
    }

    private void permuteAndPrint(String prefix, String str) {

        int n = str.length();
        if (n == 0) {
            System.out.print(count + ":" + prefix + ", ");
            count++;
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }

}
