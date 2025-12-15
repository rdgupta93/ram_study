package dsa.dynamicprogramming;

public class DPPattern {
    /*
    The 18 Core Dynamic Programming Patterns

    LEVEL 1: FOUNDATION PATTERNS
    1. 1D DP (Linear DP)
    State depends on previous indices.
    form
    dp[i] = best answer using elements [0..i]
    Used for:-
    - Counting ways
    - Min / Max till index

    Examples:-
    Fibonacci
    Climbing Stairs
    House Robber


    2. 2D Grid DP
    State depends on row and column.
    Form
    dp[i][j] = best answer to reach cell (i, j)

    Examples:-
    Unique Paths
    Minimum Path Sum
    Dungeon Game

    3. Take / Not Take (Subsequence DP)
    Each element has two choices.
    Form
    dp[i][target] = can we form target using first i elements

    Examples:-
    Subset Sum
    Partition Equal Subset Sum
    0/1 Knapsack

    4. Unbounded Knapsack DP
    Same element can be reused multiple times.
    Examples
    Coin Change
    Rod Cutting
    Integer Break

    LEVEL 2: CORE INTERVIEW PATTERNS
    5. Knapsack Variants
    Optimizing value under capacity constraints.
    Variants
    0/1 Knapsack
    Unbounded Knapsack
    Bounded Knapsack

    6. LIS Pattern (Increasing Sequence DP)
    Order matters; choose increasing elements.
    Form
    dp[i] = LIS ending at index i

    Examples:-
    Longest Increasing Subsequence
    Longest Bitonic Subsequence
    Russian Doll Envelopes

    7. String DP (Two-String DP)
    State uses two pointers.
    Form
    dp[i][j] = answer using s1[0..i] and s2[0..j]

    Examples:-
    Longest Common Subsequence
    Edit Distance
    Longest Common Substring

    8. Palindrome DP
    State defined over a substring.
    Form
    dp[i][j] = answer for substring s[i..j]

    Examples:-
    Longest Palindromic Subsequence
    Palindrome Partitioning

    LEVEL 3: ADVANCED DP PATTERNS
    9. DP on Subsequences (Counting DP)
    Count the number of valid subsequences.

    Examples:-
    Distinct Subsequences
    Count Palindromic Subsequences

    10. Interval DP (Range DP)
    Split interval into subproblems.
    Form
    dp[i][j] = best answer for range [i..j]

    Examples:-
    Matrix Chain Multiplication
    Burst Balloons
    Minimum Cost to Cut a Stick

    11. Tree DP
    DP combined with DFS on trees.

    Examples:-
    House Robber III
    Tree Diameter
    Maximum Path Sum in Tree

    12. DP on Graphs (DAG DP)
    DP over Directed Acyclic Graphs.

    Examples:-
    Longest Path in DAG
    DP using Topological Sort

    LEVEL 4: PRO / CONTEST-LEVEL PATTERNS
    13. Bitmask DP
    State represented using bitmask.
    Form
    dp[mask][i]

    Examples:-
    Traveling Salesman Problem
    Assignment Problem

    14. Digit DP
    DP on digits of a number under constraints.
    Examples:
    Count numbers with digit constraints
    Sum of digits in a range

    15. State Compression DP
    Reduce large states into compact form
    Examples:
    N-Queens
    Grid with small width

    16. Probability DP
    DP involving expected values.
    Examples:-
    Dice roll problems
    Random walk DP

    17. Game DP (Minimax DP)
    Two-player optimal decision-making.
    Examples
    Stone Game
    Predict the Winner

    18. DP Optimization Techniques
    Improve time or space complexity.
    Techniques:-
    Space Optimization
    Prefix/Suffix DP
    Binary Lifting
    Convex Hull Trick


    **** 60-PROBLEM DP MASTER LIST (PATTERN-WISE) ***
    FOUNDATION (20 Problems)
   Pattern 1: 1D DP (Linear)
   Climbing Stairs
   House Robber
   Min Cost Climbing Stairs
   Decode Ways

   Pattern 2: Grid DP
   Unique Paths
   Unique Paths II
   Minimum Path Sum
   Dungeon Game

   Pattern 3: Take / Not Take
   Subset Sum
   Partition Equal Subset Sum
   Target Sum
   0/1 Knapsack

   Pattern 4: Unbounded Knapsack
   Coin Change I
   Coin Change II
   Rod Cutting
   Perfect Squares

   🟡 INTERVIEW CORE (20 Problems)
   Pattern 5: LIS Pattern
   Longest Increasing Subsequence
   Longest Bitonic Subsequence
   Russian Doll Envelopes

   Pattern 6: String DP (Two Strings)
   Longest Common Subsequence
   Edit Distance
   Longest Common Substring

   Pattern 7: Palindrome DP
   Longest Palindromic Subsequence
   Palindrome Partitioning II
   Count Palindromic Substrings

   Pattern 8: Counting Subsequences
   Distinct Subsequences
   Count All Palindromic Subsequences

   🟠 ADVANCED CORE (20 Problems)
   Pattern 9: Interval DP
   Matrix Chain Multiplication
   Burst Balloons
   Minimum Cost to Cut Stick

   Pattern 10: Tree DP
   House Robber III
   Binary Tree Maximum Path Sum

   Pattern 11: DAG DP
   Longest Path in DAG
   Course Schedule III

   Pattern 12: Bitmask DP
   Traveling Salesman
   Assignment Problem

   ***** 2️⃣ JAVA DP TEMPLATES (COPY–PASTE READY)******
   Template 1: Memoization (Top-Down)
   int[] dp;

      int solve(int i) {
         if (i < 0) return 0;
         if (dp[i] != -1) return dp[i];

         int take = solve(i - 2) + nums[i];
         int notTake = solve(i - 1);

        return dp[i] = Math.max(take, notTake);
      }

     ✅ Template 2: Tabulation (Bottom-Up)
            int[] dp = new int[n];
             dp[0] = nums[0];

             for (int i = 1; i < n; i++) {
             int take = nums[i] + (i > 1 ? dp[i - 2] : 0);
             int notTake = dp[i - 1];
             dp[i] = Math.max(take, notTake);
          }

      ✅ Template 3: Take / Not Take (2D DP)
      boolean[][] dp = new boolean[n + 1][target + 1];
      dp[0][0] = true;

      for (int i = 1; i <= n; i++) {
        for (int t = 0; t <= target; t++) {
          boolean notTake = dp[i - 1][t];
          boolean take = t >= arr[i - 1] && dp[i - 1][t - arr[i - 1]];
          dp[i][t] = take || notTake;
         }
       }

      ✅ Template 4: Interval DP
      for (int len = 2; len <= n; len++) {
           for (int i = 0; i + len - 1 < n; i++) {
               int j = i + len - 1;
               dp[i][j] = Integer.MAX_VALUE;
               for (int k = i; k < j; k++) {
                  dp[i][j] = Math.min(dp[i][j],
                  dp[i][k] + dp[k + 1][j] + cost);
            }
         }
       }

      ✅ Template 5: LIS (O(n²))
            int[] dp = new int[n];
             Arrays.fill(dp, 1);

            for (int i = 0; i < n; i++) {
                 for (int j = 0; j < i; j++) {
                    if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
             }
           }
         }

   How Experts Read DP Problems (Mental Checklist)
   When you read a problem, ask ONLY this:
   1️⃣ What are the choices?
   Pick / Not Pick → Knapsack
   Move right/down → Grid DP
   Split range → Interval DP
   Two strings → String DP

   2️⃣ What changes in state?
   Index → 1D DP
   Index + target → 2D DP
   i, j → String / Interval DP
   mask → Bitmask DP

   3️⃣ What is asked?
   Max / Min → Optimization DP
   Count → Counting DP
   True / False → Boolean DP

********** LeetCode Question List based on above Pattern *********
    🟢 1️⃣ 1D DP (Linear DP)
   70.Climbing Stairs
   746.Min Cost Climbing Stairs
   198.House Robber
   213.House Robber II
   91.Decode Ways
   790.Domino and Tromino Tiling

🟢 2️⃣ 2D Grid DP
  62.Unique Paths
  63.Unique Paths II
  64.Minimum Path Sum
  120.Triangle
  931.Minimum Falling Path Sum
  174.Dungeon Game

🟢 3️⃣ Take / Not Take (Subsequence DP)
  416.Partition Equal Subset Sum
  494.Target Sum
  139.Word Break
  343.Integer Break
  1049.Last Stone Weight II

🟢 4️⃣ Unbounded Knapsack DP
  322.Coin Change
  518.Coin Change II
  279.Perfect Squares
  377.Combination Sum IV

🟡 5️⃣ Knapsack Variants (0/1, Bounded)
    474.Ones and Zeroes
    879.Profitable Schemes
    1043.Partition Array for Maximum Sum

🟡 6️⃣ LIS Pattern (Increasing Sequence DP)
    300.Longest Increasing Subsequence
    673.Number of Longest Increasing Subsequence
    354.Russian Doll Envelopes
    1626.Best Team With No Conflicts

🟡 7️⃣ String DP (Two Strings)
   1143.Longest Common Subsequence
   583.Delete Operation for Two Strings
   72.Edit Distance
   97.Interleaving String

🟡 8️⃣ Palindrome DP
     516.Longest Palindromic Subsequence
     647.Palindromic Substrings
     132.Palindrome Partitioning II
     131.Palindrome Partitioning

🟠 9️⃣ DP on Subsequences (Counting DP)
   115.Distinct Subsequences
   940.Distinct Subsequences II
   730.Count Different Palindromic Subsequences

🟠 🔟 Interval DP (Range DP)
   312.Burst Balloons
   1039.Minimum Score Triangulation of Polygon
   1547.Minimum Cost to Cut a Stick
   1130.Minimum Cost Tree From Leaf Values

🟠 1️⃣1️⃣ Tree DP
   337.House Robber III
   124.Binary Tree Maximum Path Sum
   968.Binary Tree Cameras
   543.Diameter of Binary Tree

🟠 1️⃣2️⃣ DP on Graphs (DAG DP)
   329.Longest Increasing Path in a Matrix
   1335.Minimum Difficulty of a Job Schedule
   2050.Parallel Courses III

🔴 1️⃣3️⃣ Bitmask DP
   847.Shortest Path Visiting All Nodes
   943.Find the Shortest Superstring
   698.Partition to K Equal Sum Subsets

🔴 1️⃣4️⃣ Digit DP
   233.Number of Digit One
   902.Numbers At Most N Given Digit Set
   1012.Numbers With Repeated Digits

🔴 1️⃣5️⃣ State Compression DP
   526.Beautiful Arrangement
   1655.Distribute Repeating Integers

🔴 1️⃣6️⃣ Probability DP
   837.New 21 Game
   808.Soup Servings
   688.Knight Probability in Chessboard

🔴 1️⃣7️⃣ Game DP (Minimax DP)
   486.Predict the Winner
   877.Stone Game
   1140.Stone Game II
   1406.Stone Game III

🔴 1️⃣8️⃣ DP Optimization Techniques
   123.Best Time to Buy and Sell Stock III
   188.Best Time to Buy and Sell Stock IV
   689.Maximum Sum of 3 Non-Overlapping Subarrays
   1425.Constrained Subsequence Sum


    ********* Codeforces Ranks (Important) **********

| Rating Range  | Title                |
| ------------- | -------------------- |
| < 1200        | Newbie               |
| 1200–1399     | Pupil                |
| 1400–1599     | Specialist           |
| 1600–1899     | Expert               |
| **1900–2199** | **Master** 🔥        |
| 2200–2399     | Candidate Master     |
| 2400–2599     | International Master |
| 2600+         | Grandmaster          |

1️⃣ TYPES OF CODEFORCES CONTESTS (IN DEPTH)
Codeforces is contest-first, so understanding contest types is crucial.
🔵 1. Divisional Contests (MOST IMPORTANT)
🔹 Codeforces Div 3
Audience: Beginners → Early Intermediate
Problems: A, B, C, D, E, F
Difficulty:
A, B → Easy
C → Easy–Medium
D → Medium
E/F → Medium–Hard
📌 Best starting point for you
Why?
Problems are simpler
Statements are clearer
No heavy math initially
👉 Think of Div3 as:
LeetCode Easy + Medium in contest format

🔹 Codeforces Div 2
Audience: Intermediate → Advanced
Problems: A, B, C, D, E, F
Difficulty:
A → Easy
B → Easy–Medium
C → Medium
D → Medium–Hard
E/F → Hard
📌 Div2 is split by rating:
| Rating | Can participate |
| ------ | --------------- |
| < 2100 | Div2            |
| ≥ 2100 | Div1            |

🔹 Codeforces Div 1
Audience: Experts, Masters, GMs
Problems: A, B, C, D
Difficulty: Hard to Insane
❌ Not for you now
Even strong MAANG engineers struggle here.

🟢 2. Educational Codeforces Rounds (BEST FOR LEARNING)
🔹 Educational Rounds
Purpose: Learning
Difficulty: Progressive
Editorial: Very high quality
Structure:
A → very easy
B → easy
C → medium
D → medium-hard
E → hard
📌 These are GOLD for beginners
👉 Start HERE if confused.


2️⃣ WHERE YOU SHOULD START (BASED ON YOUR PROFILE)
You shared:
Strong LeetCode fundamentals
Deep DP focus ongoing
Java-only experience
New to Codeforces UI

✅ PERFECT STARTING POINT FOR YOU
Phase 1 (First 2–3 weeks)
👉 Practice Mode ONLY
Do:
Codeforces Problemset
Filter by:
Rating: 800–1200
Tags: implementation, greedy, dp (easy)
Solve:
2–3 problems/day
Ignore speed
Focus on input/output handling
Phase 2 (Weeks 4–6)

👉 Virtual Div3 contests
Target:
Solve A, B, C
Try D, don’t worry if fail
After contest:
Read editorial
Re-code 1 problem next day
Phase 3 (Weeks 7–10)

👉 Educational Rounds (Virtual)
Target:
Solve A, B, C
Understand D
This is where DP + Graph confidence builds.
Phase 4 (Later)
👉 Div2 contests
Target:
A, B guaranteed
C often
D sometimes

3️⃣ JAVA vs C++ CONFUSION (VERY IMPORTANT)
This confusion stops MANY people.
Let me be very clear.

WHEN JAVA FEELS HARD ON CODEFORCES
Because:
CF problems have huge input
Java Scanner is slow
You must use Fast I/O
This is NOT a language issue.
It’s a setup issue.




















     */
}
