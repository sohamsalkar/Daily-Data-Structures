/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) // 2.0000 10
    {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double cp = x;

        // i 10 5 2 n1
        // cp 2 4 16 256
        // ans 1 4 4 1024
        for (long i = N; i > 0; i /= 2) {
            // System.out.println("cp " + cp + "i " + i);
            if ((i % 2) == 1) {
                ans = ans * cp;
                // System.out.println("ans" + ans);
            }
            cp = cp * cp;
        }
        return ans;
    }
}
// @lc code=end
