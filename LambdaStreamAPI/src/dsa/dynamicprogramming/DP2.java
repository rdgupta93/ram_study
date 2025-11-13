package dsa.dynamicprogramming;

public class DP2 {

    public static void main(String[] args) {


        // Ques1- Given ar[N] calculate max subsequence sum
        // Note 1 --> In a subsequence 2 adjacent elements can not be picked
        // Note 2 --> Empty subsequence is also valid ={0}
        // Subsequence --> Any element , order index --> You can pick any number in order sequence
        /*
        ar[3] ={9 14 3} , ans=14
        ar[4] ={9 4 13 24} ans = 33
        ar[3] ={13 14 2} ans =14
        ar[4] = {-4 -3 -2 -3} ans=0

        Idea 1-->sum of all odd indices
                 sum of all even indices ---> Fail(not working}
        Idea 2 --> Generate all subsequences:
                   Considering only non adjacent subsequence sum & get overall max
             TC--> O(2powN* N)

          Idea:-   Recursion :-

          ar[8] ={2 -1  -4  5  3 -1  4 2 }

                                              ms(0,7)

                        ms(1,7)(0 index remove)           ms(2,7)+ar[0] --> 0 index accepted

                ms(2,7)             ms(3,7)+ar[1]     ms(3,7)       ms(4,7)+ar[2]   --> 1 index remove and accepted


              max non adjacent subsequence sum from [i........N-1]
                       i  i+1  i+2  i+3   ......N-1

              i+1 i+2.....N-1                ar[i]+ i+2.....N-1
              maxSum(ar,i+1)                 ar[i]+maxSum[ar,i+2]
              // recursive code
              int maxSum(int A[],int i){
                if(i>=N){return 0} // because i is increasing if i is invalid then return 0}
                return Math.max(maxSum(ar,i+1),ar[i]+maxSum(ar,i+2))
              }
         */

        // Apply DP --> Overlapping sub problem

        int ar[] ={2 ,-1,  -4,  5,  3, -1,  4, 2 };
        //DP[i] = max non adjacent subsequence sum from {i....N-1}
        //DP[N] = max non adjacent subsequence sum from {N....N-1}--> Invalid
        // DP[N-1] = max non adjacent subsequence sum from {N-1....N-1} --> Valid

        int dp[] = new int[ar.length];
        for(int i=0;i<ar.length;i++){
            dp[i] = -1;
        }

        int ans = maxSum(ar,dp,0);
        System.out.println(ans);


    // Ques 2 :- Number of ways to go from (0,0) --> BR Cells, In Matrix [N][M]
        // Note -From Cell either we go right or down // BR --> Bottom Right

        /*
        [N] = 0 1 2 ....N-3 N-2 N-1
        [M] = 0 1 2 ....M-3 M-2 M-1
        To reach Bottom right(N-1,M-1) --> We can reach either by cell (N-1,M-2) or cell(N-2,M-1)
                                       ways(N-1,M-1)
                       ways(N-2,M-1)                   ways(N-1,M-2)
              ways(N-2,M-2)     ways(N-3,M-1)       ways(N-2,M-2)      ways(N-1,M-3)

              recursive code -
              int ways(int i,int j){ // No of ways to reach i,j from 0 0
                 if(i<0 || j<0){return 0} // Invalid index
                 if(i==0 && j==0){ return 1} // to reach cell (0,0) from cell(0,0) -->1 (possible to reach)
                 return ways(i-1,j)+ways(i,j-1)
               }

           DP Code
           dp[i][j] =no. of ways to reach i,j from 0,0
           dp[N][M] = no of ways to reach n,m from 0,0 --> n,m is invalid index
           dp[N-1]{M-1] = no.of ways to reach n-1,m-1 from 0,0

           int dp[n][m] =-1 // invalid
           int ways(int i,int j){
             if(i<0 || j<0){return 0}
             if(i==0 && j==0){return 1}
             if(dp[i][j]==-1){
               dp[i][j] = ways(i-1,j)+ways(i,j-1)
             }
            return dp[i][j];
           }

           TC = (N*M)*1 = N*M
           SC = O(N*M)


           Ques 3:-
            Number of ways to go from (0,0) --> BR Cells, In Matrix [N][M]
            Note -From Cell either we go right or down // BR --> Bottom Right
            Note :- Certain cell contain 0 , indicates blocked cells , we can not travel
                    via blocked cell


           int dp[n][m] =-1 // invalid
           int ways(int i,int j,int mat[][]){
             if(i<0 || j<0){return 0}
             if(mat[i][j]==0){return 0} // this is blocked cell
             if(i==0 && j==0){return 1}
             if(dp[i][j]==-1){
               dp[i][j] = ways(i-1,j)+ways(i,j-1)
             }
            return dp[i][j];
           }

         */


        // Ques 3 -
        // Given a 2 x N grid of integers, A, your task is to choose numbers from the grid such that sum of these numbers is maximized.
        // However, you cannot choose two numbers that are adjacent horizontally, vertically, or diagonally.
        //Return the maximum possible sum.
        //Note: You are allowed to choose more than 2 numbers from the grid.
        // Problem Constraints - 1 <= N <= 20000  &&  1 <= A[i] <= 2000

        int A[][] = {
                {1, 2, 3, 4},
                {2, 3, 4, 5}
        };
        int n = A[0].length;
        int [] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = Math.max(A[0][i],A[1][i]);
        }

        int n1 = result.length;
        int sol [] = new int[n1];
        for(int i=0;i<n1;i++){
            sol[i] = -1;
        }

        System.out.println(help(result,sol,0));

    }

    public static int maxSum(int ar[],int dp[],int i){
        if(i>=ar.length){
            return 0;
        }
        if(dp[i]==-1){
            dp[i] = Math.max(maxSum(ar,dp,i+1),ar[i]+maxSum(ar,dp,i+2));
        }
        return dp[i];
    }

    // Notes --> For Tracing see the notes

    public static int help(int[] result, int[] sol, int i){
        if(i>=result.length){return 0;}
        if(sol[i]==-1){
            sol[i]= Math.max(help(result,sol,i+1),help(result,sol,i+2)+result[i]);
        }
        return sol[i];
    }
}
