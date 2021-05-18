import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // -1 2 1 -4
        Arrays.sort(nums);
        // -4 -1 1 2 // 1
        int pclosest = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {

                int closest = nums[i] + nums[j] + nums[k];
                int ndiff = Math.abs(target - closest);
                if (ndiff < diff) {
                    diff = ndiff;
                    pclosest = closest;
                }
                if (target > closest) {
                    j++;
                } else if (target < closest) {
                    k--;
                } else {
                    closest = target;
                    break;
                }
            }
        }
        return pclosest;

    }
}
// @lc code=end
