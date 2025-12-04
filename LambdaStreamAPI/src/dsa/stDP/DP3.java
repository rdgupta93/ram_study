package dsa.stDP;

public class DP3 {

    public static void main(String[] args) {
        /*
        Frog Jump :- GFG
        Given an integer array height[] where height[i] represents the height of the i-th stair, a frog
        starts from the first stair and wants to reach the last stair. From any stair i, the frog has two
        options: it can either jump to the (i+1)th stair or the (i+2)th stair. The cost of a jump is the
        absolute difference in height between the two stairs. Determine the minimum total cost required
        for the frog to reach the last stair.

        Input: heights[] = [20, 30, 40, 20]
        Output: 20

        Explanation:  Minimum cost is incurred when the frog jumps from stair 0 to 1 then 1 to 3:
        jump from stair 0 to 1: cost = |30 - 20| = 10
        jump from stair 1 to 3: cost = |20 - 30| = 10
        Total Cost = 10 + 10 = 20
         */

        int heights[] = {30,20,50,10,40}; //[30,20,50,10,40],[20, 30, 40, 20]
        int n = heights.length;
        int dp[] = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        int ans = fogMinJump(heights,n-1,dp);
        System.out.println("min cost required for fog to reach last stair is: "+ans);

        System.out.println("Using Tabulation form");
        dp[0]=0;
        for(int i =1;i<n;i++){
            int oneStep = dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int twoStep =Integer.MAX_VALUE;
            if(i>1){
                twoStep =dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i] = Math.min(oneStep,twoStep);
        }
        System.out.println("min cost required for fog to reach last stair is: "+dp[n-1]);
    }

    private static int fogMinJump(int[] heights, int i, int[] dp) {

        if(i==0) return 0;
       // if(i==1) return Math.abs(heights[0]-heights[1]);

        if(dp[i]!=-1) return dp[i];
        int oneStep = fogMinJump(heights,i-1,dp)+Math.abs(heights[i]-heights[i-1]);
        int twoStep =Integer.MAX_VALUE;
        if(i>1) {
            twoStep = fogMinJump(heights, i - 2, dp) + Math.abs(heights[i] - heights[i - 2]);
        }
        dp[i] =Math.min(oneStep,twoStep);
        return dp[i];
    }
}
