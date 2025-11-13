package dsa.map;

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
        // TreeMap	Sorted order (based on natural ordering or comparator)	O(log N)	When dsa.sorting keys is required

//        Map<Integer, String> treeMap = new TreeMap<>();
//        treeMap.put(3, "Hibernate");
//        treeMap.put(1, "Java");
//        treeMap.put(2, "Spring Boot");
//
//        System.out.println(treeMap);

//        Easy Level
//        Two Sum – Find two numbers in an array that add up to a given target.
//        Find First Non-Repeating Character – Given a dsa.string, find the first non-repeating dsa.character.
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
//        Smallest Window Containing All Characters – Find the smallest substring containing all characters of another dsa.string.

//        Hard Level
//        Number of Subarrays with XOR K – Count subarrays that have a given XOR value.
//        LRU Cache Implementation – Implement an LRU (Least Recently Used) cache using HashMap and LinkedList.
//        Substring with Concatenation of All Words – Find all substrings that contain all given words in any order.
//        4Sum Problem – Find four numbers in an array that sum up to a target value.
//        Longest Palindromic Subsequence – Find the longest subsequence that forms a palindrome.

// Output: {1=Java, 2=Spring Boot, 3=Hibernate} (sorted by key)

        //first non-repeating dsa.character
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

        //Problem: Smallest Window Containing All Characters
       // s = "ADOBECODEBANC", t = "ABC"     ans ="BANC"
//        String s = "ADOBECODEBANC";
//        String t ="ABC";
//        HashMap<Character,Integer>hm = new HashMap<>();
//        for(int i=0;i<t.length();i++){
//            char ch = t.charAt(i);
//            hm.put(ch,hm.getOrDefault(ch,0)+1);
//        }
//        HashMap<Character,Integer>hm1= new HashMap<>();
//        int l =0;
//        int r=0;
//        while(r<s.length()){
//
//        }

    /*
        //Given an array A that represents the participants of various contests, where each integer corresponds to a specific learner,
        // and an array B containing the learners for whom you want to check participation frequency, your task is to find the frequency
        // of each learner from array B in the array A and return a list containing all these frequencies

        int A[] = {2, 5, 9, 2, 8};
        int [] B = {3, 2};
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int num:A){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
       int ans [] = new int [B.length];
        int i=0;
        for(int num:B){
            ans[i] = hm.getOrDefault(num,0);
            i++;
        }

        System.out.println(Arrays.toString(ans));

     */

        /*
        //Count distinct elements
        //Problem Constraints --> 1 <= N <= 105   && 1 <= A[i] <= 109
        // input - A = [3, 4, 3, 6, 6]  ans = 3

        int arr [] ={3, 3, 3, 9, 0, 1, 0};
        Set<Integer> hs = new HashSet<>();
        for(int num :arr){
            hs.add(num);
        }
        System.out.println("Unique Element is : "+hs.size());

         */

    /*
        // First Repeating element
        //Given an integer array A of size N, find the first repeating element in it.
        //We need to find the element that occurs more than once and whose index of the
        //first occurrence is the smallest.
        //If there is no repeating element, return -1.

        //Problem Constraints -1 <= N <= 105 && 1 <= A[i] <= 109
        // input A = [10, 5, 3, 4, 3, 5, 6]  ans =5
        // input A= [6, 10, 5, 4, 9, 120]  ans = -1

        int arr [] = {10, 5, 3, 4, 3, 5, 6};
        Map<Integer,Integer> hm = new HashMap<>();
        int index = arr.length;
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(hm.containsKey(num)){
                if(index >hm.get(num)){
                    index = hm.get(num);
                    ans = num;
                }
            }
            else{
                hm.put(num,i);
            }

        }
        System.out.println(ans);

     */

    /*
     //  Sub-array with 0 sum
     // Given an array of integers A, find and return whether the given array contains a non-empty
     //subarray with a sum equal to 0.
     // If the given array contains a sub-array with sum zero return 1, else return 0

     // Problem Constraints - 1 <= |A| <= 100000  && -10^9 <= A[i] <= 10^9
     // input :- A = [1, 2, 3, 4, 5]  ans =0;
     // input: A =[4,-1,1] ans =1
     int arr [] = {4,-1,1};
     Set<Integer> hs = new HashSet<>();
     hs.add(0);
     int prefixSum [] = new int[arr.length];
     prefixSum[0] = arr[0];
     for(int i=1;i<arr.length;i++){
         prefixSum[i] = prefixSum[i-1]+arr[i];
     }
     for(int num:prefixSum){
         if(hs.contains(num)){
             System.out.println(1);
             return;
         }else{
             hs.add(num);
         }
     }
        System.out.println(0);

     */

    /*
    //  Count unique elements
    //You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
    //Problem Constraints -> 1 <= N <= 105  && 1 <= A[i] <= 109

    // A = [3, 4, 3, 6, 6]  ans = 1

         int arr  [] = {3, 3, 3, 9, 0, 1, 0};
         int count =0;
         Map<Integer,Integer>hm = new HashMap<>();
         for(int num:arr){
             hm.put(num,hm.getOrDefault(num,0)+1);
         }
        for(int num:arr){
            if(hm.get(num)==1){
                count++;
            }
        }

        System.out.println(count);
     */

     /*
     // Q2. Common Elements
     // Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common
        // elements in both the array.
     // Note - Each element in the result should appear as many times as it appears in both arrays.
     //The result can be in any order.
        // Problem Constraints-1 <= N, M <= 105 && 1 <= A[i] <= 109
      // A = [1, 2, 2, 1]
        // B = [2, 3, 1, 2]   ans -[1,2,2]

        int arr1 [] = {2, 1, 4, 10};
        int arr2 [] ={3, 6, 2, 10, 10};

        Map<Integer,Integer>hm = new HashMap<>();
        for(int num:arr1){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
       List<Integer>al = new ArrayList<>();
        for(int num:arr2){
            if(hm.containsKey(num)){
                al.add(num);
                hm.put(num,hm.get(num)-1);
                if(hm.get(num)==0){
                    hm.remove(num);
                }
            }
        }

        System.out.println(al);

      */

        /*
        // Longest Subarray Zero Sum
        // Given an array A of N integers.
        //Find the length of the longest subarray in the array which sums to zero.
        // If there is no subarray which sums to zero then return 0.

        // Problem Constraints - 1 <= N <= 105 && -109 <= A[i] <= 109
        // input -  A = [1, -2, 1, 2] - ans = 3   sub array - {1,-2,1}
        // A = [3, 2, -1] - ans =0
        // and also print the sub array
        int arr [] = {1, -2, 1, 2, 3, 4, 1, -8};
        // sum      = 1  -1  0  2  5  9  10  2
        int n = arr.length;
        Map<Long,Integer>hm = new HashMap<>();
        long a =0;
        hm.put(0L,-1);
        List<Integer> al = new ArrayList<>();
        int length =0;
        for(int i=0;i<n;i++){
            a = a +arr[i];
            // target = a
            if(hm.containsKey(a)){
              int curLength = i-hm.get(a);
              if(curLength>length){
                  length =curLength;
                  al.clear();
                  for(int j =0;j<i-hm.get(a);j++){
                      int val = arr[hm.get(a)]+1+j;
                      al.add(val);
                  }
              }

            }else{
                hm.put(a,i);
            }
        }

        System.out.println(length);

         */
    /*
        //Check Pair Sum   --> Given an Array of integers B, and a target sum A.
        // Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.

        //Problem Constraints - 1 <= Length of array B <= 105 && 0 <= Bi <= 109 && 0 <= A <= 109
        // Input 1: A = 8 && B = [3, 5, 1, 2, 1, 2]  true  - 3+5 =8

        int arr [] = {9, 10, 7, 10, 9, 1, 5, 1, 5};
        //B-arr[i]    5  3(true)
        int B = 21;
        // arr[i]+arr[j] = B --> arr[i] = B- arr[j];

        Set<Integer> hs = new HashSet<>();
        for(int i=0;i< arr.length;i++){
            if(hs.contains(B-arr[i])){
                System.out.println("True");
                return;
            }else{
                hs.add(arr[i]);
            }
        }
        System.out.println("false");

     */

      /*
        //Count Pair Sum
        //You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.
        // Since the answer can be very large, return the remainder after dividing the count with 109+7.
        //Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
        // Problem Constraints - 1 <= N <= 105 && 1 <= A[i] <= 109  && 1 <= B <= 109

        // A = [3, 5, 1, 2] B =8  pair 1
        // A = [1, 2, 1, 2]  B =3   3 pair

        int arr [] = {1,2,1,2};
        int B = 3;

        Map<Integer,Integer> hm = new HashMap<>();
        int count =0;
        for(int i =0;i< arr.length;i++){
            if(hm.containsKey(B-arr[i])){
                count = count+hm.get(B-arr[i]);
            }
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }

        System.out.println(count);

       */
     /*
        // Pair With Given Difference --> a-b = k  && a+b=k
        //Given an one-dimensional unsorted array A containing N integers.
        // You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.
        //Return 1 if any such pair exists else return 0
        //Problem Constraints:1 <= N <= 105,  -103 <= A[i] <= 103, -105 <= B <= 105
        // Input :  A = [5, 10, 3, 2, 50, 80]   B=78    true 80-2
        // Input :  A = [-10, 20]  B = 30   true (20,-10) --> 20-(-10) = 30  true

        int arr[] = {5, 10, 3, 2, 50, 80};
        int B = 78;

        Set<Integer>hs = new HashSet<>();
        for(int i=0;i< arr.length;i++){
            if(hs.contains(arr[i]-B)|| hs.contains(arr[i]+B)){
                System.out.println("True");
                return;
            }else{
                hs.add(arr[i]);
            }
        }
        System.out.println("false");

      */

   /*
   // Count Pair Difference
        //You are given an array A of N integers and an integer B.
        //Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
        // Since the answer can be very large, return the remainder after dividing the count with 109+7.
        // Problem Constraints - 1 <= N <= 105 && 1 <= A[i] <= 109 && 1 <= B <= 109

      //  Input 1:A = [3, 5, 1, 2] && B = 4  Ans - 1 pair ->[5,1]
      //Input 2: A = [1, 2, 1, 2]  && B = 1 Ans - 4  pair {1,2 , 1,2,  2,1  1,2}

        int arr[] = {1, 2, 1, 2};
        int B =1;
        Map<Integer,Integer>hm = new HashMap<>();
        int count =0;

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i]-B)){
                count = count + hm.get(arr[i]-B);
            }
            if(hm.containsKey(arr[i]+B)){
                count = count+hm.get(arr[i]+B);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(count);

    */

  /*
    //Shaggy and distances
    //Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array a special if elements at those indices in the array are equal.
    //Shaggy wants you to find a special pair such that the distance between that pair is minimum. Distance between two indices is defined as |i-j|. If there is no special pair in the array, then return -1.
     //Problem Constraints  1 <= |A| <= 105
        //A = [7, 1, 3, 4, 1, 7]  1 & 7 repeating  ans =3  4-1 =3  for 7  6-0 =6

        int arr []={7, 1, 3, 4, 1, 7};
        HashMap<Integer,Integer>hm = new HashMap<>();
        int length = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int curLength = i-hm.get(arr[i]);
                length = Math.min(curLength,length);
            }else{
                hm.put(arr[i],i);
            }

        }

        if(length==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        System.out.println(length);

   */


    //Subarray Sum Equals K
        //Given an array of integers A and an integer B.
        //Find the total number of subarrays having sum equals to B.
        // Problem Constraints - 1 <= length of the array <= 50000 && -1000 <= A[i] <= 1000
        // A = [1, 0, 1] && B = 1  ans = 4

//        int arr [] ={0,0,0};
//        int B =0;
//        Map<Integer,Integer>hm = new HashMap<>();
//        hm.put(0,1);
//        int count =0;
//        int sum =0;
//        for(int i=0;i<arr.length;i++){
//            sum = sum +arr[i];
//            if(hm.containsKey(sum-B)){
//                count = count +hm.get(sum-B);
//            }
//            hm.put(sum,hm.getOrDefault(sum,0)+1);
//        }
//        System.out.println(count);

     /*
        //Distinct Numbers in Window
        //You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
        //Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
        //NOTE: if B > N, return an empty array

        //Problem Constraints - 1 <= N <= 106  && 1 <= A[i] <= 109

        //A = [1, 2, 1, 3, 4, 3] && B = 3 ans = [2, 3, 3, 2]

        int A [] ={1, 1, 2, 2};
        int B = 1;
        int ans [] = new int[A.length-B+1];
        if(B>A.length){
            System.out.println(ans);
        }
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<B;i++){
           hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        ans[0]=hm.size();
        int s=1,e=B;
        while(e<A.length){
            if(hm.containsKey(A[s-1])){
               // int val = hm.get(A[s-1]);
              //  hm.put(A[s-1],val-1);
                hm.put(A[s-1],hm.getOrDefault(A[s-1],0)-1);
                if(hm.get(A[s-1])==0){
                    hm.remove(A[s-1]);
                }
            }
            hm.put(A[e],hm.getOrDefault(A[e],0)+1);
            ans[s]=hm.size();
            s++;
            e++;
        }
        for(int num:ans) {
            System.out.println(num);
        }

      */

        /*
       // Unique 2D points
       //Given a 2D array A of integer points on a 2D plane. Find and return the number of unique points in the array.
       //The ith point in the array is (A[i][0], A[i][1])
        //Problem Constraints - 1 <= len(A) <= 105 && -109 <= A[i][0], A[i][1] <= 109
        //A = [[5, 6],
        //     [2, 8],
        //     [-1, -1],
        //     [2, -3],
        //     [2, 8],
        //     [7, 7],
        //     [2, -3]]    ans = 5

        int A [][] = {{5, 6},
                {2, 8},
                {-1, -1},
                {2, -3},
                {2, 8},
                {7, 7},
                {2, -3}};

        int n = A.length;
        Set<String>hs = new HashSet<>();
        for(int i=0;i<n;i++){
            int x = A[i][0];
            int y =A[i][1];
            String str = x+"$"+y;
            hs.add(str);
        }
        System.out.println(hs);

         */


     //Longest Consecutive Sequence
     //Given an unsorted integer array A of size N.
        //Find the length of the longest dsa.set of consecutive elements from array A.
      //Problem Constraints - 1 <= N <= 106  && -106 <= A[i] <= 106
        // input - A = [100, 4, 200, 1, 3, 2]  ans =4;

        int A [] ={100, 4, 200, 1, 3, 2,5,7,6};
        Set<Integer>hs = new HashSet<>();
        for(int num:A){
            hs.add(num);
        }
       int maxLength=0;
        for(int i=0;i<A.length;i++){
            int length =0;
            if(hs.contains(A[i]-1)){
                continue;
            }else{
                while(hs.contains(A[i])){
                    length++;
                    A[i]=A[i]+1;
                }
            }
            maxLength = Math.max(maxLength,length);
        }

        System.out.println(maxLength);
    }

}
