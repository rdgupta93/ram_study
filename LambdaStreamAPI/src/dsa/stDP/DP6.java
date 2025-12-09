package dsa.stDP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DP6 {

    public static void main(String[] args) {

    /*
       62. Unique Paths
       There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e.,
       grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n -1)]
       The robot can only move either down or right at any point in time.
       Given the two integers m and n, return the number of possible unique paths that the robot
       can take to reach the bottom-right corner.
       The test cases are generated so that the answer will be less than or equal to 2 * 109.
     */

     int m =3,n=7;
     int dp[][] = new int[m][n];
     for(int i=0;i<m;i++){
         Arrays.fill(dp[i],-1);
     }
     int ans = solve(dp,m-1,n-1);
        System.out.println("Unique path: "+ans);
    }
    private static int solve(int dp[][],int i,int j){
        if(i<0 || j<0){
            return 0;
        }
        if(i==0 && j==0){
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int up = solve(dp,i-1,j);
        int left = solve(dp,i,j-1);
        dp[i][j] = up+left;
        return dp[i][j];
    }
}
