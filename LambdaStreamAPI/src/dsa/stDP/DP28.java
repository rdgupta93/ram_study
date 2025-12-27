package dsa.stDP;

import java.util.Arrays;

public class DP28 {
    public static void main(String[] args) {
        /*
        583. Delete Operation for Two Strings
        Given two strings word1 and word2, return the minimum number of steps required to make
        word1 and word2 the same.

        In one step, you can delete exactly one character in either string.
        Example 1:
        Input: word1 = "sea", word2 = "eat"
        Output: 2
        Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
         */

        String word1 = "sea", word2 = "eat";
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = lcs(word1,word2,n-1,m-1,dp);
        int ans1 = n+m-2*ans;     // word1 --> delete (s delete)  and inset (t)
        System.out.println("Delete Operation for Two Strings: "+ans1);
    }

    private static int lcs(String word1,String word2,int i ,int j, int [][]dp){
        // Base case
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        if(word1.charAt(i)==word2.charAt(j)){
            dp[i][j] = 1+lcs(word1,word2,i-1,j-1,dp);
        }else{
            dp[i][j] = Math.max(lcs(word1,word2,i-1,j,dp),lcs(word1,word2,i,j-1,dp));
        }

        return dp[i][j];
    }
}
