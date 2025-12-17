package dsa.stDP;

public class DP14 {
    public static void main(String[] args) {
        /*
        2035. Partition Array Into Two Arrays to Minimize Sum Difference
        You are given an integer array nums of 2 * n integers. You need to partition
        nums into two arrays of length n to minimize the absolute difference of the
        sums of the arrays. To partition nums, put each element of nums into one of the
         two arrays.

         Return the minimum possible absolute difference.
         Input: nums = [3,9,7,3]
         Output: 2
         Explanation: One optimal partition is: [3,9] and [7,3].
        The absolute difference between the sums of the arrays is abs((3 + 9) - (7 + 3)) = 2.

        Input: nums = [-36,36]
        Output: 72
         */
        int nums[] = {3,9,7,3};
        int n = nums.length;
        int sum =0;
        for(int i =0;i<n;i++){
            sum +=nums[0];
        }
        System.out.println("Sum: "+sum);
        boolean dp[][] = new boolean[n][sum+1];
        // base case
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        // base case
        if(nums[0]<= sum){
            dp[0][nums[0]]=true;
        }

        for(int ind =1;ind<n;ind++){
            for( int target =1;target<=sum;target++){
                boolean notTake = dp[ind-1][target];
                boolean take = false;
                if(target>=nums[ind]){
                    take = dp[ind-1][target-nums[ind]];
                }

                dp[ind][target] = take|| notTake;
            }
        }
        boolean arr[] = new boolean[sum+1];
        for(int i=0;i<=sum;i++){
            System.out.println(arr[i]=dp[n-1][i]);
        }
        int min = 100000000;
        for(int s1=0;s1<=sum/2;s1++){
            if(dp[n-1][s1]==true){
                System.out.println("s1 value: "+s1);
                min = Math.min(min,Math.abs((sum-s1)-s1));        // s2-s1--> (sum-s1)-s1;
            }
        }

        System.out.println("Minimize Sum Difference: "+min);
    }
}
