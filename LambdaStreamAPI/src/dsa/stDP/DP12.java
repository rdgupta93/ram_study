package dsa.stDP;

public class DP12 {
    public static void main(String[] args) {
        /*
        Subset Sum Problem
       Given an array of positive integers arr[] and a value sum, determine if there is a subset of arr[]
       with sum equal to given sum.
       Examples:
       Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 9
       Output: true
       Explanation: Here there exists a subset with target sum = 9, 4+3+2 = 9.
         */

        int arr[] ={3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = arr.length;
        Boolean dp[][] = new Boolean[n][sum+1];
        Boolean ans = solve(n-1,sum,arr,dp);
        System.out.println("Ans is: "+ans);

        System.out.println("Using Tabulation");
        boolean dp1[][] = new boolean[n][sum+1];
        // Write the same base case as we write in dp memo if target==0
        for(int i=0;i<n;i++){
            dp1[i][0]=true;
        }
        // if(ind==0)return arr[0]==target;
        if(arr[0]<=sum) {
            dp1[0][arr[0]] = true;
        }

        for(int ind =1;ind<n;ind++){
            for( int target =1;target<=sum;target++){
                boolean notTake = dp1[ind-1][target];
                boolean take = false;
                if(target>=arr[ind]){
                    take = dp1[ind-1][target-arr[ind]];
                }
                dp1[ind][target] = take|| notTake;
            }
        }
        boolean ans1 =dp1[n-1][sum];
        System.out.println("Ans is Using Tabulation :"+ans1);
    }

    private static Boolean solve(int ind,int target, int arr[],Boolean[][] dp){
        // Base case
        if(target==0) return true;
        if(ind==0)return arr[0]==target;
        if(dp[ind][target]!=null) return dp[ind][target];

        Boolean notTake = solve(ind-1,target,arr,dp);
        Boolean take = false;
        if(target>=arr[ind]){
            take = solve(ind-1,target-arr[ind],arr,dp);
        }
       return dp[ind][target]=take || notTake;
    }
}
/*
class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int dp[][] = new int [n][sum+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        Boolean ans = solve(n-1,arr,sum,dp);
        return ans;
    }

    public static Boolean solve(int i,int [] arr,int target, int [][]dp){
        // Base case
        if(target==0) return true;
        if(i==0) return arr[0]==target;

        if(dp[i][target]!=-1) return dp[i][target]==1;

        Boolean notTake = solve(i-1,arr,target,dp);
         Boolean take= false;
        if(target>=arr[i]){
             take = solve(i-1,arr,target-arr[i],dp);
        }

        Boolean result= (take || notTake);
        if(result) {dp[i][target]=1;}
        else{dp[i][target]=0;}
        return dp[i][target]==1;
    }
}
 */
