package dsa.stDP;

public class DP36 {
    public static void main(String[] args) {
        /*
        188. Best Time to Buy and Sell Stock IV
        You are given an integer array prices where prices[i] is the price of a given
        stock on the ith day, and an integer k.
        Find the maximum profit you can achieve. You may complete at most k transactions:
         i.e. you may buy at most k times and sell at most k times.

         Note: You may not engage in multiple transactions simultaneously (i.e., you
         must sell the stock before you buy again).

         Example 1:

         Input: k = 2, prices = [2,4,1]
         Output: 2
         Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit =
          4-2 = 2.
         */

        int [] prices = {2,4,1};
        int k =2;

        int n = prices.length;
        int dp1[][][] = new int[n+1][2][k+1];
        // base cases
        // (k)cap==0;
        for(int ind=0;ind<=n;ind++){
            for(int buy=0;buy<2;buy++){
                dp1[ind][buy][0]=0;
            }
        }
        // ind =n;
        for(int buy=0;buy<2;buy++){
            for(int cap=0;cap<=k;cap++){
                dp1[n][buy][cap]=0;
            }
        }
        System.out.println("n is :"+n);
        for(int ind =n-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<k+1;cap++){

                    if(buy==1){
                        dp1[ind][buy][cap] = Math.max((-prices[ind]+dp1[ind+1][0]
                                [cap]),0+dp1[ind+1][1][cap]);
                    }else{
                        dp1[ind][buy][cap] = Math.max((prices[ind]+dp1[ind+1][1]
                                [cap-1]),0+dp1[ind+1][0][cap]);
                    }

                }
            }
        }

        System.out.println("Ans is "+ dp1[0][1][k]);
    }

}
