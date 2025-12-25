package dsa.stDP;

import java.util.Arrays;

public class DP22 {
    public static void main(String[] args) {
        /*
        Rod Cutting Problem:-
        Given a rod of length n inches and an array price[], where price[i] denotes the value of a piece of
        length i. Your task is to determine the maximum value obtainable by cutting up the rod and
        selling the pieces.

        Note: n = size of price, and price[] is 1-indexed array.
        Example:
        Input: price[] = [1, 5, 8, 9, 10, 17, 17, 20]
        Output: 22
        Explanation: The maximum obtainable value is 22 by cutting in two pieces of
        lengths 2 and 6, i.e., 5 + 17 = 22.


         */

        int price[] = {3, 5, 8, 9, 10, 17, 17, 20}; //{1, 5, 8, 9, 10, 17, 17, 20},{3, 5, 8, 9, 10, 17, 17, 20}
        int n = price.length;
        int dp[][] = new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(n-1,n,dp,price);
        System.out.println("Ans is : "+ans);

        System.out.println("Solving using the tabulation ");

        int dp1[][] = new int[n][n+1];
        // Base case
        for(int N =0;N<=n;N++){
            dp1[0][N]=N * price[0];
        }

        for(int ind =1;ind<n;ind++){
            for(int N=0;N<=n;N++){
                int notTake = dp1[ind-1][N];
                int rodLength = ind+1;
                int take =0;
                if(rodLength<=N){
                    take = price[ind] + dp1[ind][N-rodLength];
                }
                dp1[ind][N] = Math.max(take,notTake);
            }
        }

        System.out.println("Ans using tabulation is: "+dp1[n-1][n]);
    }

    public static int solve(int ind,int N ,int [][] dp, int [] prices){
        // base case
        if(ind==0){
            return N * prices[0];
        }

        if(dp[ind][N]!=-1)return dp[ind][N];

        int notTake = solve(ind-1,N,dp,prices);
        int rodLength = ind+1;
        int take =0;
        if(rodLength<=N){
            take = prices[ind] + solve(ind,N-rodLength,dp,prices);
        }

        return dp[ind][N]=Math.max(notTake,take);
    }
}
