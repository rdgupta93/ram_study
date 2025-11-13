package map;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Main {
//    public static boolean checkAnagram(String s1,String p1){
//        char ch [] = s1.toCharArray();
//        Arrays.sort(ch);
//        String s2 = String.valueOf(ch);
//        return p1.equals(s2);
//    }

    public static void main(String[] args) {
//        Stores key-value pairs (Each key maps to a specific value).
//        Keys are unique (Duplicate keys are not allowed).
//        Efficient retrieval of values using keys.
//        Supports different implementations like HashMap, TreeMap, and LinkedHashMap.

 //       HashMap
//        HashMap<Integer,String> hm = new HashMap<>();
//        hm.put(1,"Java");
//        hm.put(2,"SpringBoot");
//        hm.put(3,"Hibernates");
//        System.out.println(hm);
//
//        for(Map.Entry<Integer,String>hm1:hm.entrySet()){
//            int key = hm1.getKey();
//            String value = hm1.getValue();
//            System.out.println("Key is: "+key+" "+"Value is: "+value);
//        }

        // LinkedHashMap	- Insertion order, Slightly slower than HashMap,

//        Map<Integer, String> linkedMap = new LinkedHashMap<>();
//        linkedMap.put(1, "Java");
//        linkedMap.put(2, "Spring Boot");
//        linkedMap.put(3, "Hibernate");
//
//        System.out.println(linkedMap);
// Output: {1=Java, 2=Spring Boot, 3=Hibernate}

        // Tree Map :-
        // TreeMap	Sorted order (based on natural ordering or comparator)	O(log N)	When sorting keys is required

//        Map<Integer, String> treeMap = new TreeMap<>();
//        treeMap.put(3, "Hibernate");
//        treeMap.put(1, "Java");
//        treeMap.put(2, "Spring Boot");
//
//        System.out.println(treeMap);

//        Easy Level
//        Two Sum – Find two numbers in an array that add up to a given target.
//        Find First Non-Repeating Character – Given a string, find the first non-repeating character.
//        Majority Element – Find the element that appears more than n/2 times in an array.
//        Count Frequency of Elements – Count the occurrences of each element in an array.
//        Intersection of Two Arrays – Find the common elements between two arrays.
//        Isomorphic Strings – Check if two strings can be transformed into each other by replacing characters.
//        Find Duplicates in an Array – Identify duplicate elements in an array.
//        Group Anagrams – Group words that are anagrams of each other.

//        Medium Level
//        Subarray Sum Equals K – Find the number of subarrays that sum to K.
//        Longest Consecutive Sequence – Find the length of the longest consecutive elements sequence.
//        Find All Anagrams in a String – Find all substrings that are anagrams of a given word.
//        Longest Substring Without Repeating Characters – Find the longest substring with unique characters.
//        Pairs with Given XOR – Find all pairs in an array with a given XOR value.
//        Ransom Note – Check if a note can be formed using letters from a magazine.
//        Smallest Window Containing All Characters – Find the smallest substring containing all characters of another string.

//        Hard Level
//        Number of Subarrays with XOR K – Count subarrays that have a given XOR value.
//        LRU Cache Implementation – Implement an LRU (Least Recently Used) cache using HashMap and LinkedList.
//        Substring with Concatenation of All Words – Find all substrings that contain all given words in any order.
//        4Sum Problem – Find four numbers in an array that sum up to a target value.
//        Longest Palindromic Subsequence – Find the longest subsequence that forms a palindrome.

// Output: {1=Java, 2=Spring Boot, 3=Hibernate} (sorted by key)

        //first non-repeating character
//        String str = "aabb"; // l-1,e-3,t-1,c-1,o-1,d-1
//        HashMap<Character,Integer> hm2 = new HashMap<>();
//        char [] ch = str.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(hm2.containsKey(ch[i])){
//                int f = hm2.get(ch[i]);
//                hm2.put((ch[i]),f+1);
//            }else{
//                hm2.put(ch[i],1);
//            }
//        }
//        int ans =-1;
//        for(int i=0;i<ch.length;i++){
//           if(hm2.get(ch[i])==1){
//               ans =i;
//               break;
//           }
//        }
//
//        System.out.println(ans);
        // Find the element that appears more than n/2 times in an array
//        int [] arr = {3, 2, 3};
//        HashMap<Integer,Integer> hm3 = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(hm3.containsKey(arr[i])){
//                hm3.put(arr[i], hm3.get(arr[i])+1);
//            }else{
//                hm3.put(arr[i],1);
//            }
//        }
//
//        for(int i=0;i<arr.length;i++){
//            if(hm3.get(arr[i])*2>arr.length){
//                System.out.println(arr[i]);
//                break;
//            }
//        }

        // Intersection of Two Arrays
//        int arr1 []= {4, 9, 5}; // 1-2,2-2
//        int arr2 [] = {9, 4, 9, 8, 4}; //2-2    // ans {2}
//        Set<Integer> hs1 = new HashSet<>();
//        Set<Integer>hs2 = new HashSet<>();
//        for(int hs:arr1){
//            hs1.add(hs);
//        }
//        for(int hs:arr2){
//            hs2.add(hs);
//        }
//
//        List<Integer>list = new ArrayList<>();
//        for(int al:hs1){
//            int val = al;
//            if(hs2.contains(val)){
//                list.add(val);
//            }
//        }
//
//        System.out.println(list);

        // Isomorphic Strings- Two strings, s and t, are called isomorphic if the characters in s can be replaced to get t
//        Input: s = "egg", t = "add"  e-1,g-2  a-1,d-2
//        Output: true     s=paper, t =title  p-2,a-1,e-1,r-1  t-2,i-1,l-1,e-1
//        Explanation: 'e' → 'a', 'g' → 'd'    // hashet - paer , tile
//        String s ="foo",t="bar";
//        HashMap<Character,Integer> hm1= new HashMap<>();
//        HashMap<Character,Integer>hm2 = new HashMap<>();
//        for(int i =0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(hm1.containsKey(ch)){
//                hm1.put(ch,hm1.get(ch)+1);
//            }else{
//                hm1.put(ch,1);
//            }
//        }
//        for(int i=0;i<t.length();i++){
//            char ch = t.charAt(i);
//            if(hm2.containsKey(ch)){
//                hm2.put(ch,hm2.get(ch)+1);
//            }else{
//                hm2.put(ch,1);
//            }
//        }
//       for(int i=0;i<s.length();i++){
//           int f =hm1.get(s.charAt(i));
//           int f1 = hm2.get(t.charAt(i));
//           if(f!=f1){
//               System.out.println("false");
//               break;
//           }
//       }
//        System.out.println("true");

        // find the duplicate in array
//        int arr[] ={1, 1, 2, 2, 3, 3, 4, 4,4};
//        HashMap<Integer,Integer> hm3 = new HashMap<>();
//        for(int i=0;i< arr.length;i++){
//            if(hm3.containsKey(arr[i])){
//                hm3.put(arr[i],hm3.get(arr[i])+1);
//            }else{
//                hm3.put(arr[i],1);
//            }
//        }
//        List<Integer>al = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(hm3.get(arr[i])>1){
//                hm3.put(arr[i],hm3.get(arr[i])-1);
//                al.add(arr[i]);
//            }
//        }
//        for(int key :hm3.keySet()){
//            if(hm3.get(key)>1){
//                al.add(key);
//            }
//        }
//
//        System.out.println(al);

//        //Problem: Group Anagrams
//        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        // {aet-{eat,tea,ate},ant-{tan,nat}, abt-{bat}}
//        List<List<String>>ans = new ArrayList<>();
//       // Arrays.asList(str).forEach(System.out::println);
//        HashMap<String,List<String>> hm = new HashMap();
//        for(int i=0;i< str.length;i++){
//          //  String str1=str[i];
//        char [] arr = str[i].toCharArray();
//        Arrays.sort(arr);
//         String str1 = String.valueOf(arr);
//         if(hm.containsKey(str1)){
//           hm.get(str1).add(str[i]);
//         }else{
//             hm.put(str1,new ArrayList<>());
//             hm.get(str1).add(str[i]);
//         }
//
//        }
//       ans.addAll(hm.values());
//        System.out.println(ans);
//
//        for(Map.Entry<String,List<String>>hm1: hm.entrySet()){
//            String sr = hm1.getKey();
//            System.out.println(sr);
//            List<String>al = hm1.getValue();
//            System.out.println(al);
//        }

//        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        HashMap<String,List<String>> hm = new HashMap<>();
//        List<List<String>>al = new ArrayList<>();
//        for(int i=0;i< str.length;i++){
//            char arr[] = str[i].toCharArray();
//            Arrays.sort(arr);
//            String str1 = String.valueOf(arr);
//            if(hm.containsKey(str1)){
//                hm.get(str1).add(str[i]);
//            }else{
//                hm.put(str1,new ArrayList<>());
//                hm.get(str1).add(str[i]);
//            }
//        }
//        al.addAll(hm.values());
//        System.out.println(al);

        // Problem: Longest Consecutive Sequence
      //  Input: nums = [100, 4, 200, 1, 3, 2]
      //  Output: 4    1,2,3,4

//        int arr [] ={9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
//        HashSet<Integer>hs = new HashSet<>();
//        for(int num:arr){
//            hs.add(num);
//        }
//        int maxLength =0;
//     for(int x: hs){
//         if(!hs.contains(x-1)){
//             int len =1;
//           while(hs.contains(x+1)){
//               len++;
//               x++;
//           }
//             maxLength = Math.max(len,maxLength);
//         }
//     }
//
//        System.out.println(maxLength);

        //Problem: Find All Anagrams in a String
       //Given two strings s (a larger text) and p (a smaller pattern), find all starting indices of substrings in s that are anagrams of p.
      // Constraints:
    //    The order of characters in the anagram does not matter.
    //    The length of p is always smaller than or equal to s.
      //  Return a list of indices where anagrams of p start in s.
//
//        Input:  s = "cbaebabacd", p = "abc"
//        Output: [0, 6]
//        Explanation:
//        - "cba" (starting at index 0) is an anagram of "abc".
//                - "bac" (starting at index 6) is an anagram of "abc".

//        String s = "abab";
//        String p ="ab";
//        int n = p.length();
//        char arr[] = p.toCharArray();
//        List<Integer>ans = new ArrayList<>();
//        Arrays.sort(arr);
//        String p1=String.valueOf(arr);
//        for(int i=0;i<=s.length()-n;i++){
//            String subStr = s.substring(i,i+n);
//          boolean t=  checkAnagram(subStr,p1);
//          if(t==true){
//              ans.add(i);
//          }
//        }
//        System.out.println(ans);

//        String s = "abcabcdcba";
//        String p ="abc";
//        int n = p.length();
//        List<Integer>ans = new ArrayList<>();
//        HashMap<Character,Integer> hm1 = new HashMap<>();
//        for(Character ch:p.toCharArray()){
//            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
//        }
//
//        HashMap<Character,Integer>hm2 = new HashMap<>();
//        for(int i=0;i<n;i++){
//          if(hm2.containsKey(s.charAt(i))){
//              hm2.put(s.charAt(i),hm2.get(s.charAt(i))+1);
//          }else{
//              hm2.put(s.charAt(i),1);
//          }
//        }
//        if(hm1.equals(hm2)){
//            ans.add(0);
//        }
//        int x=1;
//        int y = n;
//        while(y<s.length()){
//            if(hm2.get(s.charAt(x-1))==1){
//                hm2.remove(s.charAt(x-1));
//            }else{
//                hm2.put(s.charAt(x-1),hm2.get(s.charAt(x-1))-1);
//            }
//        hm2.put(s.charAt(y),hm2.getOrDefault(s.charAt(y),0)+1);
//         if(hm2.equals(hm1)){
//             ans.add(x);
//         }
//         x++;
//         y++;
//        }
//        System.out.println(ans);

        // Longest Substring Without Repeating Characters
        // s = "abcabcbb"  ans =3

//        String s ="abcdfgabcbbhgtredsawqxczv";
//        int n = s.length();
//        HashSet<Character> hs = new HashSet<>();
//        int i=0;
//        int length =0;
//        for(int j =0;j<n;j++){
//            if(!hs.contains(s.charAt(j))) {
//                hs.add(s.charAt(j));
//                length = Math.max(length, hs.size());
//            }else{
//                hs.remove(s.charAt(i));
//                i++;
//            }
//        }
//
//        System.out.println(length);

        //Ransom Note Problem Statement
//        You are given two strings:
//
//        ransomNote – The text you need to construct.
//        magazine – The text that provides available letters.
     //   Determine if the ransomNote can be constructed using letters from the magazine. Each letter in the magazine can be used only once.

//       String ransomNote = "aa";
//      String magazine = "aab";
//      HashMap<Character,Integer>hm1 = new HashMap<>();
//      HashMap<Character,Integer>hm2 = new HashMap<>();
//      for(int i=0;i<ransomNote.length();i++){
//          hm1.put(ransomNote.charAt(i),hm1.getOrDefault(ransomNote.charAt(i),0)+1);
//      }
//
//        for(int i=0;i<magazine.length();i++){
//            hm1.put(magazine.charAt(i),hm1.getOrDefault(magazine.charAt(i),0)+1);
//        }
     /*
        Problem: Smallest Window Containing All Characters
        s = "ADOBECODEBANC", t = "ABC"     ans ="BANC"
        String s = "ADOBECODEBANC";
        String t ="ABC";
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>hm1= new HashMap<>();
        int l =0;
        int r=0;
        while(r<s.length()){

        }

      */

      /*
        // Check the subarray exists in arr where sum is equal to k
        //You are given an integer array arr and an integer K. Your task is to determine whether there exists at
        //least one contiguous subarray whose sum is exactly equal to K.
        // arr = [1, 4, 2, 3, -2, 5]
        //K = 7        true   4 2 3 -2     And 1 4 2

//        int [] arr ={1, 4, 2, 3, -2, 5};
        int [] arr ={1, 2, 3, 4, 5};
        int k =20;
         int sum =0;
         Set<Integer> hs = new HashSet<>();
         hs.add(0);
         for(int i=0;i< arr.length;i++){
             sum = sum +arr[i];
             if(hs.contains(sum-k)){
                 System.out.println(true);
                 return;
             }else{
                 hs.add(sum);
             }
         }
        System.out.println(false);
       */


     /*
        // Subarray Sum Equals K \– Find the number of subarrays that sum to K.
        //You are given an integer array arr and an integer K. Your task is to find the number of
        // contiguous subarrays whose sum is exactly equal to K
        //arr = [1, 2, 3, -3, 1, 2, 1, 4, 2]
        //K = 3    ans = 5    [1, 2],[3],[3, -3, 1, 2],[1, 2],[3]

       int arr [] ={1, -1, 0, 1, 1};
       int k = 1;
       Map<Long,Integer> hm = new HashMap<>();
       int count =0;
       long sum =0;
       hm.put(0L,1);
       for(int i=0;i< arr.length;i++){
       sum=sum+arr[i];
         if(hm.containsKey(sum-k)){
             count = count+ hm.get(sum-k);
         }
         if(hm.containsKey(sum)){
             hm.put(sum,hm.get(sum)+1);
         }else{
             hm.put(sum,1);
         }
       }

        System.out.println(count);


      */

    }

}
