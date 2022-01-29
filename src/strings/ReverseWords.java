package strings;

public class ReverseWords {
    // The first task is to reverse the letters of each word but leave the order of
    // the words the same
    // the string is split into an array of words using the whitespace as the
    // delimiter.
    // The letters of each word are reversed using the corresponding ASCII code, the
    // result is then appended to stringBuilder
    private final String whitespace = " ";
    private String[] words;

    public StringBuilder reversedLetters(String str) {
        System.out.println("Running reverse letters");
        words = str.split(whitespace);
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedString.append(reversedWord).append(whitespace);
        }
        System.out.println(reversedString + "\n");
        return reversedString;
    }// To reverse the words as well as the letters of each word it is simply a case
     // of calling StringBuilder.reverse()

    public void reverseWords(String str) {
        System.out.println("Running reverse words");
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println(reversedString + "\n");
        System.out.println("What about reversing the words without reversing the letters");
        System.out.println("The original string is : " + str);
        StringBuilder reversedSentence = new StringBuilder();
        words = str.split(whitespace);
        for (int index = words.length - 1; index >= 0; index--) {
            reversedSentence.append(words[index]).append(whitespace);
        }
        System.out.println("The reversed sentence is : " + reversedSentence + "\n");
    }
}
