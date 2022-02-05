package strings;

public class Join {

    public void joinByDelimiter(char delimiter, String str1, String str2, String str3) {
        StringBuilder result = new StringBuilder();
        result.append(str1).append(delimiter).append(str2).append(delimiter).append(str3);
        System.out.println("The strings are\n\"" + str1 + "\"\n\"" + str2 + "\"\n\"" + str3 + "\"\n");
        System.out.println("The result is : \"" + result + "\"\n");
    }

}
