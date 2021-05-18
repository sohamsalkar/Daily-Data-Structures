import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return Collections.emptyList();
        String[] L = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> comb = new LinkedList<>();
        comb.add("");
        for (char d : digits.toCharArray()) // 2
        {
            char[] letters = L[d - '0'].toCharArray(); // abc
            for (int i = comb.size(); i > 0; i--) {
                String s = comb.remove(0);
                for (char l : letters) {
                    comb.add(s + l);
                }
            }
        }
        return comb;
    }
}
// @lc code=end
