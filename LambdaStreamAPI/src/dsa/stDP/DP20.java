package dsa.stDP;

import java.util.Arrays;

public class DP20 {
    public static void main(String[] args) {
        /*
        518. Coin Change II
        You are given an integer array coins representing coins of different denominations and an
        integer amount representing a total amount of money.
        Return the number of combinations that make up that amount. If that amount of money
        cannot be made up by any combination of the coins, return 0.
        You may assume that you have an infinite number of each kind of coin.
        The answer is guaranteed to fit into a signed 32-bit integer.

        Example 1:
        Input: amount = 5, coins = [1,2,5]
        Output: 4
        Explanation: there are four ways to make up the amount:
           5=5
           5=2+2+1
           5=2+1+1+1
           5=1+1+1+1+1
         */

       int  amount = 5;  // 5              3
       int []coins = {1,2,5};  //{1,2,5}   {2}
       int n = coins.length;
       int dp[][] = new int[n][amount+1];
       for(int i=0;i<n;i++){
           Arrays.fill(dp[i],-1);
       }
       int ans = solve(n-1,coins,amount,dp);
        System.out.println("Ans is : "+ans);


        System.out.println("Solving using tabulations");
        int dp1[][] = new int[n][amount+1];
        // base case
        for(int t =0;t<= amount;t++){
            if(amount%coins[0]==0){
                dp1[0][t] =1;
            }else{
                dp1[0][t]=0;
            }
        }
        for(int i=1;i<n;i++){
            for(int t =0;t<=amount;t++){
                int notTake = dp1[i-1][amount];
                int take =0;
                if(coins[i]<=t) take = dp1[i][amount-coins[i]];
                dp1[i][t] = take+notTake;
            }
        }

        System.out.println("Ans using tabulation is: "+dp1[n-1][amount]);
    }

    public static int solve(int ind,int [] coins,int amount,int [][] dp){
        // base case
        if(ind==0){
            if (amount%coins[0]==0) return 1;
            else return 0;
        }

        if(dp[ind][amount]!=-1) return dp[ind][amount];

        int notTake = solve(ind-1,coins,amount,dp);
        int take =0;
        if(coins[ind]<=amount){
            take = solve(ind,coins,amount-coins[ind],dp);
        }
        dp[ind][amount]= notTake+take;
        return dp[ind][amount];
    }
}
