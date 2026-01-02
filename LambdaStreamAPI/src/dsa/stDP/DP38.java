package dsa.stDP;

import java.util.Arrays;

public class DP38 {
    public static void main(String[] args) {
        /*
        You are given an array prices where prices[i] is the price of a given stock on
        the ith day, and an integer fee representing a transaction fee.
        Find the maximum profit you can achieve. You may complete as many
        transactions as you like, but you need to pay the transaction fee for
        each transaction.
        Note:
        - You may not engage in multiple transactions simultaneously (i.e., you must sell
        the stock before you buy again).
        - The transaction fee is only charged once for each stock purchase and sale.
        Example 1:
        Input: prices = [1,3,2,8,4,9], fee = 2
         Output: 8
         Explanation: The maximum profit can be achieved by:
             - Buying at prices[0] = 1
             - Selling at prices[3] = 8
             - Buying at prices[4] = 4
             - Selling at prices[5] = 9
             The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
         */

       int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        int n = prices.length;

        int dp[][] = new int [n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(0,1,n,prices,dp,fee);
        System.out.println("Ans is: "+ ans);
    }

    private static int solve(int ind,int buy,int n ,int prices [],int [][]dp,int fee){
        // base case
        if(ind>=n)return 0;

        if(dp[ind][buy]!=-1)return dp[ind][buy];

        if(buy==1){
            dp[ind][buy]=Math.max((-prices[ind]+ solve(ind+1,0,n,prices,dp,fee)),
                    0+ solve(ind+1,1,n,prices,dp,fee));
        }else{
            dp[ind][buy] = Math.max((prices[ind]-fee +solve(ind+1,1,n,prices,dp,fee)),
                    0+ solve(ind+1,0,n,prices,dp,fee));
        }

        return dp[ind][buy];
    }
}
