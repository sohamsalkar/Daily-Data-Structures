/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        // return (int) Math.sqrt((double) x);
        if (x == 0)
            return 0;
        int i = 0;
        for (i = 1; i * i <= x; i++) {
            if ((i <= x / i) && ((i + 1) * (i + 1) > x))
                return i;
        }
        return i;

    }
}
// @lc code=end
