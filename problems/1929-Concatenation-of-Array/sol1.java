// ==========================================================
// 1929. Concatenation of Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 98%)
// Memory     : 46.7 MB (Beats 95%)
// Link       : https://leetcode.com/problems/concatenation-of-array/
// ==========================================================

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans=new int[n*2];

        for (int i=0; i<n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}