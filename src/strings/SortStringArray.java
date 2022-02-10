package strings;

import java.util.Arrays;

public class SortStringArray {

    public void sortArraysAlphabetically(String[] strArray) {
        //
        System.out.println("original array = " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("new array = " + Arrays.toString(strArray));
    }

    public void sortArraysByStringLength(String[] strArray) {
    }

}
