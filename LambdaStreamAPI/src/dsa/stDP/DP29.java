package dsa.stDP;

public class DP29 {
    public static void main(String[] args) {
        /*
        Shortest Common Supersequence | DP on Strings
        Given two strings str1 and str2, return the shortest string that has both str1 and str2
        as subsequences. If there are multiple valid strings, return any of them.

        A string s is a subsequence of string t if deleting some number of characters from t (possibly 0)
        results in the string s.

        Example 1:
        Input: str1 = "abac", str2 = "cab"
        Output: "cabac

        Explanation:
        str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
        str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
        The answer provided is the shortest such string that satisfies these properties.
         */

        String s1 = "abac";
        String s2 ="cab";
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++) dp[i][0]=0;
        for(int j =0;j<=m;j++)dp[0][j] =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        System.out.println("print dp table");
        for(int i=0;i<=n;i++){
            for(int j =0;j<=m;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        int i=n,j=m;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            } else if (dp[i-1][j]>dp[i][j-1]) {
                sb.append(s1.charAt(i-1));
                i--;
            }else{
              sb.append(s2.charAt(j-1));
              j--;
            }
        }

        while(i>0){
            sb.append(s1.charAt(i-1));
            i--;
        }
        while (j>0){
            sb.append(s2.charAt(j-1));
            j--;
        }

        System.out.println(sb.reverse().toString());
    }
}
