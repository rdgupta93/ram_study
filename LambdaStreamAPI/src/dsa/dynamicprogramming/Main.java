package dsa.dynamicprogramming;

public class Main {
    /*
    - While solving problems with the help of subproblems
    - If same sub problem is solved again & again ,apply DP
    Dynamic Problem -
    Solve a sub problem for 1st time, store it & re use it , if its called again

    -- Find the Fibanacci number
    0  1  2  3  4  5  6  7  8  9
    0  1  1  2  3  5  8  13 21 34

    int fib(int n){
    if(n<=1){return n}
    return fib(n-1)+fib(n-2);

    fib(5) --> fib(4) +fib(3)
    fib(4) --> fib(3)+fib(1)
    fib(3) --> fib(2) +fib(1)   // overlapping problem

    --Optimize with fibanacci with dp
    dp[i] = ith fibanacci number
    dp[n] = nth fibanacci number
    - create the dp[n+1] = -1  // create the dp with size n+1 and initialize with invalid value

    - TC - No. of distinct sub problems * TC for each sub problems
     */

    static int fib(int n,int [] dp){
       if(n<=1){
           return n;
       }
       if(dp[n]==-1){
           dp[n] = fib(n-1,dp)+fib(n-2,dp);
       }
       return dp[n];
    }

    public static int climbStrairs(int n,int [] dp){
        if(n<=1){
            return 1;
        }
        if(dp[n]==-1){
            dp[n] = climbStrairs(n-1,dp)+climbStrairs(n-2,dp);
        }

        return dp[n];
    }

    public static int countMinSqaure(int n ,int [] dp){
        if(n==0){
            return 0;
        }
        if(dp[n]==-1){
            int i =1;
            int ans = Integer.MAX_VALUE;
            while(i*i<=n){
                ans = Math.min(ans,countMinSqaure(n-i*i,dp));
                i=i+1;
            }
            dp[n] = ans+1;
        }
        return dp[n];
        /*
        n-i*i   -> for example n =40  we can reach 40 from 40-1*1,40-2*2, 40-3*3,40-4*4,
        40-5*5,40-6*6, 40-7*7(cond fail) while(n-i*i>0)--> n>i*i
         */
    }

    public static void main(String[] args) {
     // Ques - Nth fibannacci number
      int dp[] = new int[7];
      for(int i=0;i<7;i++){
          dp[i]=-1;
      }
      int fib = fib(6,dp);
        System.out.println(fib);

      // Ques 2 You are climbing a staircase and it takes A steps to reach the top.
      //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
       int dp1 [] = new int[6];
       for(int i=0;i<6;i++){
           dp1[i] =-1;
       }
      int stair = climbStrairs(5,dp1);
        System.out.println("stairWay "+stair);


      // Ques - Given an integer A. Return minimum count of numbers, sum of whose squares is equal to A.
      //  A = 6 , --> 2 square + 1 square + 1 square = 3
      int dp2 [] = new int[7];
      for(int i=0;i<7;i++){
          dp2[i] = -1;
      }
      int countMinSqaure = countMinSqaure(6,dp2);
        System.out.println(countMinSqaure);
    }
}
