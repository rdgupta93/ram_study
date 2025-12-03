package dsa.stDP;

import java.util.Arrays;

public class DP1 {
    public static void main(String[] args) {
        // Fibonacci number --> 0, 1, 1, 2, 3, 5, 8, 13, 21, ...... so on

        /*

        // 1. Memoization (Top-Down DP)
        Idea: Use recursion + caching.
        We solve the problem using recursion.
        Every time we compute a Fibonacci number, we store it in a cache (array/map).
        Next time, if the same subproblem is required, we directly return it instead of re-computing.

         */

        /*

        // 2. Tabulation (Bottom-Up DP)
        Idea: Use iteration + array (table).
        Start from the base cases fib(0) and fib(1).
        Build the solution step by step until fib(n).
         */

        int n =10;
        int dp[] = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println("fibonacci of n is "+fib(n,dp));

        // Tabulation --Bottom-Up DP
        // Idea: Use iteration + array (table).
        // Start from the base cases fib(0) and fib(1)
        // Build the solution step by step until fib(n).

        int m =8;
        int dpm[] = new int[m+1];
        dpm[0]=0;
        dpm[1] =1;

        for(int i=2;i<=m;i++){
            dpm[i] = dpm[i-1]+dpm[i-2];
        }

        System.out.println("fibonacci of m is "+dp[m]);

        // TC -> O(N)  SC - O(N) (DP array)

        // Optimise solution SC --> O(1)

        int k =6;
        int prev2 =0;
        int prev1 =1;
        int curr =0;
        for(int i=2;i<=k;i++){
            curr = prev1 +prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println("fibonacci of k is "+curr);

    }

    // Memoization

    public static int fib(int n,int dp []){

        if(n<=1){
            return n;
        }

        if(dp[n]==-1){
            dp[n]=fib(n-1,dp)+fib(n-2,dp);
        }
        return dp[n];
    }

    //TC -> O(N)   SC --> O(N)(Recursion stack space) + O(N) (Array dp[n])


}
