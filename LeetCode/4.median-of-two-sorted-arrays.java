/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int msize = nums1.length + nums2.length;
        // System.out.println(msize);
        int[] merged = new int[msize];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                k++;
                i++;
            } else {
                merged[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < nums1.length) {
            merged[k] = nums1[i];
            // System.out.println("1" + merged[k]);
            k++;
            i++;
        }
        while (j < nums2.length) {
            merged[k] = nums2[j];
            // System.out.println("2" + merged[k]);
            k++;
            j++;
        }
        double res;

        if (msize == 2) {
            res = merged[0] + merged[1];
            res = res / 2.0;
        } else if (msize % 2 == 0) {
            res = merged[(msize / 2) - 1] + merged[(msize / 2)];
            res = res / 2.0;
        } else {
            res = merged[msize / 2];
        }

        return res;
    }
}
// @lc code=end
