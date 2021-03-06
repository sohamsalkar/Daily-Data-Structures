import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=220 lang=java
 *
 * [220] Contains Duplicate III
 */

// @lc code=start
class Solution {
    private long getID(long x, long w) {
        return x < 0 ? (x + 1) / w - 1 : x / w;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0)
            return false;
        Map<Long, Long> d = new HashMap<>();
        long w = (long) t + 1;
        for (int i = 0; i < nums.length; ++i) {
            long m = getID(nums[i], w);

            if (d.containsKey(m))
                return true;
            if (d.containsKey((m - 1)) && Math.abs(nums[i] - d.get(m - 1)) < w)
                return true;
            if (d.containsKey((m + 1)) && Math.abs(nums[i] - d.get(m + 1)) < w)
                return true;
            System.out.println(" m " + m + " nums " + nums[i]);
            d.put(m, (long) nums[i]);
            if (i >= k)
                d.remove(getID(nums[i - k], w));

        }
        return false;

    }
}
// @lc code=end
