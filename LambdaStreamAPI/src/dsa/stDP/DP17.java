package dsa.stDP;

import java.util.Arrays;

public class DP17 {
    public static void main(String[] args) {
        /*
        0 - 1 Knapsack Problem
       Given two arrays, val[] and wt[], where each element represents the value and weight of an
       item respectively, and an integer W representing the maximum capacity of the knapsack (the
       total weight it can hold).

       The task is to put the items into the knapsack such that the total value obtained is maximum
       without exceeding the capacity W.

       Note: You can either include an item completely or exclude it entirely — fractional selection of
       items is not allowed. Each item is available only once

       Examples :
       Input: W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1]
       Output: 3
       Explanation: Choose the last item, which weighs 1 unit and has a value of 3.

         */

        int W =4;
        int val [] = {1, 2, 3};
        int wt[] = {4, 5, 1};
        int n = wt.length;
        int dp [][] = new int [n][W+1];
        for(int i =0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = solve(n-1,W,val,wt,dp);
        System.out.println("Ans is : "+ans);
    }

    public static int solve(int ind,int W,int []val,int [] wt,int dp[][]){
        // base case;
        if(ind==0){
            if(wt[0]<=W) return val[0];
            else return 0;
        }

        if(dp[ind][W]!=-1)return dp[ind][W];

        int notTake = solve(ind-1,W,val,wt,dp);
        int take=Integer.MIN_VALUE;
        if(wt[ind]<=W){
            take = solve(ind-1,W-wt[ind],val,wt,dp) +val[ind];
        }

        dp[ind][W] = Math.max(take,notTake);
        return dp[ind][W];
    }
}
