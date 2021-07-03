/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {

        String X = Integer.toString(x);
        int i = 0;
        int j = X.length() - 1;
        while (i < j) {
            if (X.charAt(i++) != X.charAt(j--)) {
                return false;
            }
        }
        return true;

    }
}
// @lc code=end
