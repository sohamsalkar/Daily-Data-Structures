import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=166 lang=java
 *
 * [166] Fraction to Recurring Decimal
 */

// @lc code=start
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0)
            return "0";

        StringBuilder fr = new StringBuilder();
        if ((numerator < 0 || denominator < 0) && (!(numerator < 0 && denominator < 0)))
            fr.append("-");

        long num = Math.abs(Long.valueOf(numerator));
        long den = Math.abs(Long.valueOf(denominator));
        fr.append(Long.toString(num / den));
        long rem = num % den;
        if (rem == 0)
            return fr.toString();
        fr.append(".");
        Map<Long, Integer> ch = new HashMap<>();
        while (rem != 0) {
            if (ch.containsKey(rem)) {
                fr.insert(ch.get(rem), "(");
                fr.append(")");
                break;
            }
            ch.put(rem, fr.length());
            rem = rem * 10;
            fr.append(Long.toString(rem / den));
            rem = rem % den;
        }
        return fr.toString();
    }
}
// @lc code=end
