// ==========================================================
// 153. Find Minimum in Rotated Sorted Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 2%)
// Memory     : 44.3 MB (Beats 8%)
// Link       : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// ==========================================================

class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}