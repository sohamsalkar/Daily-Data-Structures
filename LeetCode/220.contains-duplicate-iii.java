/*
 * @lc app=leetcode id=220 lang=java
 *
 * [220] Contains Duplicate III
 */

// @lc code=start
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; Math.abs(i - j) <= k && j < nums.length; j++) {
                long q1 = nums[i];
                long q2 = nums[j];
                if (Math.abs(q1 - q2) <= t) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;

    }
}
// @lc code=end
