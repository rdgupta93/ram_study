package dsa.dynamicprogramming;

import org.w3c.dom.ls.LSOutput;

public class DP3 {
    public static void main(String[] args) {
        /*
        0/1 knapsack
        Ques 1) Given N items each with a weight and value find the max value
        which can be obtained by picking items such that , total weight of
        all items<=k
        Note 1: Every item can be picked at max 1 times
        Note 2: We can not take a part of item
        N =4 items K=50
        items : 0      1       2       3
       weigh[]: 20    10      30      40
       value[]: 100   60     120      150
        v/w   : 5     6      4        3.75
       ans = 20+30 = 100+120 =120

                   kp(0-4,50)
            not take it         take it
            kp(0-3,50)             kp(0-3,50-40)+150

            DP state :- from 0.....i with max capacity as cap what is my max value
            DP expression :- Using the dp table get the value
         */

//        int w[] = {4,1,5,4,3,7,4};
//        int v[] ={3,2,8,3,7,10,5};
//        int k =15;
//        int w[] = {2,3,4};
//        int v[] = {1,2,5};
//        int k =3;
        int w[] = {5,10};
        int v[] ={10,20};
        int k =6;
        int n = w.length;
        int dp[][] = new int [n][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<k+1;j++){
                dp[i][j]=-1;
            }
        }
        int ans = solve(w,v,k,dp,n-1);
        System.out.println("Ans is: "+ans);

          /*
    TC :- no of state * TC per state
    (N*K)*O(1)
    O(N*K)
    SC :-O(N*K) -->  Due to dp table
     */

        // Quest 2 :- Same as above question , we can pick an element as many times
        // as we want
        /*
        N=7,k(cap)=15
        w[] = 4  1   5   4   3  7   4
        v[] = 3  2   8   3   7  10   5
             kpI(0-6,15)
        not picked         picked
       kpI(0-5,15)         kpI(0-6,15-4)+5

       Generalised :
       items : 0    1     2     3   ........i-1   i
       weight: w0   w1    w2    w3  ........wi-1  wi

                        dp(i,cap)
                 // not picked       //picked
                 dp(i-1,cap)         dp(i,cap-w[i])+v[i]
         */

        int w1[] = {4,1,5,4,3,7,4};
        int v1[] ={3,2,8,3,7,10,5};
        int cap =15;
        int n1 = w1.length;
        int dp1[][] = new int [n1][cap+1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<cap+1;j++){
                dp1[i][j]=-1;
            }
        }
        int ans1 = solve1(w1,v1,n1-1,dp1,cap);
        System.out.println("Ans2 for infinite knapsack is: "+ans1);
    }


    public static int solve(int []w,int []v,int cap,int dp[][],int i){
        if(i<0 || cap==0){
            return 0;
        }
        if(dp[i][cap]==-1){
            int notTake = solve(w,v,cap,dp,i-1);
            dp[i][cap] = notTake;
            if(w[i]<=cap) {
                dp[i][cap] = Math.max(notTake, solve(w, v, cap - w[i], dp, i - 1) + v[i]);
            }
        }


        return dp[i][cap];
    }

    public static int solve1(int w1[],int v1[],int i,int dp1[][],int cap){
        if(i<0 || cap==0){
            return 0;
        }
        if(dp1[i][cap]==-1){
            int notTaken = solve1(w1,v1,i-1,dp1,cap);
            dp1[i][cap]=notTaken;
            if(cap>=w1[i]){
                dp1[i][cap] = Math.max(notTaken,solve1(w1,v1,i,dp1,cap-w1[i])+v1[i]);
             }
        }

        return dp1[i][cap];
    }
}
