package dsa.stDP;

import java.util.Arrays;

public class DP30 {

    public static void main(String[] args) {
        /*
        Distinct Subsequences:
        Given two strings s and t, return the number of distinct subsequences of s which equals t.
        The test cases are generated so that the answer fits on a 32-bit signed integer.

        Example 1:
        Input: s = "rabbbit", t = "rabbit"
        Output: 3
        Explanation:
        As shown below, there are 3 ways you can generate "rabbit" from s.
        rabbbit
        rabbbit
        rabbbit
         */

        String s = "rabbbit", t = "rabbit";
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = solve(s,t,n-1,m-1,dp);
        System.out.println("Distinct Subsequences: "+ans);
        System.out.println(s);
        System.out.println(t);

        System.out.println("Using tabulation ");
        int dp1[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++)dp1[i][0]=1;
        for(int j=1;j<=m;j++)dp1[0][j] =0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)) {
                    dp1[i][j] = dp1[i - 1][j - 1] + dp1[i - 1][j];
                }else{
                    dp1[i][j] = dp1[i-1][j];
                }
            }
        }

        System.out.println("Distinct subsequence is : "+dp1[n][m]);
    }

    public static int solve(String s, String t, int i, int j,int dp[][]){
       if(j<0) return 1; // if t is completed 1 subsequence found
        if(i<0) return 0; // no subsequence found

        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j] = solve(s,t,i-1,j-1,dp)+solve(s,t,i-1,j,dp);
        }else{
            dp[i][j] = solve(s,t,i-1,j,dp);
        }

        return dp[i][j];
    }
}
