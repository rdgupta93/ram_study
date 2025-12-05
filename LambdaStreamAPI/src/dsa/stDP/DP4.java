package dsa.stDP;

public class DP4 {
    public static void main(String[] args) {
        // Question :-Max sum of non adjacent element
        // ar[] ={3,4,8,1,9}  sum =9+8+3 =20

        int ar[] ={3,4,8,1,9};  // [5, 1, 1, 5],[3,4,8,1,9],[7, 7, 7, 7, 7]
        int n =ar.length;
        int dp[] = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        int ans = maxSumNonAdjc(ar,n-1,dp);
        System.out.println("Sum of non adjacent element: "+ans);

        System.out.println("Using tabulation form");

        dp[0]=ar[0];
        for(int i=1;i<n;i++){
            int pick =0;
            if(i>1) {
                pick = ar[i] + dp[i - 2];
            }
            int notPick = dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        System.out.println("Sum of non adjacent element: "+dp[n-1]);
    }

    private static int maxSumNonAdjc(int[] ar, int i, int[] dp) {

//        if(i==0){
//            return ar[0];
//        }
        if(i<0) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick =maxSumNonAdjc(ar,i-2,dp)+ar[i];
        int notPick = maxSumNonAdjc(ar,i-1,dp);
        dp[i]=Math.max(pick,notPick);
        return dp[i];
    }
}
