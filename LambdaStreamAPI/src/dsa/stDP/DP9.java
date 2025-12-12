package dsa.stDP;

import java.util.Arrays;

public class DP9 {
    public static void main(String[] args) {
        /*
        120. Triangle
        Given a triangle array, return the minimum path sum from top to bottom.
        For each step, you may move to an adjacent number of the row below. More formally, if you
        are on index i on the current row, you may move to either index i or index i + 1 on the
        next row.
        Example 1:
        Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
        Output: 11
        Explanation: The triangle looks like:
                 2
                3 4
               6 5 7
              4 1 8 3

              The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
         */

        int triangle [][] = {{2},{3,4},{6,5,7},{4,1,8,3}};
        int n = triangle.length;
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(triangle,0,0,dp,n);
        System.out.println("minimum path sum from top to bottom: "+ans);
        // Getting TLE in Memoization
        // Using tabulation solving the above question
        int dp1[][] = new int[n][n];
        for(int j=0;j<n;j++){
            dp1[n-1][j] = triangle[n-1][j];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d = triangle[i][j] + dp1[i+1][j];
                int dg = triangle[i][j] + dp1[i+1][j+1];
                dp1[i][j] = Math.min(d,dg);
            }
        }

        System.out.println("minimum path sum from bottom to up tabulation: "+dp1[0][0]);
    }

    private static int solve(int [][] triangle,int i,int j, int [][] dp,int n){
        // base case
        if(i==n-1){
            return triangle[i][j];
        }

        if(dp[i][j]!=-1) return dp[i][j];
        int d = triangle[i][j]+solve(triangle,i+1,j,dp,n);
        int dg = triangle[i][j] + solve(triangle,i+1,j+1,dp,n);
        dp[i][j] = Math.min(d,dg);
        return dp[i][j];

    }
}
