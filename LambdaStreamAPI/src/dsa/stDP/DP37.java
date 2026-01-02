package dsa.stDP;

import java.util.Arrays;

public class DP37 {
    public static void main(String[] args) {
        /*
        309. Best Time to Buy and Sell Stock with Cooldown
        You are given an array prices where prices[i] is the price of a given stock on the
         ith day.
         Find the maximum profit you can achieve. You may complete as many
         transactions as you like (i.e., buy one and sell one share of the stock multiple
         times) with the following restrictions:
         After you sell your stock, you cannot buy stock on the next
         day (i.e., cooldown one day).
         Note: You may not engage in multiple transactions simultaneously (i.e., you must
         sell the stock before you buy again).

         Example 1:
         Input: prices = [1,2,3,0,2]
         Output: 3
         Explanation: transactions = [buy, sell, cooldown, buy, sell]
         */

        int[] prices = {1,2,3,0,2};
        int n = prices.length;

        int dp[][] = new int [n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(0,1,n,prices,dp);
        System.out.println("Ans is: "+ans);

        System.out.println("Using tabulation");

        int dp1[][] = new int[n+2][2];
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                if(buy==1){
                    dp1[ind][buy]=Math.max((-prices[ind]+ dp1[ind+1][0]),
                            0+ dp1[ind+1][1]);
                }else{
                    dp1[ind][buy] = Math.max((prices[ind]+dp1[ind+2][1]),
                            0+ dp1[ind+1][0]);
                }
            }
        }
        System.out.println("Sol using Tabulation: "+dp1[0][1]);
    }
    private static int solve(int ind,int buy,int n ,int prices [],int [][]dp){
        // base case
        if(ind>=n)return 0;

        if(dp[ind][buy]!=-1)return dp[ind][buy];

        if(buy==1){
            dp[ind][buy]=Math.max((-prices[ind]+ solve(ind+1,0,n,prices,dp)),
                    0+ solve(ind+1,1,n,prices,dp));
        }else{
            dp[ind][buy] = Math.max((prices[ind]+solve(ind+2,1,n,prices,dp)),
                    0+ solve(ind+1,0,n,prices,dp));
        }

        return dp[ind][buy];
    }
}
