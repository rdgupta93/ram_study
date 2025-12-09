package dsa.stDP;

import java.util.Arrays;

public class DP5 {

    public static void main(String[] args) {
        /*
        A ninja has planned a n-day training schedule. Each day he has to perform one
        of three activities - running, stealth training, or fighting practice. The same
         activity cannot be done on two consecutive days and the ninja earns a specific
          number of merit points, based on the activity and the given day.

        Given a n x 3-sized matrix, where matrix[i][0], matrix[i][1], and matrix[i][2],
         represent the merit points associated with running, stealth and fighting practice,
          on the (i+1)th day respectively. Return the maximum possible merit points that
          the ninja can earn

          A ninja has to train for n days.
          Each day he can do 1 of 3 activities:
          0 → Running
          1 → Stealth
          2 → Fighting

          Idea:-
          On each day, choose an activity that is not same as yesterday and gives maximum total points
          Define:
          dp[day][last] = max points from day 0..day where last = activity done yesterday

         Approach: Recursion + Memoization
         We try every possible activity on each day and choose the maximum points while making sure
         same activity is not repeated on consecutive days.
         We define a function:f(day, last)
        Maximum points from day 0 to 'day'
        such that the activity on previous day was 'last'
        Where:
        last = 0 → Running
        last = 1 → Stealth
        last = 2 → Fighting
        last = 3 → No activity chosen yet (for the first day)

        Recursive Logic:-
        For every day:
        1.For every day:
        2.Skip the one equal to last
        3.Add today’s merit + result of remaining days
        4.Memoize to avoid recomputation

         Examples:
         Input: matrix = [[10, 40, 70], [20, 50, 80], [30, 60, 90]]
        Output: 210
        Explanation:
        Day 1: fighting practice = 70
        Day 2: stealth training = 50
        Day 3: fighting practice = 90
        Total = 70 + 50 + 90 = 210
       This gives the optimal points.


         */

        int [][] matrix = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
        int days =3;
        int dp [][] = new int [days][4];
        for(int i=0;i<days;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(days-1,3,matrix,dp);
        System.out.println("Max point is: "+ans);
    }

    private static int solve(int days,int lastTask,int [][]matrix,int [][] dp){
        // base condition

        if(days==0){
            int maxi =0;
            for(int task=0;task<3;task++){
                if(task!=lastTask){
                    maxi = Math.max(maxi,matrix[0][task]);
                }
            }
            return maxi;
        }

        if(dp[days][lastTask]!=-1) return dp[days][lastTask];

        int maxi =0;
        for(int task =0;task<3;task++){
            if(task!=lastTask){
                int points = matrix[days][task]+solve(days-1,task,matrix,dp);
                maxi = Math.max(maxi,points);
            }
        }
        dp[days][lastTask] = maxi;
        return dp[days][lastTask];
    }
}
