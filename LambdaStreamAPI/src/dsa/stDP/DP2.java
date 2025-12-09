package dsa.stDP;

import java.util.Arrays;

public class DP2 {
    public static void main(String[] args) {
        // climbs stair --> either 1 steps or 2 steps

        int n =3;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("no of ways climbs the stairs "+ stair(n,dp));
    }

    private static int stair(int n, int dp[]){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }

        if(dp[n]==-1){
            dp[n] = stair(n-1,dp)+stair(n-2,dp);
        }
        return dp[n];
    }
}
