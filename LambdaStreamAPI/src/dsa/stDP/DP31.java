package dsa.stDP;

public class DP31 {
    public static void main(String[] args) {
        /*
        Edit Distance / Levenshtein Distance
        Edit Distance = Minimum number of operations needed to convert one string into another
        Allowed operations:
        Insert a character : i - we can insert any char in s1 at any pos
        Delete a character : d - we can delete any char in s1 at any pos
        Replace a character: r - we can replace any char in s1 at any pos , with any char
        s1: l e a f d
        s2: l g f
        s1-> delete e  , replace a with g , delete d  --> 3 ops

        edit (s1[0-4] s2[0-2])
        if(s1[0] ==s2[0]) // char match
            edit(s1[1-4]s2[1-2)
        s1[1]!=s2[1]     // if char not matched

        ops: insert                  ops :replace                      ops:delete
        1  2  3  4  5
        s1: l g e  g  f  d            e is replace with g              e is deleted
        s2: l  g  f
        edit(s1[1-4]s2[2-2])+1       edit(s1[2-4]s2[2-2])+1            edit(s1[2-4]s2[1-2])+1
        // hypothetically insert g
        hence s1[1-4]


        Base cond:
        if(i==N && j==M){
            return 0;            // Both are exhausted ;s1="",s2=""
        }
        if(i==n){// s1=""; s1 is exhausted
            return m-j // s2= j j+1 ....m-1 ;  b-a +1 = m-1+j+1 =m-j
        }
        if(j==m){ //s2=""; s2 is exhausted
            return n-i; s1=i i+1 .......n-1; n-i;
        }

        Question 7:
         */

        String s1= "leafd";
        String s2="lgf";
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] =-1;
            }
        }
        int ans = minEditDistance(n-1,m-1,s1,s2,dp);
        System.out.println("Minimum number of operations needed to convert one string into another is: "+ans);
        System.out.println(s1+ " "+s2+" "+n+" "+m);
        System.out.println("Using tabulation"); // convert to 1 based indexing
        int dp1[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++)dp1[i][0] = i;
        for(int j=0;j<=m;j++)dp1[0][j] =j;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                if(s1.charAt(i-1)==s2.charAt(j-1)) dp1[i][j] = dp1[i-1][j-1];
                else {
                    dp1[i][j] = 1 + Math.min(dp1[i - 1][j],Math.min(dp1[i][j - 1], dp1[i - 1][j - 1]));
                }

            }
        }

        System.out.println("Ans is : "+dp1[n][m]);
    }
    private static int minEditDistance(int i,int j,String s1,String s2,int [][]dp){
        // base case
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j)) dp[i][j] = minEditDistance(i-1,j-1,s1,s2,dp);
        else {
            dp[i][j] = 1 + Math.min(minEditDistance(i - 1, j, s1, s2, dp),
                    Math.min(minEditDistance(i, j - 1, s1, s2, dp), minEditDistance(i - 1, j - 1, s1, s2, dp)));
        }

        return dp[i][j];
    }
}
