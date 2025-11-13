package dsa.sorting;

import java.util.Arrays;

public class CustomComparator {
    public static void main(String[] args) {
        /*

        Arrays.sort(array, (a, b) -> {
         // custom comparison logic
         });

         */

        // Ques 1 Integer[] arr = {5, 1, 7, 3}; // Print in Descending order
        Integer[] arr = {5, 1, 7, 3};
        Arrays.sort(arr,(a,b)->b-a);
        System.out.println("Print Array is Descending Order: "+Arrays.toString(arr));

        Arrays.sort(arr,(a,b)->a-b);
        System.out.println("Print Array in Ascending order: "+Arrays.toString(arr));


        //  Example 2: Sort Strings by Length
        String[] names = {"Ram", "Shyam", "Aman", "Zara"};
        Arrays.sort(names,(a,b)->a.length()-b.length());
        System.out.println("Sorting dsa.string by length in increasing order: "+Arrays.toString(names));
        Arrays.sort(names,(a,b)->b.length()-a.length());
        System.out.println("Sorting dsa.string by length in decreasing order: "+Arrays.toString(names));

        //Example 3: Largest Number Problem
        String[] arr1 = {"3", "30", "34", "5", "9"};
        Arrays.sort(arr1,(a,b)->(b+a).compareTo(a+b));
        System.out.println("largest number: "+Arrays.toString(arr1));
    }
}
