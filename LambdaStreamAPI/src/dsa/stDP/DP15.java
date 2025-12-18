package dsa.stDP;

import java.util.Arrays;

public class DP15 {
    public static void main(String[] args) {
        //28 4 3 27 0 24 26
        //24

        /*
        Given an array arr of non-negative integers and an integer target, the task is to count all
        subsets of the array whose sum is equal to the given target.

        Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
        Output: 3
        Explanation: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.

         */

        int nums[] = {28,4,3,27,0,24,26};// {2, 5, 1, 4, 3},10,{5, 2, 3, 10, 6, 8}10,{5, 7, 8}3,{28,4,3,27,0,24,26}24
        int target =24;
        int n = nums.length;
        int dp[][] = new int [n][target+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = solve(n-1,nums,target,dp);
        System.out.println("Ans is : "+ans);
    }

    public static int solve(int ind,int []nums,int target,int [][]dp){
//        // special zero cases
//        if (ind == 0 && target == 0 && nums[0] == 0) return 2;
//        // Base cases
//        if(target==0) return 1;
//        if(ind==0) return (nums[0]==target)?1:0;

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
