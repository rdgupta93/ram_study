package dsa.stDP;

import java.util.Arrays;

public class DP21 {
    public static void main(String[] args) {
        /*
        Unbounded Knapsack
        Knapsack with Duplicate Items
        Given a set of items, each with a weight and a value, represented by the array wt[] and val[]
        respectively. Also, a knapsack with a weight limit capacity.
        Your task is to fill the knapsack in such a way that we can get the maximum profit. Return the
        maximum profit.
        Note: Each item can be taken any number of times.
        Examples:
        Input: val[] = [10, 40, 50, 70], wt[] = [1, 3, 4, 5], capacity = 8
        Output: 110
        Explanation: The optimal choice is to pick the 2nd element and the 4th element.

         */
        int val [] ={10, 40, 50, 70};
        int wt[] ={1, 3, 4, 5};
        int capacity =8;

        int n = wt.length;
        int dp[][] = new int[n][capacity+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = solve(n-1,val,wt,capacity,dp);
        System.out.println("Ans is: "+ans);

        System.out.println("Using tabulation solution");

        int dp1[][] = new int[n][capacity+1];
        for(int cap =0;cap<=capacity;cap++){
            dp1[0][cap] =(cap/wt[0])*val[0];
        }

        for(int ind =1;ind<n;ind++){
            for(int cap =0;cap<=capacity;cap++){
                int notTake = dp1[ind-1][cap];
                int take =0;
                if(wt[ind]<=cap){
                    take = val[ind] + dp1[ind][cap-wt[ind]];
                }
                dp1[ind][cap] = Math.max(notTake,take);
            }
        }

        System.out.println("Sol using Tabulations is : "+dp1[n-1][capacity]);
    }

    public static int solve(int ind,int val[],int wt[],int capacity,int dp[][]){
        // Base case

        if(ind==0){
            return (capacity/wt[0])*val[0];
        }

        if(dp[ind][capacity]!=-1) return dp[ind][capacity];

        int notTake = solve(ind-1,val,wt,capacity,dp);
        int take =0;
        if(wt[ind]<=capacity){
            take = val[ind] + solve(ind,val,wt,capacity-wt[ind],dp);
        }

        return dp[ind][capacity] = Math.max(take,notTake);
    }
}
