package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Strings {
    private static String str = "It's the end of the world as we know it.";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CountDuplicates duplicateCharacters = new CountDuplicates();
        FirstNonrepeatedCharacter firstNonrepeatedCharacter = new FirstNonrepeatedCharacter();
        ReverseWords reverseWords = new ReverseWords();
        CheckForDigits digits = new CheckForDigits();
        Count count = new Count();
        RemoveWhiteSpace rmw = new RemoveWhiteSpace();
        Join join = new Join();
        Permutations perms = new Permutations();
        duplicateCharacters.countDuplicates(getTextFile());
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV1();
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV2();
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV3();
        reverseWords.reversedLetters(str);
        reverseWords.reverseWords(str);
        digits.checkIfOnlyDigits(getTextFile());
        digits.checkIfOnlyDigits(str);
        count.countVowelsAndConsonants(str);
        // count.countOccurencesV2(getTextFile(), 'a');
        // System.exit(0);
        count.countOccurencesV1("abcdefghijklmnopqrstuvwxyz", 'a');
        count.countOccurencesV2("abcdefghijklmnopqrstuvwxyz", 'a');
        rmw.whitespace(str);
        join.joinByDelimiter(' ', "How", "are", "you");
        perms.permuteAndPrint("abcd");
    }

    public static String getTextFile() {
        StringBuilder text = new StringBuilder();
        File shakespeare = new File("C:\\newRepositories\\strings\\completeWorks.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(shakespeare);
            while (scanner.hasNextLine()) {
                text.append(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("text file not found" + ex);
            System.exit(0);
        } finally {
            if (scanner != null) {
                scanner.close();
            }

        }
        return text.toString();
    }
}
