/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    // b a b a d
    // 0 1 2 3 4
    // len 3

    public static int checkfromi(String s, int i, int j) {
        int L = i;
        int R = j;
        while (L >= 0 && R < s.length() && (s.charAt(R) == s.charAt(L))) {
            L--;
            R++;

        }

        return (R - L - 1);

    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = checkfromi(s, i, i);
            int len2 = checkfromi(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = start + len - 1;
            }

        }
        return (s.substring(start, end + 1));

    }
}
// @lc code=end
