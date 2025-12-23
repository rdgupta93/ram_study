package dsa.stDP;

import java.util.Arrays;

public class DP19 {
    public static void main(String[] args) {
        /*
        494. Target Sum
        You are given an integer array nums and an integer target.
        You want to build an expression out of nums by adding one of the symbols '+' and '-'
        before each integer in nums and then concatenate all the integers.
        For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and
        concatenate them to build the expression "+2-1".
        Return the number of different expressions that you can build, which evaluates to target.
        Input: nums = [1,1,1,1,1], target = 3
        Output: 5
        Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
        -1 + 1 + 1 + 1 + 1 = 3
        +1 - 1 + 1 + 1 + 1 = 3
        +1 + 1 - 1 + 1 + 1 = 3
        +1 + 1 + 1 - 1 + 1 = 3
        +1 + 1 + 1 + 1 - 1 = 3
         */

        int arr[] = {1,1,1,1,1};

        int diff = 3;
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
