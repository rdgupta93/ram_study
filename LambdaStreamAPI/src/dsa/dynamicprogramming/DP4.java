package dsa.dynamicprogramming;

public class DP4 {
    static int maxLength=0;
    public static void main(String[] args) {
        /*
        1) Longest common subsequence
        2) Edit distance
        3) Regex Matching

        // Other related problem
        1. Print LCS (not just length)
        2. LCS using only DP (Bottom-Up)
        3. Longest Common Substring
        4. Longest Palindromic Subsequence (LPS)
        5. Minimum number of deletions to make string palindrome
        6. Shortest Common Supersequence (SCS)
        7. Edit Distance / Levenshtein Distance
        8. Sequence pattern matching
        9. Count number of distinct subsequences
        10. Longest Increasing Subsequence – LIS
        11. Longest Repeating Subsequence
        12. Longest Common Subsequence of 3 strings
        13. Print all possible LCS (not only one)
        14. Smallest window in S1 which contains S2 as subsequence
        15. Diff Utility Problem (Git ka diff command)
         */

        /*
        Ques1) Given 2 String S1:N & S2:M
        find the length of longest common subsequence
        subsequence ->Order of indices || Pick any indices we want

        S1 : f g d c b e a

        S2 : f g e h c a
        ans : fgca/fgea :4
        Idea :Get LCS between S1[0-6] && S2[0-5]

             LSC(S1[0-6] S2[0-5])
                S1[0]==S2[0]
             LCS[S1[1-6] S2[1-5])
                S1[1]==S2[1]
             LCS[S1[2-6] S2[2-5])
                S1[2]!=S2[2]  // Two cases will arise

        S1 : f g d c b e a            S1 : f g d c b e a
                 *
        S2 : f g e h c a              S2 : f g e h c a
                                               *
        LCS[S1[3-6] S2[2-5])         LCS[S1[2-6] S2[3-5])

        Recursion Ass : Calculate LCS between S1(i,N-1) S2(j,M-1)

        int LCS(char S1[],char S2[],int i,int j){
         if(i==N || j==M){
         return 0;         //i==N:S1 is empty
         }
         if(S1[i]==S2[j]){
         return LCS(S1,S2,i+1,j+1)+1;
         }else{
         return Max(LCS(S1,S2,i+1,j),LCS(S1,S2,i,j+1));
       }

       USing DP :
       dp state : dp[i][j]=LCS between S1[i..N-1] && S2[j..M-1)
       is DP[N-1][M-1] is valid : LCS S1[N-1,N-1) && S2(M-1,M-1) - Valid
       is DP[N][M] is valid :LCS S1[N,N-1) && S2(M,M-1)     - Invalid

         */


        char[] S1 = {'f', 'g', 'd', 'c', 'b', 'e', 'a'};
        char[] S2 = {'f', 'g', 'e', 'h', 'c', 'a'};
        int n = S1.length;
        int m = S2.length;
        int dp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = LCS(S1,S2,0,0,dp);

        System.out.println("Length of longest common subsequence is: "+ans);

        // Quest 2:- Print the string as well fgca (common subsequence)
        String dp1[][] = new String[n][m];
        String lcs = lcs_string(S1,S2,0,0,dp1);

        System.out.println("LCS String: "+lcs);

        /*
        Question 3:-
        Length of longest common substring
        String s1 ="abcde"
        String s2 ="abfde"
        length = 2
        Substring = ab or de

         */
        /*
        Simple bottom-up code
                   static int longestCommonSubstring(String s1, String s2) {
                int n = s1.length();
                int m = s2.length();
                int dp[][] = new int[n+1][m+1];

                int maxLen = 0;

            for(int i=1; i<=n; i++){
               for(int j=1; j<=m; j++){

                 if(s1.charAt(i-1) == s2.charAt(j-1)){
                      dp[i][j] = 1 + dp[i-1][j-1];
                       maxLen = Math.max(maxLen, dp[i][j]);
                 } else {
                     dp[i][j] = 0;
                 }
             }
            }

            return maxLen;
        }

         */

        String s1 = "abcdxy123zabc1234567swq";  //abcdxyz,geeksforgeeksco,abxy123pqrs789tuvw12345mnop,abcdxy123z,abcdxy123zabc1234567swq
        String s2 ="xyzabcdxy123ezabc1234567swq"; // xyzabcdxye,practicewritegeekscourses,zz1239pqabc123pqrs789kk12345,xyzabcdxy123e,xyzabcdxy123ezabc1234567swq
        int n1=s1.length();
        int m1 =s2.length();
        int dp2[][] = new int[n1][m1];
      //  int ans1 =solve_lls(s1.toCharArray(),s2.toCharArray(),dp2,0,0); --DP with memoization--> Taking too much time
        String maxLengthStr = solve_lls_bottom_up(s1,s2);
        System.out.println("Longest common substring is: "+maxLengthStr);
        System.out.println("Length of longest common substring: "+maxLengthStr.length());


        /*
        Question 4:-Longest Palindromic Subsequence (LPS)
        Given a string s, you must find the length of the longest subsequence which is a palindrome.
        String = "bbabcbcab"
        Longest Palindromic Subsequence = "babcbab"
        Length = 7

        Note --> If you reverse the string and find the Longest Common
        Subsequence between s and rev(s),
        the common subsequence will be a palindrome.
         */

        String s4="geeksforgeeks";  //bbabcbcab,cbbd,racecar,geeksforgeeks
        int n4= s4.length();
        String rev =new StringBuilder(s4).reverse().toString();
        String dp4[][] = new String[n4][n4];

        /*
        for(int i=0;i<n4;i++){
            for(int j=0;j<n4;j++){
                dp4[i][j]=-1;
            }
        }
         */

        String ans4 = long_palind_subsequence(s4,rev,n4-1,n4-1,dp4);
        System.out.println("Longest common palindromic subsequence is: "+ans4);
        System.out.println("Length of longest common palindromic subsequence is: "+ans4.length());

        /*
        Minimum Number of Deletions to Make a String Palindrome
        Task :Return how many characters you must delete to make the string a palindrome.
        - You may delete characters from anywhere (start, middle, or end).
        -You cannot reorder characters.
        - Only deletion is allowed, not insertion.

        To make a string palindrome with minimum deletions:
        -Keep the Longest Palindromic Subsequence (LPS)
        -Delete the rest of the characters.
        Minimum deletions = Length of string – Length of LPS

         */

        String s5 ="aebcbda";
        int n5 =s5.length();
        String rev5 =new StringBuilder(s5).reverse().toString();
        int dp5[][] = new int[n5][n5];
        for(int i=0;i<n5;i++){
            for(int j=0;j<n5;j++){
                dp5[i][j]=-1;
            }
        }
        int lengthOfLongSubsPalind =longestPalindSubsequence(s5,rev5,n-1,n-1,dp5);
        int minDel =n5-lengthOfLongSubsPalind;
        System.out.println("Minimum Number of Deletions to Make a String Palindrome: "+minDel);

        /*
        Question 6:- Shortest Common Supersequence (SCS)
        What is the problem?
        You are given two strings:
        str1 = "abac"
        str2 = "cab"
        You must build the shortest possible string that contains both str1 and str2 as subsequences.

        What does Supersequence mean?
        A string S is a supersequence of str1 if:
        - You can derive str1 from S by deleting some characters.
        - Same for str2.
        S = "cabac"
        This contains both:
        str1 = "abac"
        str2 = "cab"

        Find the Shortest Common Supersequence (SCS).
        Length of SCS = len(str1) + len(str2) – LCS(str1, str2)

        SCS is basically:
        Add non-matching characters from both strings +
        Add matching characters (LCS) only once.
         */
        String s16 ="abac";
        String s26 ="cab";
        // cal length of longest common subsequence
        char []ch16 = s16.toCharArray();
        char []ch26 = s26.toCharArray();
        int dp6[][] = new int[ch16.length][ch26.length];
        for(int i=0;i<ch16.length;i++){
            for(int j=0;j< ch26.length;j++){
                dp6[i][j]=-1;
            }
        }
        int longestLCS =LCS(ch16,ch26,0,0,dp6);
        // Length of SCS = len(str1) + len(str2) – LCS(str1, str2)
        int ans6 = s16.length()+s26.length()-longestLCS;
        System.out.println("Shortest Common Supersequence: "+ans6);

        int n6 =s16.length();
        int m6 =s26.length();
        String dp61[][] = new String[n6][m6];
        String scs =shortestCommonSuperSequence(s16,s26,0,0,dp61);
        System.out.println("Shortest Common Supersequence: "+scs);

        // Shortest common superSequence using backtracking

        String scs1 =shortestCommonSuperSequenceI(s16,s26);
        System.out.println("Shortest Common SuperSequence using backtracking: "+scs1);

        /*
        Question 7 :- Edit Distance / Levenshtein Distance
        Edit Distance = Minimum number of operations needed to convert one string into another
        Allowed operations:
        Insert a character : i - we can insert any char in s1 at any pos
        Delete a character : d - we can delete any char in s1 at any pos
        Replace a character: r - we can replace any char in s1 at any pos , with any char
        s1: l e a f d
        s2: l g f
        s1-> delete e  , replace a with g , delete d  --> 3 ops

                     edit (s1[0-4] s2[0-2])
                       if(s1[0] ==s2[0]) // char match
                     edit(s1[1-4]s2[1-2)
                     s1[1]!=s2[1]     // if char not matched

          ops: insert                  ops :replace                      ops:delete
              1  2  3  4  5
          s1: l g e  g  f  d            e is replace with g              e is deleted
          s2: l  g  f
          edit(s1[1-4]s2[2-2])+1       edit(s1[2-4]s2[2-2])+1            edit(s1[2-4]s2[1-2])+1
          // hypothetically insert g
          hence s1[1-4]


          Base cond:
          if(i==N && j==M){
          return 0;            // Both are exhausted ;s1="",s2=""
          }
          if(i==n){// s1=""; s1 is exhausted
          return m-j // s2= j j+1 ....m-1 ;  b-a +1 = m-1+j+1 =m-j
          }
          if(j==m){ //s2=""; s2 is exhausted
          return n-i; s1=i i+1 .......n-1; n-i;
          }

       Question 7:
         */

        String s7 ="leafd";
        String s71="lgf";
        int dp7[][] = new int[s7.length()+1][s71.length()+1];
        for(int i=0;i<=s7.length();i++){
            for(int j=0;j<=s71.length();j++){
                dp7[i][j]=-1;
            }
        }
        int minOps = editDistance(s7.toCharArray(),s71.toCharArray(),0,0,dp7);
        System.out.println("Min Ops required to edit distance: "+minOps);
    }



    private static int LCS(char [] s1,char [] s2,int i,int j,int dp [][]){
        if(i==s1.length || j==s2.length){
            return 0;
        }

        if(dp[i][j]==-1){
            if(s1[i]==s2[j]){
                dp[i][j]=LCS(s1,s2,i+1,j+1,dp)+1;
            }else{
                dp[i][j] =Math.max(LCS(s1, s2, i+1, j, dp),LCS(s1,s2,i,j+1,dp));
            }
        }
        return dp[i][j];
    }

    private static String lcs_string(char [] s1,char [] s2,int i,int j,String dp1 [][]){
        if(i== s1.length || j== s2.length){
            return "";
        }
        /*
        if(dp1[i][j] != null){
            return dp1[i][j];
        }

        if(s1[i]==s2[j]){
            dp1[i][j]=s1[i]+lcs_string(s1,s2,i+1,j+1,dp1);
            return dp1[i][j];
        }

        String option1 = lcs_string(s1,s2,i+1,j,dp1);
        String option2 =lcs_string(s1,s2,i,j+1,dp1);
        if(option1.length()>=option2.length()){
            dp1[i][j]=option1;
        }else{
            dp1[i][j]=option2;
        }
       return dp1[i][j];

         */
        if(dp1[i][j]==null){
            if(s1[i]==s2[j]){
                dp1[i][j]=s1[i]+lcs_string(s1,s2,i+1,j+1,dp1);
            }else{
                String option1 = lcs_string(s1,s2,i+1,j,dp1);
                String option2 =lcs_string(s1,s2,i,j+1,dp1);

                if(option1.length()>=option2.length()){
                    dp1[i][j]=option1;
                }else{
                    dp1[i][j]=option2;
                }
            }
        }
        return dp1[i][j];
    }

    private static int solve_lls(char s1[],char s2[],int dp2[][],int i,int j){
        if(i==s1.length || j== s2.length){
            return 0;
        }
        if(dp2[i][j]!=0) {
            return dp2[i][j];
        }

        int same =0;
        if(s1[i]==s2[j]){
            same =1+solve_lls(s1,s2,dp2,i+1,j+1);
            dp2[i][j]=same;
            if(same>maxLength){
                maxLength=same;
            }
        }else{
            dp2[i][j]=0;
        }
        solve_lls(s1,s2,dp2,i+1,j);
        solve_lls(s1,s2,dp2,i,j+1);

        return dp2[i][j];

    }

    private static String solve_lls_bottom_up(String s1,String s2){
        int n =s1.length();
        int m =s2.length();
        int dp[][] = new int[n+1][m+1];
        int maxLength =0;
        int endPos=0;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                  //  maxLength =Math.max(maxLength,dp[i][j]);
                    if(dp[i][j]>maxLength){
                        maxLength=dp[i][j];
                        endPos=i-1;
                    }
                }else{
                   dp[i][j]=0;
                }
            }
        }
        if(maxLength==0){
            return "";
        }
        return s1.substring(endPos-maxLength+1,endPos+1); // [a...b]=b-a+1=maxLength->a=b-maxLength+1;
    }

    /*
    private static int long_palind_subsequence(String s4,String rev,int i,int j,int [][] dp4){
        if(i<0 || j<0){
            return 0;
        }
        if(dp4[i][j]==-1){
            if(s4.charAt(i)==rev.charAt(j)){
                dp4[i][j]=1+ long_palind_subsequence(s4,rev,i-1,j-1,dp4);
            }else{
                int option1 =long_palind_subsequence(s4,rev,i-1,j,dp4);
                int option2 =long_palind_subsequence(s4,rev,i,j-1,dp4);
                dp4[i][j]=Math.max(option1,option2);
            }
        }
        return dp4[i][j];
    }
     */


    private static String long_palind_subsequence(String s4,String rev,int i,int j,String [][] dp4){
        if(i<0 || j<0){
            return "";
        }

        if(dp4[i][j]==null){
            if(s4.charAt(i)==rev.charAt(j)) {
                dp4[i][j] = s4.charAt(i) + long_palind_subsequence(s4, rev, i - 1, j - 1, dp4);
            }else{
                String option1 =long_palind_subsequence(s4,rev,i-1,j,dp4);
                String option2 = long_palind_subsequence(s4,rev,i,j-1,dp4);

                if(option1.length()>option2.length()){
                    dp4[i][j]=option1;
                }else{
                    dp4[i][j]=option2;
                }
            }
        }
        return dp4[i][j];
    }

    private static int longestPalindSubsequence(String s5,String rev5,int i,int j,int [][] dp5){
        if(i<0 || j<0){
            return 0;
        }
        if(dp5[i][j]==-1){
            if(s5.charAt(i)==rev5.charAt(j)){
                dp5[i][j]=1+ longestPalindSubsequence(s5,rev5,i-1,j-1,dp5);
            }else{
                int option1 =longestPalindSubsequence(s5,rev5,i-1,j,dp5);
                int option2 =longestPalindSubsequence(s5,rev5,i,j-1,dp5);
                dp5[i][j]=Math.max(option1,option2);
            }
        }
        return dp5[i][j];
    }

    private static String shortestCommonSuperSequence(String s1,String s2,int i,int j,String dp[][]){

        // s1 is empty and take s2
        if(i==s1.length()){
            return s2.substring(j);
        }
        // s2 is empty and take s1
        if(j==s2.length()){
            return s1.substring(i);
        }


        if(dp[i][j]==null){
            if(s1.charAt(i)==s2.charAt(j)){
                dp[i][j]=s1.charAt(i)+shortestCommonSuperSequence(s1,s2,i+1,j+1,dp);
            }else{
                String option1= shortestCommonSuperSequence(s1,s2,i+1,j,dp);
                String option2 =shortestCommonSuperSequence(s1,s2,i,j+1,dp);
                if(option1.length()<= option2.length()){
                    dp[i][j]=s1.charAt(i)+option1;
                }else{
                    dp[i][j]=s2.charAt(j)+option2;
                }
            }
        }

        return dp[i][j];
        /*
        Why do we add a character when characters don't match?
        Because Shortest Common Supersequence (SCS) means:
        You must include ALL characters of both strings
        And keep the original order
        But produce the shortest possible combined string
        When characters do not match, you must include one of them.
        If characters differ:
        s1[i] != s2[j]
        Then SCS has 2 ways:
        Option 1:
        Take s1[i] + SCS of the rest of s1 and s2:s1[i] + SCS(i+1, j)
        Option 2:
        Take s2[j] + SCS of s1 and rest of s2: s2[j] + SCS(i, j+1)

         */
    }

    private static String shortestCommonSuperSequenceI(String s1, String s2) {
        int n =s1.length();
        int m =s2.length();

        int dp[][]= new int[n+1][m+1];

        // step 1 =LCS dp build
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        //Step 2 = Back tracking build SCS
        StringBuilder sb = new StringBuilder();
        int i=n,j=m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            } else if (dp[i-1][j]>dp[i][j-1]) {
                sb.append(s1.charAt(i-1));
                i--;
            }else{
                sb.append(s2.charAt(j-1));
                j--;
            }
        }
        // add remaining char in sb from s1
        while(i>0){
            sb.append(s1.charAt(i-1));
            i--;
        }
        //add remaining char in sb from s2
        while(j>0){
            sb.append(s2.charAt(j-1));
            j--;
        }

        return sb.reverse().toString();
    }


    private static int editDistance(char[] s1, char[] s2, int i, int j,int dp[][]) {
        int n =s1.length;
        int m =s2.length;
        if(i==n && j==m){
            return 0;
        }
        if(i==n){
            return m-j;
        }
        if(j==m){
            return n-i;
        }
       if(dp[i][j]==-1) {
           if (s1[i] == s2[j]) {
               dp[i][j]= editDistance(s1, s2, i + 1, j + 1,dp);
           } else {
             int a =editDistance(s1,s2,i,j+1,dp)+1;// insert
             int b =editDistance(s1,s2,i+1,j+1,dp)+1; //replace
             int c =editDistance(s1,s2,i+1,j,dp)+1; // delete
             dp[i][j]=Math.min(a,Math.min(b,c));
           }
       }
       return dp[i][j];
    }

}
