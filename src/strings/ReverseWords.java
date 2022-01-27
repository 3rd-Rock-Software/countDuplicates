package strings;

public class ReverseWords {
    // The first task is to reverse the letters of each word but leave the order of
    // the words the same
    // the string is split into an array of words using the whitespace as the
    // delimiter.
    // The letters of each word are reversed using the corresponding ASCII code, the
    // result is then appended to stringBuilder

    private final String whitespace = " ";

    public StringBuilder reverseLetters(String str) {
        System.out.println("Running reverse letters\n");
        String[] words = str.split(whitespace);
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedString.append(reversedWord).append(whitespace);
        }
        System.out.println(reversedString);
        return reversedString;
    }// To reverse the words as well as the letters of each word it is simply a case
     // of calling StringBuilder.reverse()

    public void reverseWords(StringBuilder str) {
        System.out.println("Running reverse words\n");
        System.out.println(str.reverse());
        // I think this is reversing the reversed words. The output is words in reverse
        // order but the letters are in the correct order
    }
}
