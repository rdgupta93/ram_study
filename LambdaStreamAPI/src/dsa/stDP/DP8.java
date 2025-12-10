package dsa.stDP;

import java.util.Arrays;

public class DP8 {
    public static void main(String[] args) {
        /*
        64. Minimum Path Sum
        Given a m x n grid filled with non-negative numbers, find a path from top left to bottom
        right, which minimizes the sum of all numbers along its path.
        Note: You can only move either down or right at any point in time.

        Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
        Output: 7
        Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum
         */

        int grid [][] ={{1,3,1},{1,5,1},{4,2,1}};
        int m = grid.length;
        int n = grid[0].length;
        int dp [][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        int minSum = solve(grid,m-1,n-1,dp);
        System.out.println("Min sum is: "+minSum);
    }

    private static int solve(int [][] grid, int i, int j, int [][] dp){
        if(i<0 || j<0){
            return Integer.MAX_VALUE; // return max Value
        }

        if(i==0 && j==0){
            return grid[0][0];
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j] = grid[i][j]+Math.min(solve(grid,i-1,j,dp),solve(grid,i,j-1,dp)) ;
        return dp[i][j];
    }
}
