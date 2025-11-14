package dsa.dynamicprogramming;

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
}
