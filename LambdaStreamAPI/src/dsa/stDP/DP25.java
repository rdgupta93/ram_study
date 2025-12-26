package dsa.stDP;

public class DP25 {
    public static void main(String[] args) {

       String s1 ="abzd";
       String s2 ="abdc";
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];

        int maxLen = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    maxLen = Math.max(maxLen, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        System.out.println("Length of max substring: "+maxLen);
    }
}
