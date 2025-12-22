package dsa.stDP;

import java.util.Arrays;

public class DP18 {
    public static void main(String[] args) {
       /*
       322. Coin Change
       You are given an integer array coins representing coins of different denominations and an
       integer amount representing a total amount of money.
       Return the fewest number of coins that you need to make up that amount. If that amount of
       money cannot be made up by any combination of the coins, return -1.
       You may assume that you have an infinite number of each kind of coin.

       Input: coins = [1,2,5], amount = 11
       Output: 3
       Explanation: 11 = 5 + 5 + 1
        */

        int coins [] ={1,2,5};
        int amount =11;
        int n = coins.length;
        int dp [][] = new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(n-1,coins,amount,dp);
        if(ans>=1e9){
            System.out.println("Ans is: "+ -1);
        }else{
            System.out.println("Ans is: "+ans);
        }

        System.out.println("Ans using tabulation");

        int dp1 [][] = new int[n][amount+1];
        // Base case
        for(int t=0;t<=amount;t++){
            if(t%coins[0]==0) dp1[0][t]=t/coins[0];
            else dp[0][t]=(int)1e9;
        }
        for(int i =1;i<n;i++){
            for(int t =0;t<=amount;t++){
                int notTake = dp1[i-1][t];
                int take = Integer.MAX_VALUE;
                if(t>=coins[i]){
                    take = 1+ dp1[i][t-coins[i]];
                }
                dp1[i][t] =Math.min(take,notTake);
            }

        }

        System.out.println("Ans is : "+dp1[n-1][amount]);

    }

    public static int solve(int ind,int coins[],int amount, int dp[][]){
        // Base case
        if(ind==0){
            if(amount % coins[0]==0)return amount/coins[0];
            else return (int) 1e9;
        }

        if(dp[ind][amount]!=-1) return dp[ind][amount];

        int notTake = solve(ind-1,coins,amount,dp);
        int take = Integer.MAX_VALUE;
        if(amount>=coins[ind]){
            take = 1+ solve(ind,coins,amount-coins[ind],dp);
        }
        dp[ind][amount] = Math.min(take,notTake);
        return dp[ind][amount];
    }
}
