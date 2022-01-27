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
        // System.out.println(getTextFile());
        // System.exit(0);
        CountDuplicates duplicateCharacters = new CountDuplicates();
        FirstNonrepeatedCharacter firstNonrepeatedCharacter = new FirstNonrepeatedCharacter();
        ReverseWords reverseWords = new ReverseWords();
        duplicateCharacters.countDuplicates(getTextFile());
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV1();
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV2();
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV3();
        reverseWords.reverseLetters(str);
        reverseWords.reverseWords(reverseWords.reverseLetters(str));
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
