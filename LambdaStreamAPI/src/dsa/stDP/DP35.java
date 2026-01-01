package dsa.stDP;

public class DP35 {
    public static void main(String[] args) {
        /*
        123. Best Time to Buy and Sell Stock III
        You are given an array prices where prices[i] is the price of a given stock on the
        ith day.
        Find the maximum profit you can achieve. You may complete at most two transactions.
        Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the
        stock before you buy again).
        Example 1:

        Input: prices = [3,3,5,0,0,3,1,4]
        Output: 6
        Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
        Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.

         */

        int [] prices = {3,3,5,0,0,3,1,4};
        int n = prices.length;
        int dp[][][] = new int[n][2][3];
        for(int i =0;i<n;i++){
            for(int j =0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        int ans = solve(0,1,n,2,dp,prices);
        System.out.println( "Ans is: "+ ans);

        System.out.println("Using tabulation");

        int dp1[][][] = new int[n+1][2][3];
        // base cases
        // cap==0;
        for(int ind=0;ind<=n;ind++){
            for(int buy=0;buy<2;buy++){
                dp1[ind][buy][0]=0;
            }
        }
        // ind =n;
        for(int buy=0;buy<2;buy++){
            for(int cap=0;cap<3;cap++){
                dp1[n][buy][cap]=0;
            }
        }
        System.out.println("n is :"+n);
        for(int ind =n-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<3;cap++){

                    if(buy==1){
                        dp1[ind][buy][cap] = Math.max((-prices[ind]+dp1[ind+1][0][cap]),0+dp1[ind+1][1][cap]);
                    }else{
                        dp1[ind][buy][cap] = Math.max((prices[ind]+dp1[ind+1][1][cap-1]),0+dp1[ind+1][0][cap]);
                    }

                }
            }
        }

        System.out.println("Ans is: "+ dp1[0][1][2]);

    }
    private static int solve(int ind,int buy,int n, int cap,int dp[][][],int [] prices){
        if(ind==n || cap==0) return 0;
        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
        int profit =0;

        if(buy==1){
            profit = Math.max((-prices[ind]+solve(ind+1,0,n,cap,dp,prices)),0+solve(ind+1,1,n,cap,dp,prices));
        }else{
            profit = Math.max((prices[ind]+solve(ind+1,1,n,cap-1,dp,prices)),0+solve(ind+1,0,n,cap,dp,prices));
        }

        return dp[ind][buy][cap]=profit;
    }
}
