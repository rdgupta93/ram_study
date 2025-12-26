package dsa.stDP;

public class DP24 {

    public static void main(String[] args) {
        /*
        Print Longest Common Subsequence

        String text1 = "abcden", text2 = "acen";
        char []s1 =text1.toCharArray();
        char []s2 = text2.toCharArray();
        int n = s1.length;
        int m = s2.length;

        int dp2 [][] = new int[n+1][m+1];
        // base case ;
        for(int j=0;j<=m;j++){
            dp2[0][j]=0;
        }
        for(int i=0;i<=n;i++){
            dp2[i][0]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(s1[i-1]==s2[j-1]) dp2[i][j] = 1+dp2[i-1][j-1];
                else{
                    dp2[i][j] = Math.max(dp2[i-1][j],dp2[i][j-1]);
                }
            }
        }

        System.out.println("Ans using tabulation is: "+dp2[n][m]);
         */

        String text1 = "abcden", text2 = "acen";
        char []s1 =text1.toCharArray();
        char []s2 = text2.toCharArray();
        int n = s1.length;
        int m = s2.length;

        int dp2 [][] = new int[n+1][m+1];
        // base case ;
        for(int j=0;j<=m;j++){
            dp2[0][j]=0;
        }
        for(int i=0;i<=n;i++){
            dp2[i][0]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(s1[i-1]==s2[j-1]) dp2[i][j] = 1+dp2[i-1][j-1];
                else{
                    dp2[i][j] = Math.max(dp2[i-1][j],dp2[i][j-1]);
                }
            }
        }

        System.out.println("Ans using tabulation is: "+dp2[n][m]);

        StringBuilder sb = new StringBuilder();
        int i=n,j=m;
        while(i>0 && j>0){
            if(s1[i-1]==s2[j-1]) {
                sb.append(s1[i - 1]);
                i--;
                j--;
            } else if (dp2[i-1][j]>dp2[i][j-1]) {
                i--;
            }else {
                j--;
            }

        }

        System.out.println(sb.reverse().toString());
    }
}
