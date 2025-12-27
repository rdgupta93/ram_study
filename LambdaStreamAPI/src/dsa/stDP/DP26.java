package dsa.stDP;

import java.util.Arrays;

public class DP26 {
    public static void main(String[] args) {
        /*
        Longest Palindromic Subsequence
        Given a string s, find the longest palindromic subsequence's length in s.
        A subsequence is a sequence that can be derived from another sequence by deleting some
        or no elements without changing the order of the remaining elements.

        Example 1:
         Input: s = "bbbab"
         Output: 4
         Explanation: One possible longest palindromic subsequence is "bbbb".
         */

        String s = "bbbab";
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = longest_palindromic_subsequence(s,rev,n-1,n-1,dp);
        System.out.println("Longest palindromic subsequence is: "+ans);
    }

    private static int longest_palindromic_subsequence(String s1,String s2,int i,int j,int [][] dp){
        // base case
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j] = 1+longest_palindromic_subsequence(s1,s2,i-1,j-1,dp);
        }else{
            dp[i][j] = Math.max(longest_palindromic_subsequence(s1,s2,i-1,j,dp),longest_palindromic_subsequence(s1,s2,i,j-1,dp));
        }

        return dp[i][j];
    }
}
