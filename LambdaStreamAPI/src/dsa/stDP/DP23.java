package dsa.stDP;

import java.util.Arrays;

public class DP23 {
    public static void main(String[] args) {
        /*
        Longest Common Subsequence
        Given two strings text1 and text2, return the length of their longest common subsequence.
        If there is no common subsequence, return 0
        A subsequence of a string is a new string generated from the original string with some
        characters (can be none) deleted without changing the relative order of the remaining
        characters.

        For example, "ace" is a subsequence of "abcde".
        A common subsequence of two strings is a subsequence that is common to both strings.

        Example 1:
        Input: text1 = "abcde", text2 = "ace"
        Output: 3
        Explanation: The longest common subsequence is "ace" and its length is 3.
         */

        String text1 = "abcde", text2 = "ace";
        char []s1 =text1.toCharArray();
        char []s2 = text2.toCharArray();
        int n = s1.length;
        int m = s2.length;
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        int dp1[][] = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp1[i],-1);
        }

        int ans = longestCommonSubsequence(s1,s2,0,0,dp);
        int ans1 =longestCommonSubsequence1(s1,s2,n-1,m-1,dp1);
        System.out.println("Ans is: "+ans);
        System.out.println("Ans is: "+ans1);


        System.out.println("Using tabulation ");

        int dp2 [][] = new int[n+1][m+1];
        // base case ;
        for(int j=0;j<=m;j++){
            dp2[0][j]=0;
        }
        for(int i=0;i<=n;i++){
            dp2[i][0]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(s1[i-1]==s2[j-1]) dp2[i][j] = 1+dp2[i-1][j-1];
                else{
                    dp2[i][j] = Math.max(dp2[i-1][j],dp2[i][j-1]);
                }
            }
        }

        System.out.println("Ans using tabulation is: "+dp2[n][m]);
    }
    public static int longestCommonSubsequence(char s1[],char s2[],int i,int j,int dp[][]){
        // Base case
        if(i==s1.length || j==s2.length){
            return 0;
        }

        if(dp[i][j]!=-1) return dp[i][j];

        if(s1[i]==s2[j]){
            dp[i][j] = 1+longestCommonSubsequence(s1,s2,i+1,j+1,dp);
        }else{
            dp[i][j] = Math.max(longestCommonSubsequence(s1,s2,i+1,j,dp),longestCommonSubsequence(s1,s2,i,j+1,dp));
        }

        return dp[i][j];
    }

    public static int longestCommonSubsequence1(char s1[],char s2[],int i,int j,int dp1[][]){
        // base case
        if(i<0 || j<0) return 0;

        if(dp1[i][j]!=-1) return dp1[i][j];

        if(s1[i]==s2[j]){
            dp1[i][j] = 1+longestCommonSubsequence1(s1,s2,i-1,j-1,dp1);
        }else{
            dp1[i][j] = Math.max(longestCommonSubsequence1(s1,s2,i,j-1,dp1),longestCommonSubsequence1(s1,s2,i-1,j,dp1));
        }

        return dp1[i][j];
    }
}
