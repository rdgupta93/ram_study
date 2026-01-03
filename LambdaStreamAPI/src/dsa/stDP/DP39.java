package dsa.stDP;

import java.util.Arrays;

public class DP39 {
    public static void main(String[] args) {
        /*
         Ques 10: Longest Increasing Subsequence
        A subsequence means :- You can remove some element but order must remain same
        Increasing means > previous selected number
        LIS = Max length of increasing subsequence
        arr = [10, 22, 9, 33, 21, 50, 41, 60]
        Some increasing subsequences:
        [10, 22, 33, 50, 60] → length = 5
        [10, 22, 33, 41, 60] → length = 5
        [10, 22, 33, 50] → length = 4
        💥 Longest = 5
        Thus LIS = 5

        Intuition (Recursive thinking)
        At every index i, you have 2 choices:

        1) Include arr[i]
        BUT only if:
        arr[i] > previous number

        2) Exclude arr[i]
        Move ahead and don’t choose it.

         LIS(i, prevIndex) = max(
             1 + LIS(i+1, i),          // include
              LIS(i+1, prevIndex)       // exclude
             )
             --> why dp of size [n][n+1] // prev index can be from -1 to n-1

         */
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        int dp[][] = new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(0,-1,arr,dp);
        System.out.println("Length of longest increasing subsequence is: "+ans);

        System.out.println("Using tabulation");

        int dp1[][] = new int[n+1][n+1];
        for(int ind=n-1;ind>=0;ind--){
            for( int prev=ind-1;prev>=-1;prev--){
                // not take
                int notTake = dp1[ind+1][prev+1];

                // take
                int take=0;
                if(prev==-1 || arr[ind]>arr[prev]){
                    take =1+ dp1[ind+1][ind+1];
                }

                dp1[ind][prev+1]= Math.max(take,notTake);
            }
        }
        System.out.println(dp1[0][0]);
    }

    private static int solve(int ind,int prev,int arr[],int [][] dp){
        // base case
        int n = arr.length;
        if(ind==n) return 0;

        if(dp[ind][prev+1]!=-1)return dp[ind][prev+1];

        // not take
        int notTake = solve(ind+1,prev,arr,dp);
        // take
        int take=0;
        if(prev==-1 || arr[ind]>arr[prev]){
            take =1+ solve(ind+1,ind,arr,dp);
        }
        return dp[ind][prev+1]= Math.max(take,notTake);
    }
}
