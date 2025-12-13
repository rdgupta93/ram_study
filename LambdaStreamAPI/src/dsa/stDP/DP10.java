package dsa.stDP;

import java.sql.SQLOutput;
import java.util.Arrays;

public class DP10 {

    private static int INF = (int)1e9;
    public static void main(String[] args) {


    /*
    931. Minimum Falling Path Sum
    Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
    A falling path starts at any element in the first row and chooses the element in the next row
    that is either directly below or diagonally left/right. Specifically, the next element from
    position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

    Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
    Output: 13
    Explanation: There are two falling paths with a minimum sum as shown.
     */

        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i],-1);
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            ans = Math.min(ans,solve(matrix,dp,m-1,j));
        }
        System.out.println("Min path sum: "+ans+" TLE coming for large set data Need to use Tabulation");
        System.out.println("Tabulation solution here");
        int dp1[][] = new int[m][n];
        // Base case
        for(int j =0;j<n;j++){
            dp1[0][j] = matrix[0][j];
        }
        // fill the dp1 table in tabulation
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int u = matrix[i][j] + dp1[i-1][j];
                int ul = matrix[i][j];
                 if(j-1>0) ul+= dp1[i-1][j-1];
                 else ul+=INF;
                int ur = matrix[i][j];
                if(j+1<m)ur+=dp1[i-1][j+1];
                else ur+=INF;

                dp1[i][j] = Math.min(u,Math.min(ul,ur));
            }
        }
        int minAns = dp1[m-1][0];
        for(int j =1;j<n;j++){
            minAns = Math.min(minAns,dp1[m-1][j]);
        }
        System.out.println("Min path sum using Tabulation technique: "+minAns);
    }

    private static int solve(int matrix[][], int dp[][],int i, int j){
        // base case
        if(j<0 || j>= matrix[0].length){
            return INF;
        }
        if(i==0){
            return matrix[0][j];
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int up = matrix[i][j] + solve(matrix,dp,i-1,j);
        int upl = matrix[i][j] + solve(matrix,dp,i-1,j-1);
        int upr = matrix[i][j] + solve(matrix,dp,i-1,j+1);
        return dp[i][j] = Math.min(up,Math.min(upl,upr));
    }
}
