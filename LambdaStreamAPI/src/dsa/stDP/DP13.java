package dsa.stDP;

public class DP13 {
    public static void main(String[] args) {
        /*
        416. Partition Equal Subset Sum
        Given an integer array nums, return true if you can partition the array into two subsets such
        that the sum of the elements in both subsets is equal or false otherwise.

        Example 1:
        Input: nums = [1,5,11,5]
        Output: true
        Explanation: The array can be partitioned as [1, 5, 5] and [11].
         */

        int nums [] = {1,2,3,5};//{1,5,11,5},{1,2,3,5}
        int totalSum =0;
        for(int i=0;i<nums.length;i++){
            totalSum+= nums[i];
        }
        if(totalSum%2==1){
            System.out.println("false");
            return;
        }
        int n = nums.length;
        int targetSum = totalSum/2;
        Boolean dp[][] = new Boolean[n][targetSum+1];
        Boolean ans = solve(nums,n-1,dp,targetSum);
        if(ans) System.out.println("True");
        else System.out.println("False");
    }

    private static Boolean solve(int nums[],int i,Boolean [][]dp,int targetSum){
      // Base case
        if(targetSum==0) return true;
        if(i==0)return nums[0]==targetSum;

        if(dp[i][targetSum]!=null){
            return dp[i][targetSum];
        }
        Boolean pick = false;
        if(targetSum>=nums[i]) {
             pick = solve(nums, i - 1, dp, targetSum - nums[i]);
        }
        Boolean notPick = solve(nums,i-1,dp,targetSum);
        dp[i][targetSum] = pick||notPick;
        return dp[i][targetSum];
    }
}
