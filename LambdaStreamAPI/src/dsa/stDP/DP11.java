package dsa.stDP;

public class DP11 {
    public static void main(String[] args) {
        /*
        1463. Cherry Pickup II
        You are given a rows x cols matrix grid representing a field of cherries where grid[i][j]
         represents the number of cherries that you can collect from the (i, j) cell.

         You have two robots that can collect cherries for you:
         Robot #1 is located at the top-left corner (0, 0), and
         Robot #2 is located at the top-right corner (0, cols - 1).
         Return the maximum number of cherries collection using both robots by following the rules below:
         From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
         When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
         When both robots stay in the same cell, only one takes the cherries.
         Both robots cannot move outside of the grid at any moment.
         Both robots should reach the bottom row in grid.
         Example 1:-
         Input: grid = [[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
         Output: 24
         Explanation: Path of robot #1 and #2 are described in color green and blue respectively.
         Cherries taken by Robot #1, (3 + 2 + 5 + 2) = 12.
         Cherries taken by Robot #2, (1 + 5 + 5 + 1) = 12.
         Total of cherries: 12 + 12 = 24.
         */
        int grid[][] = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        int m = grid.length;
        int n = grid[0].length;
        int dp[][][]= new int[m][n][n];
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                for(int k =0;k<n;k++){
                    dp[i][j][k] =-1;
                }
            }
        }
        int ans = solve(0,0,n-1,grid,dp);
        System.out.println("maximum number of cherries collection using both robots: "+ans);

        System.out.println("Solving using tabulation");
        int dp1[][][] = new int[m][n][n];
        // base case
        for(int j1=0;j1<n;j1++){
            for(int j2=0;j2<n;j2++){
                if(j1==j2)dp[m-1][j1][j2]=grid[m-1][j1];
                else dp[m-1][j1][j2] = grid[m-1][j1]+grid[m-1][j2];
            }
        }
        for(int i = m-2;i>=0;i--){
            for(int j1=0;j1<n;j1++){
                for(int j2=0;j2<n;j2++){
                    int maxi = -100000000;
                    for(int dj1=-1;dj1<=1;dj1++){
                        for(int dj2=-1;dj2<=1;dj2++){
                            int value=0;
                            if(j1==j2) value = grid[i][j1];
                            else value = grid[i][j1]+grid[i][j2];
                            if(j1+dj1>0 && j2+dj2>0 && j2+dj2<n && j1+dj1<n) {
                                value = value + dp1[i + 1][j1 + dj1][j2 + dj2];
                            }else{
                                value = -100000000;
                            }
                            maxi = Math.max(maxi,value);
                        }
                    }
                 dp1[i][j1][j2]=maxi;
                }
            }
        }
        System.out.println("maximum number of cherries collection using both robots: "+dp[0][0][n-1]);
    }

    private static int solve(int i,int j1,int j2,int [][] grid,int [][][] dp){
        // Base case
        if(j1<0 || j2<0 || j1>=grid[0].length || j2>=grid[0].length){
            return -100000000;
        }
        // Destination
        if(i== grid.length-1){
            if(j1==j2)return grid[i][j1];
            else return grid[i][j1]+grid[i][j2];
        }
        // if already visited
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        // Exploring all the path
        /*
        Robot1:-
        j1 - 1   (left)
        j1       (same)
        j1 + 1   (right)
        robot2:-
        j2 - 1   (left)
        j2       (same)
        j2 + 1   (right)
        Total combinations = 3 × 3 = 9 Possible Moves Together
        solve(i+1, j1-1, j2-1)
        solve(i+1, j1-1, j2)
        solve(i+1, j1-1, j2+1)
        solve(i+1, j1,   j2-1)
        solve(i+1, j1,   j2)
        solve(i+1, j1,   j2+1)
        solve(i+1, j1+1, j2-1)
        solve(i+1, j1+1, j2)
        solve(i+1, j1+1, j2+1)
         */
        int maxi = -100000000;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
                if(j1==j2) value = grid[i][j1];
                else value = grid[i][j1]+grid[i][j2];
                value = value + solve(i+1,j1+dj1,j2+dj2,grid,dp);
                maxi = Math.max(maxi,value);
            }
        }

        return dp[i][j1][j2]=maxi;
    }
}
