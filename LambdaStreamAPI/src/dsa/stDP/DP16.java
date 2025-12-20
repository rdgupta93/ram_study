package dsa.stDP;

import java.util.Arrays;

public class DP16 {
    public static void main(String[] args) {
        /*
        Partitions with Given Difference
        Given an array arr[] and an integer diff, count the number of ways to partition the array into two
        subsets such that the difference between their sums is equal to diff.

        Note: A partition in the array means dividing an array into two subsets say S1 and S2 such that
        the union of S1 and S2 is equal to the original array and each element is present in only one of
        the subsets.

        Input: arr[] = [5, 2, 6, 4], diff = 3
        Output: 1
        Explanation: There is only one possible partition of this array. Partition : [6, 4], [5,2]
        The subset difference between subset sum is: (6 + 4) - (5 + 2) = 3.
         */

        int arr[] = {3, 2, 7, 1}; //{1, 1, 1, 1},0 ,{5, 2, 6, 4},3, {3, 2, 7, 1},4
        int diff = 4;
        int n= arr.length;
        int sum =0;

        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int target = (sum-diff)/2;
        if((sum-diff)<0 || (sum-diff)%2==1){
            System.out.println("Ans is zero");
        }

        int ans=findWays(arr,target);
        System.out.println("Count Partitions With Given Difference: "+ans);
    }
    public static int findWays(int [] arr,int target){
        int n = arr.length;
        int dp [][] = new int[n][target+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,arr,target,dp);
    }

    public static int solve(int ind,int []nums,int target,int [][]dp){

        if (ind == 0) {
            if (target == 0 && nums[0] == 0) return 2;
            if (target == 0) return 1;
            if (nums[0] == target) return 1;
            return 0;
        }

        if(dp[ind][target]!=-1) return dp[ind][target];

        int notPick = solve(ind-1,nums,target,dp);
        int pick =0;
        if(target>=nums[ind]){
            pick = solve(ind-1,nums,target-nums[ind],dp);
        }
        return dp[ind][target]=notPick + pick;
    }

}
