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
        System.out.println("Running first non repeated character V1\nThis uses a single traversal approach\n");
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV1();
        System.out.println(
                "Running first non repeated character V2\nThis counts all the characters in the string and returns the first character with a value of 1\n");
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV2();
        System.out.println(
                "Running first non repeating character V3.\nThis populates a linkedHashMap using characters as keys and Integers as values. It then just returns the first key with a value of 1.\n");
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV3();
        System.out.println("Running reverse letters\n");
        reverseWords.reversedLetters(str);
        reverseWords.reverseWords(str);
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
