package dsa.stDP;

import java.util.Arrays;

public class DP27 {
    public static void main(String[] args) {
        /*
        Minimum Insertion Steps to Make a String Palindrome
        Given a string s. In one step you can insert any character at any index of the string.
        Return the minimum number of steps to make s palindrome.
        A Palindrome String is one that reads the same backward as well as forward.

        Example 1:
        Input: s = "zzazz"
        Output: 0
        Explanation: The string "zzazz" is already palindrome we do not need any insertions.
         */

        String s = "mbadm";//mbadm, zzazz
        String rev = new StringBuilder(s).reverse().toString();

        int n = s.length();
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = longest_palindromic_subsequence(s,rev,n-1,n-1,dp);
        int ans1 = n-ans;
        System.out.println("Minimum Insertion Steps to Make a String Palindrome:"+ ans1);
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
