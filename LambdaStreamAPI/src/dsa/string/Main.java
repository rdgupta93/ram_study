package dsa.string;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // String Banane ke Tarike

        //   A) String Literal se
        //   String str1 = "Hello";

        //B) new Keyword se
//        String str2 = new String("Hello");

//        3. Important String Methods
//        Method	Description
//        length() -> String ka length return karta hai
//        charAt(index) ->	Diye gaye index par dsa.character return karta hai
//        substring(start, end)	-> Substring return karta hai
//        concat(str)	-> Do strings ko jodta hai
//        replace(old, new)	-> Characters replace karta hai
//        toUpperCase()	-> Uppercase me convert karta hai
//        toLowerCase()	-> Lowercase me convert karta hai
//        trim()	-> Leading aur trailing spaces remove karta hai
//        equals(str)	-> Exact match check karta hai (case-sensitive)
//        equalsIgnoreCase(str)-> 	Case-insensitive match check karta hai

//        String str = " Java ";
//        System.out.println(str.trim()); // Output: "Java"

        // 5. StringBuffer & StringBuilder (Mutable Alternatives)

        //  A) StringBuffer (Thread-Safe)
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" Java");
//        System.out.println(sb);  // Output: Hello Java

//        B) StringBuilder (Faster, Non-Thread-Safe)
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" Java");
//        System.out.println(sb);  // Output: Hello Java

//        Common Methods of StringBuilder
//        Method	Description
//        append(String str)->	Adds the specified dsa.string at the end.
//        insert(int offset, String str)->	Inserts a dsa.string at the specified position.
//        replace(int start, int end, String str)->	Replaces characters between start and end with a new dsa.string.
//        delete(int start, int end)->	Deletes characters between start and end.
//        reverse()->	Reverses the characters in the StringBuilder.
//        length()->	Returns the number of characters in the StringBuilder.
//        capacity()->	Returns the current capacity of the StringBuilder.
//        charAt(int index)->	Returns the dsa.character at the specified index.
//        setCharAt(int index, char ch)->	Sets the dsa.character at the given index.

//        StringBuilder sb = new StringBuilder("Hello");
//
//        // Append
//        sb.append(" World");
//        System.out.println(sb); // Output: Hello World
//
//        // Insert
//        sb.insert(5, ",");
//        System.out.println(sb); // Output: Hello, World
//
//        // Replace
//        sb.replace(7, 12, "Java");
//        System.out.println(sb); // Output: Hello, Java
//
//        // Delete
//        sb.delete(5, 6);
//        System.out.println(sb); // Output: Hello Java
//
//        // Reverse
//        sb.reverse();
//        System.out.println(sb); // Output: avaJ olleH
//
//        // Length and Capacity
//        System.out.println("Length: " + sb.length()); // Output: 10
//        System.out.println("Capacity: " + sb.capacity()); // Default: 16 + initial dsa.string length


        //6. String Join & Split
//        A) Join
//        String joined = String.join(", ", "Java", "Python", "C++");
//        System.out.println(joined); // Output: Java, Python, C++
//        B) Split

//        String str = "Java,Python,C++";
//        String[] arr = str.split(",");
//        for(String s : arr) {
//            System.out.println(s);
//        }

//        7. String Formatting
//        String name = "John";
//        int age = 25;
//        String formatted = String.format("My name is %s and I am %d years old.", name, age);
//        System.out.println(formatted);
//// Output: My name is John and I am 25 years old.

//        8. String Reverse
//        String str = "Java";
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println(reversed);  // Output: avaJ


//        3. substring(start, end)
//        String str = "Programming";
//        System.out.println(str.substring(3, 7));

//        4. concat(str) - Do strings ko jodta hai
//        String s1 = "Hello";
//        String s2 = "World";
//        System.out.println(s1.concat(" ").concat(s2));

//        5. replace(old, new) - Characters replace karta hai
//        String str = "Java is fun";
//        System.out.println(str.replace("Java", "Python"));

//        6. toUpperCase() - Uppercase me convert karta hai
//        String str = "hello world";
//        System.out.println(str.toUpperCase());

//        7. toLowerCase() - Lowercase me convert karta hai
//        String str = "HELLO WORLD";
//        System.out.println(str.toLowerCase());

//        8. trim() - Leading aur trailing spaces remove karta hai
//        String str = "   Java Programming   ";
//        System.out.println(str.trim());

//        9. equals(str) - Exact match check karta hai (case-sensitive)
//        String s1 = "Hello";
//        String s2 = "hello";
//        System.out.println(s1.equals(s2));   // false;

//        10. equalsIgnoreCase(str) - Case-insensitive match check karta hai
//        String s1 = "Hello";
//        String s2 = "hello";
//        System.out.println(s1.equalsIgnoreCase(s2));

        //Check if a String is Palindrome - Given a dsa.string, check if it reads the same forward and backward.

        //Input: "madam"  --> True
        // Input:"Hello" --> false;

//        String str = "abcdefghihgfedcba";
//        char arr [] = str.toCharArray();
//        int s=0,e=arr.length-1;
//        while(s<e){
//            char temp =arr[s];
//            arr[s]=arr[e];
//            arr[e] = temp;
//            s++;
//            e--;
//        }
//       String str1 = String.valueOf(arr);
//        if(str1.equals(str)){
//            System.out.println("dsa.string is palindrome");
//        }else{
//            System.out.println("dsa.string is not palindrome");
//        }

        // Reverse a String - Given a dsa.string, return its reverse.
        // hello --> olleh
//        String str = "Hellyetwuushgageuijnjmnajoz";
//        char arr [] = str.toCharArray();
//        int s=0,e=arr.length-1;
//        while(s<e){
//            char temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;
//            s++;
//            e--;
//        }
//        System.out.println(String.valueOf(arr));

        // Check if Two Strings are Anagrams - Given two strings, check if one is a rearrangement of the other
        //   Two strings are anagrams if they contain the same characters in the same frequency but in a different order.
        //   str1 = "listen", str2 = "silent"  - True
//        String str1 = "listen", str2 = "silenp";
//        Map<Character,Integer> hm = new HashMap<>();
//        Map<Character,Integer> hm1 = new HashMap<>();
//        for(int i=0;i<str1.length();i++){
//          hm.put(str1.charAt(i),hm.getOrDefault(str1.charAt(i),0)+1);
//        }
//        for(int i=0;i<str2.length();i++){
//            hm1.put(str2.charAt(i),hm1.getOrDefault(str2.charAt(i),0)+1);
//        }
//        if(hm.equals(hm1)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

//        HashMap<Character,Integer> hm = new HashMap<>();
//        for(int i=0;i<str1.length();i++){
//            char c1 = str1.charAt(i);
//            char c2 = str2.charAt(i);
//            hm.put(c1,hm.getOrDefault(c1,0)+1);
//            hm.put(c2,hm.getOrDefault(c2,0)-1);
//        }
//        for(int count: hm.values()){
//            if(count!=0){
//                System.out.println("false");
//                return;
//            }
//        }
//        System.out.println("true;");

        // Find Duplicate Characters in a String
        //Input: "programming" - Output: { 'r': 2, 'g': 2, 'm': 2 }
        // We can do this using HashMap

/*
        // Count Vowels and Consonants
       //Note :- Remove spaces -
        String noSpaceStr = str.replaceAll("\\s", "");
        String str = "The original dsa.string remains unchanged";
        System.out.println(str.replaceAll("\\s",""));

       String str = "The original dsa.string remains unchanged";
      str= str.replaceAll("\\s","");
       char ch [] = str.toCharArray();
       int countV =0,countC=0;
       for(int i=0;i<ch.length;i++){
           if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U' ){
               countV++;
           }else{
               countC++;
           }
       }
        System.out.println("Vowel count "+countV +" "+"Consonant count "+countC);
 */

        /*
     // Check if a String Contains Only Digits - Given a dsa.string, check if it consists only of numeric characters
     // Input: "12345" - true
        //Input: "12a45" - false;
       String str ="12345";
       char arr[] = str.toCharArray();
       for(int i=0;i<arr.length;i++){
           if(arr[i]=='0' ||arr[i]=='1'||arr[i]=='2'||arr[i]=='3'||arr[i]=='4'||arr[i]=='5'||arr[i]=='6'||arr[i]=='7'||arr[i]=='8'||arr[i]=='9'){
               continue;
           }else{
               System.out.println("false");
               return;

           }
       }
        System.out.println("true");

       for(int i=0;i<arr.length;i++){
           if(arr[i]<'0' || arr[i]>'9'){
               System.out.println(false);
               return;
           }
       }
        System.out.println("true");

         */

        /*
        //Find the First Non-Repeating Character - Given a dsa.string, find the first dsa.character that appears only once.
       // input:-swiss ans=w
        // input:aabbcc ans =-1;
        String str ="aabdbccde";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i =0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hm.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("-1");

       int freq[] = new int[256];
       for(int i=0;i<str.length();i++){
           freq[str.charAt(i)]++;
       }

       for(int i=0;i<str.length();i++){
           if(freq[str.charAt(i)]==1){
               System.out.println(str.charAt(i));
               return;
           }
       }
        System.out.println("-1");
         */
   /*
        // Remove Duplicates from a String
        // Input: "programming" ans = "progamin"
        String str = "programming";
        Set<Character> hs = new LinkedHashSet<>();
        for(Character ch:str.toCharArray()){
            hs.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch:hs){
            sb.append(ch);
        }
        System.out.println(String.valueOf(sb));

    */
/*
    // Check if a String is a Rotation of Another String - Given two strings, check if one is a rotation of the other
    // Input: "abcde", "cdeab"   ans:true
    // Input: "hello", "ollhe"   ans:false

    String str1=  "abcde", str2="cdeab" ;
    String str3 = str1+str1;
    boolean check = str3.contains(str2);
    if(check){
        System.out.println("true");
        return;
    }
        System.out.println("false");
 */

     /*
        //Longest Common Prefix
        // Input: ["flower", "flow", "flight"]   ans = "fl"
        //Input: ["dog", "racecar", "car"] ans =""
        String str [] ={"flower", "flow", "flight", "flour", "flame", "flash", "flock", "fluent", "flip"};
        Arrays.sort(str);
//        Arrays.asList(str).forEach(System.out::println);
        char [] ch1 = str[0].toCharArray();
        char [] ch2 = str[str.length-1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<Math.min(ch1.length, ch2.length);i++){
            if(ch1[i]!=ch2[i]){
                break;
            }
            sb.append(ch1[i]);
        }
        System.out.println(sb.toString());

      */
       /*
        // Find the Most Frequent Character in a String - Given a dsa.string, find the most occurring dsa.character
        // input:"hello world" ans: l-3
        String str = "hello worldoo";
        HashMap<Character,Integer>hm = new HashMap<>();
        char arr [] = str.replaceAll("\\s","").toCharArray();
        for(char ch:str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int val =0;
        char ch=arr[0];
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])>val){
                val = hm.get(arr[i]);
                ch = arr[i];
            }
        }
        System.out.println(ch);

        */

        //Check if Two Strings are Permutations of Each Other
//        str1 = "listen"   --> True
//        str2 = "silent"
        // sol - create hm1 & hm2 and if contains same key and freq in both then hm1.equals(hm2) true
        // use one hm and increase & decrease the freq simultaneously


/*
        // Check if a String Contains All Characters of Another String - Given two strings, check if all characters of one are present in the other.
      //Given two strings, s1 and s2, determine whether all characters of s2 are present in s1, regardless of order and frequency
       // s1 = "abcdefg"
        //s2 = "bca"   - true;

        String s1= "hello", s2="lloo";
        Map<Character,Integer>hm = new HashMap<>();
        for(char ch :s1.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:s2.toCharArray()){
            if(!hm.containsKey(ch) || hm.get(ch)==0){
                System.out.println("false");
                return;
            }
            hm.put(ch,hm.get(ch)-1);
        }
        System.out.println("true");
 */

        /*
        //Remove All Adjacent Duplicates in a String     TLE USE STACK
        //Input: "abbaca"
        //Output: "ca"
        String str = "abbaca";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(sb.length()>0 && str.charAt(i)==sb.charAt(sb.length()-1)){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);

         */

       /*
        // Remove vowel from dsa.string   - Use two pointer
        //input:- leetcode  ans : ltcd;
        String str = "leetcodeASDERW";
        String vowels ="aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(!vowels.contains(String.valueOf(ch))){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

        */

        /*
        //Problem Brief: Find the Longest Substring with K Unique Characters
        //Input: "aabacbebebe", K = 3
        // Output: "cbebebe"

        String str = "aabacbebebe";//n =11
        int n = str.length();
        int k = 3;
        Map<Character, Integer> hm = new HashMap<>();
        int s = 0, y = 0;
        int maxLength = 0;
        String maxSubstring = "";

        while (y < n) {

            char ch = str.charAt(y);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            while (hm.size() > k) {
                hm.put(str.charAt(s), hm.getOrDefault(str.charAt(s), 0) - 1);
                if (hm.get(str.charAt(s)) == 0) {
                    hm.remove(str.charAt(s));
                }
                s++;
            }
            int length = y - s + 1;
            if (length > maxLength) {
                maxLength = length;
                maxSubstring = str.substring(s, y + 1);
            }

            y++;
        }

        System.out.println(maxSubstring + " " + maxLength);


         */

        /*
        //Find All Possible Substrings of a String - Generate all substrings of a given dsa.string.
       //String str ="abc"

        String str = "abc";
        List<String>subStr = new ArrayList<>();
        for(int s=0;s<str.length();s++){
            for(int e=s;e<str.length();e++){
                subStr.add(str.substring(s,e+1));
            }
        }

        System.out.println(subStr);

         */

        //Check if a String Follows a Given Pattern - Given a pattern and a dsa.string, check if the dsa.string follows the pattern.
       //Pattern = "abba"
        //String = "dog cat cat dog"  ans : true
          String pattern ="abba",str ="dog cat cat dog";
        Map<Character,String>hm = new HashMap<>();


    }
}
