package strings;

public class RemoveWhiteSpace {

    public void whitespace(String str) {
        System.out.print("Removing whitespace.\n");
        System.out.print("The string is " + str + "\n");
        System.out.print("The new string is " + str.replaceAll("\\s", "") + "\n");
    }

}
