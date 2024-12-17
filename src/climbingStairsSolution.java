// You are climbing a stair case. It takes n steps to reach to the top
// Each time you can either climb 1 or 2 steps In how many distinct ways you can climb to the top?

// Input: 2
// Output: 2

// Explaination: There are 2 ways to the top
// ntduy: Quy tac nhan, vi du n = 3, co bao nhieu cach de len duoc bac thang thu 3?
// F(3) = F(2)+F(1), F(2) = F(1) + F(0)
// F(1) = 1, F(0)= 1 => F(3) = F(2) + F(1) = F(1) + F(1) + F(0) = 2.F(1) + F(0) = 2+1 = 3.


public class climbingStairsSolution {
    public int climbStairs(int n) {
        System.out.println("Gia tri cua n: " + n);
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }
}
