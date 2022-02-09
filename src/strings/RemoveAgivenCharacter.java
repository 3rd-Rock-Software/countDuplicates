package strings;

import java.util.regex.Pattern;

public class RemoveAgivenCharacter {

    public void removeCharacterV1(String str, char ch) {
        // This method utilises the "replaceAll" method
        System.out.println("Running remove character V1 \"" + ch + "\"");
        String newString = str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
        System.out.println(newString + "\n");
    }

    public void removeCharacterV2(String str, char ch) {
        // This method uses stringBuilder to achieve the same result.
        System.out.println("Running remove character V2 \"" + ch + "\"");
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString() + "\n");
    }

}
