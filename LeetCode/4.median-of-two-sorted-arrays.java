
/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        double ans = 0;
        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;

        while (low <= high) {
            int pX = (low + high) / 2;
            int pY = (x + y + 1) / 2 - pX;

            int maxLeftX = (pX == 0) ? Integer.MIN_VALUE : nums1[pX - 1];
            int minRightX = (pX == x) ? Integer.MAX_VALUE : nums1[pX];

            int maxLeftY = (pY == 0) ? Integer.MIN_VALUE : nums2[pY - 1];
            int minRightY = (pY == y) ? Integer.MAX_VALUE : nums2[pY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    ans = ((Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0);
                    break;
                } else {
                    ans = (1.0 * Math.max(maxLeftX, maxLeftY));
                    break;
                }
            } else if (maxLeftX > minRightY) {
                high = pX - 1;
            } else {
                low = pX + 1;
            }
        }
        return ans;
    }
}
// @lc code=end
