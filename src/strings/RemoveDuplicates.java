package strings;

public class RemoveDuplicates {

    public void removeDuplicates(String str) {
        str = str.toLowerCase();
        System.out.println("Running remove duplicates.");
        // System.out.println("The string is " + str);
        // this method uses stringBuilder.indexOf(). This returns the index within the
        // given string of the first occurence of the specified character. The solution
        // loops the characters of the test string and adds them to a stringbuilder
        // object every time the index of method returns "-1". (This means the character
        // is not present in the stringbuilder.)
        char[] chArray = str.toCharArray();
        StringBuilder individuals = new StringBuilder();
        for (char ch : chArray) {
            if (individuals.indexOf(String.valueOf(ch)) == -1) {
                individuals.append(ch);
            }
        }
        System.out.println("The string without duplicates is : " + individuals.toString() + "\n");
    }

}
