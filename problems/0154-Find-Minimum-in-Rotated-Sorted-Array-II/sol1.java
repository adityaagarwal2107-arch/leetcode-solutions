// ==========================================================
// 154. Find Minimum in Rotated Sorted Array II
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 8%)
// Memory     : 45.2 MB (Beats 10%)
// Link       : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
// ==========================================================

class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
        
    }
}