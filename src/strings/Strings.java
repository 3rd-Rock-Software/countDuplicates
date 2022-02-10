package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Strings {
    private static String str = "It's the end of the world as we know it.";
    private static String[] strArray = { "delta", "bravo", "alpha", "echo", "charlie", "golf", "foxtrot" };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CountDuplicates duplicateCharacters = new CountDuplicates();
        duplicateCharacters.countDuplicates(getTextFile());
        FirstNonrepeatedCharacter firstNonrepeatedCharacter = new FirstNonrepeatedCharacter();
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV1();
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV2();
        firstNonrepeatedCharacter.getFirstNonRepeatedCharacterV3();
        ReverseWords reverseWords = new ReverseWords();
        reverseWords.reversedLetters(str);
        reverseWords.reverseWords(str);
        CheckForDigits digits = new CheckForDigits();
        digits.checkIfOnlyDigits(getTextFile());
        digits.checkIfOnlyDigits("1234");
        digits.checkIfOnlyDigits("1234abcd");
        Count count = new Count();
        count.countVowelsAndConsonants(str);
        count.countOccurencesV2(getTextFile(), 'a');
        count.countOccurencesV1("abcdefghijklmnopqrstuvwxyz", 'a');
        count.countOccurencesV2("abcdefghijklmnopqrstuvwxyz", 'a');
        RemoveWhiteSpace rmw = new RemoveWhiteSpace();
        rmw.whitespace(str);
        Join join = new Join();
        join.joinByDelimiter(' ', "How", "are", "you");
        Permutations perms = new Permutations();
        perms.permuteAndPrint("ab"); // BEWARE this is n!
        perms.permuteAndPrint("abc"); // BEWARE this is n!
        perms.permuteAndPrint("abcd"); // BEWARE this is n!
        perms.permuteAndPrint("123"); // BEWARE this is n!
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindromeV1("abcdefgfedcba");
        palindrome.isPalindromeV1("abcdefghijklm");
        palindrome.isPalindromeV2("abcdefgfedcba");
        palindrome.isPalindromeV2("abcdefghijklm");
        RemoveDuplicates rd = new RemoveDuplicates();
        rd.removeDuplicates("abcdefghiabcdxxyyz");
        rd.removeDuplicates(getTextFile());
        RemoveAgivenCharacter ragc = new RemoveAgivenCharacter();
        ragc.removeCharacterV1(str, 'd');
        ragc.removeCharacterV1(str, 'e');
        ragc.removeCharacterV2(str, 'd');
        ragc.removeCharacterV2(str, 'e');
        MostAppearances ma = new MostAppearances();
        ma.findMostUsedcharacter(getTextFile());
        SortStringArray ssa = new SortStringArray();
        ssa.sortArraysAlphabetically(strArray);
        ssa.sortArraysByStringLength(strArray);
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
