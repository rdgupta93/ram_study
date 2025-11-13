package dsa.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // a Set is a collection that does not allow duplicate elements and can store at most one null value
        //Types of Set Implementations in Java
//    HashSet (Most Common)
//    LinkedHashSet
//    TreeSet

//    1. HashSet (Uses Hashing)
//    Unordered: Does not maintain insertion order.
//    Allows null value.
//    Fast operations: O(1) time complexity for add, remove, and contains.
//        Set<String> names = new HashSet<>();
//        names.add("Alice");
//        names.add("Bob");
//        names.add("Charlie");
//        names.add("Alice");  // Duplicate, ignored
//
//        System.out.println(names);


        //2. LinkedHashSet (Maintains Insertion Order)
        //Ordered: Maintains insertion order.
        //Allows null value.
        //Slower than HashSet but preserves order.

//        Set<Integer> numbers = new LinkedHashSet<>();
//        numbers.add(10);
//        numbers.add(5);
//        numbers.add(20);
//        numbers.add(10);  // Duplicate, ignored
//
//        System.out.println(numbers);  // Output: [10, 5, 20] (Maintains order)

        //3. TreeSet (Sorted Set)
//        Sorted: Maintains elements in ascending order.
//        Does not allow null values.
//        Slower operations: O(log N) due to Red-Black Tree implementation.

//        Set<Integer> sortedNumbers = new TreeSet<>();
//        sortedNumbers.add(30);
//        sortedNumbers.add(10);
//        sortedNumbers.add(20);
//
//        System.out.println(sortedNumbers);  // Output: [10, 20, 30] (Sorted order)



//        Easy Level
//        Find Duplicate Elements - Given an array of integers, find if there are any duplicates using a HashSet.
//        Check if a Number Exists in an Array - Given an array and a number, check if the number exists in the array using a HashSet.
//        Union of Two Arrays - Given two arrays, find the count of unique elements present in both arrays.
//        Intersection of Two Arrays - Given two arrays, find the common elements using a HashSet.
//        Find the First Repeating Element - Given an array, find the first element that appears more than once using a HashSet.
//        Check for a Pair with Given Sum - Given an array and a target sum, check if any pair of numbers adds up to the target using a HashSet.
//        Remove Duplicates from an Array - Given an unsorted array, return a list of unique elements.
//        Check if a String Contains All Unique Characters - Given a dsa.string, check if all characters are unique.
//        Missing Number in an Array - Given an array of size n-1 containing numbers from 1 to n, find the missing number.
//        Find the Second Largest Element - Given an array, find the second largest element using a HashSet.
//
//        Medium Level
//        Subarray with Zero Sum - Given an array, check if there exists a subarray with a sum equal to 0 using a HashSet.
//        Find Pair with Difference K - Given an array and a number K, find a pair such that their absolute difference is K.
//        Longest Consecutive Sequence - Given an unsorted array, find the longest sequence of consecutive numbers using a HashSet.
//        Find Common Elements in Three Sorted Arrays - Given three sorted arrays, find elements common in all three using a HashSet.
//        Check if an Array is a Subset of Another - Given two arrays, check if one is a subset of the other.
//        Find the First Non-Repeating Character in a String - Given a dsa.string, find the first non-repeating dsa.character using a HashSet.
//        Group Anagrams Together - Given an array of strings, group anagrams together.
//        Count Distinct Elements in Every Window of Size K - Given an array and window size K, count distinct elements in every window.
//        Find the Longest Substring Without Repeating Characters - Given a dsa.string, find the length of the longest substring without repeating characters.
//        Find Triplets with Zero Sum - Given an array, find all triplets whose sum is 0.
//
//        Hard Level
//        Count Distinct Subsequences - Given a dsa.string, count the number of distinct subsequences using a HashSet.
//        Largest Subarray with Equal Number of 0s and 1s - Given an array of 0s and 1s, find the largest subarray with equal 0s and 1s.
//        Find the Smallest Window in a String Containing All Characters of Another String - Given two strings, find the smallest window in s1 containing all characters of s2.
//        Find the Largest Subarray with a Given Sum K - Given an array, find the longest subarray whose sum equals K.
//        Count Pairs with XOR in a Given Range - Given an array and a range, count the number of pairs with a given XOR value.
//        Word Break Problem - Given a dictionary and a dsa.string, check if the dsa.string can be segmented into dictionary words.
//        Find the Longest Palindrome that Can Be Built Using Letters of a Given String - Given a dsa.string, find the longest palindrome that can be built using its letters.
//        Check If Two Strings Are K-Anagrams - Two strings are K-anagrams if they can be made identical by changing at most K characters.
//        Find the Number of Unique Islands in a Grid - Given a grid of 0s and 1s, count the number of unique islands using a HashSet.
//        Find the Minimum Window Substring - Given two strings s1 and s2, find the smallest substring in s1 that contains all characters of s2.
//

     //   Problem: Find Duplicate Elements
     // nums = [1, 2, 3, 4, 5, 2] true    nums = [10, 20, 30, 40] false

//     int arr [] = {1, 2, 3, 4, 5, 6};
//     Set<Integer> hs = new HashSet<>();
//      for(Integer num :arr){
//          hs.add(num);
//      }
//      if(hs.size()==arr.length){
//          System.out.println("false");
//      }else{
//          System.out.println("true");
//      }

        // Problem Statement: Check if a Number Exists in an Array
//        arr = [1, 3, 5, 7, 9]
//        x = 5                 true
//        int arr [] = {1, 3, 5, 7, 9};
//        int x =6;
//        Set<Integer>hs = new HashSet<>();
//        for(Integer num:arr){
//            hs.add(num);
//        }
//        if(hs.contains(x)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

        // Union of Two Arrays - Given two arrays, find the count of unique elements present in both arrays.
        //arr1 = [1, 2, 3, 4, 5]
        //arr2 = [3, 4, 5, 6, 7]   ans =7
//        int [] arr = {10, 20, 30, 40};
//        int [] arr1 ={30, 40, 50, 60, 70};
//        Set<Integer> hs = new HashSet<>();
//        for(Integer num:arr){
//            hs.add(num);
//        }
//        for(Integer num:arr1){
//            hs.add(num);
//        }
//        System.out.println(hs.size());

        // Problem Statement: Intersection of Two Arrays
//        arr1 = [1, 2, 2, 3, 4]
//        arr2 = [2, 2, 3, 5]           ans =2,3

//        int arr [] ={1, 2, 2, 3, 4};  // 1 2 3 4
//        int arr1[] ={2, 2, 3, 5};     // 2 3 5
//        Set<Integer> hs1 = new HashSet<>();
//        Set<Integer>hs2 = new HashSet<>();
//        for(Integer num :arr){
//            hs1.add(num);
//        }
//        for(Integer num:arr1){
//            hs2.add(num);
//        }
//        List<Integer>ans = new ArrayList<>();
//        for(Integer num :hs1){
//            if(hs2.contains(num)){
//                ans.add(num);
//            }
//        }
//        System.out.println(ans);

      // Problem Statement: First Repeating Element
        // The first repeating element is the one that appears more than once and has the smallest index among all repeating elements.
      //  arr = [1, 5, 3, 4, 3, 5, 6]  ans = 5
//        int [] arr = {1, 5, 3, 4, 3, 5, 6};
//        int index =arr.length;
//        Map<Integer,Integer> hm = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(hm.containsKey(arr[i])){
//              if(index>hm.get(arr[i])){
//                  index=hm.get(arr[i]);
//              }
//            }else{
//                hm.put(arr[i],i);
//            }
//        }
//        System.out.println(arr[index]+" "+index);

        // Remove Duplicates from an Array - Given an unsorted array, return a list of unique elements.
        // easy to solve put all arr nums in hs and print

        // Check if a String Contains All Unique Characters
//        String s ="1123!@#$%^&*()";
//        HashSet<Character> hs = new HashSet<>();
//        for(Character ch:s.toCharArray()){
//            hs.add(ch);
//        }
//        if(hs.size()==s.length()){
//            System.out.println("True");
//        }else {
//            System.out.println("false");
//        }

        // Problem: Longest Consecutive Sequence
//      int arr [] = {100, 4, 200, 1, 3, 2};
//        HashSet<Integer> hs = new HashSet<>();
//        int x =0;
//        for(Integer num:arr){
//            hs.add(num);
//        }
//        for(int i=0;i<arr.length;i++){
//            int y = arr[i];
//            if(!hs.contains(y-1)){
//                int len =1;
//              while(hs.contains(y+1)){
//               len++;
//               y++;
//              }
//              x = Math.max(x,len);
//            }
//        }
//
//        System.out.println(x);

        // Problem: Find Common Elements in Three Sorted Arrays
//        arr1 = [1, 2, 3, 4, 5]
//        arr2 = [1, 2, 5, 7, 9]
//        arr3 = [1, 3, 4, 5, 8]               ans =[1,5]

//        int [] arr1 ={1, 2, 3, 4, 5};
//        int [] arr2 ={1, 2, 5, 7, 9};
//        int [] arr3 ={1, 3, 4, 5, 8};
//
//        Set<Integer> hs1 = new HashSet<>();
//        Set<Integer> hs2 = new HashSet<>();
//        Set<Integer> hs3 = new HashSet<>();
//        for(Integer num:arr1){
//            hs1.add(num);
//        }
//        for(Integer num:arr2){
//            hs2.add(num);
//        }
//        for(Integer num:arr3){
//            hs3.add(num);
//        }
//        List<Integer> ans = new ArrayList<>();
//        for(Integer num:hs1){
//            if(hs2.contains(num) && hs3.contains(num)){
//                ans.add(num);
//            }
//        }
//        System.out.println(ans);

        // Find the First Non-Repeating Character in a String
      // s = "aabbccdeeffg" ans :d
//        String s = "aabbccdeeffg";
//        Map<Character,Integer>hm = new HashMap<>();
//        char ch =' ';
//        for(int i=0;i<s.length();i++){
//            if(hm.containsKey(s.charAt(i))){
//                hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
//            }else{
//                hm.put(s.charAt(i),1);
//            }
//        }
//        for(int i=0; i<s.length();i++){
//            char c = s.charAt(i);
//           if(hm.get(c)==1){
//               ch=c;
//               break;
//           }
//        }
//        System.out.println(ch);


        // Group Anagrams Together
       String [] str ={"eat", "tea", "tan", "ate", "nat", "bat"};  // aet- eat,tea,ate, ant-tan,nat, abt -bat
       Map<String,List<String>> hm = new HashMap<>();
       List<List<String>>ans = new ArrayList<>();
       for(int i=0;i< str.length;i++){
           char [] arr = str[i].toCharArray();
           Arrays.sort(arr);
           String str1 = String.copyValueOf(arr);
           if(hm.containsKey(str1)){
               hm.get(str1).add(str[i]);
           }else{
               hm.put(str1,new ArrayList<>());
               hm.get(str1).add(str[i]);
           }
       }
       ans.addAll(hm.values());
       for(Map.Entry<String,List<String>> hm1:hm.entrySet()){
           String key = hm1.getKey();
           List<String> val = hm1.getValue();
           System.out.println(key);
           System.out.println(val);
       }
        System.out.println(ans);
    }
}
