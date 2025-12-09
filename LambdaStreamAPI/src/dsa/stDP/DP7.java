package dsa.stDP;

import java.util.Arrays;

public class DP7 {
    public static void main(String[] args) {
        //Unique Paths II
        /*
        You are given an m x n integer array grid. There is a robot initially located at the top-left
        corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m-1][n-1])
        The robot can only move either down or right at any point in time.
        An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot
        takes cannot include any square that is an obstacle.
        Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
        The testcases are generated so that the answer will be less than or equal to 2 * 109.

        Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
        Output: 2
        Explanation: There is one obstacle in the middle of the 3x3 grid above.
        There are two ways to reach the bottom-right corner:
        1. Right -> Right -> Down -> Down
        2. Down -> Down -> Right -> Right
         */

       int [][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;
       int dp[][] = new int[m][n];
       for(int i=0;i<m;i++){
           Arrays.fill(dp[i],-1);
       }
       int ans = solve(obstacleGrid,dp,m-1,n-1);
        System.out.println("Unique Path: "+ans);
    }

    private static int solve(int [][] obstacleGrid,int [][] dp,int i,int j){
        if(i<0 || j<0){
            return 0;
        }

        if(obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==0 && j==0){
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int up = solve(obstacleGrid,dp,i-1,j);
        int left = solve(obstacleGrid,dp,i,j-1);
        dp[i][j] = up+left;
        return dp[i][j];
    }
}
