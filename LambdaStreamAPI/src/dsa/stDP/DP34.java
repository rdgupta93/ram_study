package dsa.stDP;

import java.util.Arrays;

public class DP34 {
    public static void main(String[] args) {
          /*
        121. Best Time to Buy and Sell Stock
        You are given an array prices where prices[i] is the price of a given stock on the ith day.

        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        Example 1:

        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
         */

        int []prices = {7,1,5,3,6,4};
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = maxProfit(0,1,n,prices,dp);
        System.out.println("Max profit is: "+ans);

        System.out.println("Using tabulation code");
        int dp1[][] = new int[n+1][2];
        // base case
        dp1[n][0] = dp1[n][1]=0;

        for (int ind =n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                int profit =0;
                if(buy==1){
                    profit = Math.max((-prices[ind] + dp1[ind+1][0]),0+dp1[ind+1][1]);
                }else{
                    profit = Math.max((prices[ind]+dp1[ind+1][1]),0+dp1[ind+1][0]);
                }
                 dp1[ind][buy]= profit;
            }
        }

        System.out.println("Max profit using Tabulation: "+dp1[0][1]);
    }
    public static int maxProfit(int ind,int buy,int n,int [] prices,int [][] dp){
        // Base case
        if(ind==n) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int profit =0;
        if(buy==1){
            profit = Math.max((-prices[ind] + maxProfit(ind+1,0,n,prices,dp)),0+maxProfit(ind+1,1,n,prices,dp));
        }else{
            profit = Math.max((prices[ind]+maxProfit(ind+1,1,n,prices,dp)),0+maxProfit(ind+1,0,n,prices,dp));
        }
        return dp[ind][buy]= profit;
    }
}
