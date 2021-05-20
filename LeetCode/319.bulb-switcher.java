/*
 * @lc app=leetcode id=319 lang=java
 *
 * [319] Bulb Switcher
 */

// @lc code=start
//   0 0 0 0 0 0 
//1  1 1 1 1 1 1
//2  1 _ 1 _ 1 _
//3  1 0 _ 0 1 _
//4  1 0 0 _ 1 1
//5  1 0 0 1 _ 1
//6  1 0 0 1 0 _

class Solution {

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}

//
// @lc code=end
