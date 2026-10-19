// ==========================================================
// 169. Majority Element
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 79%)
// Memory     : 62.8 MB (Beats 38%)
// Link       : https://leetcode.com/problems/majority-element/
// ==========================================================

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=0;

        for (int i=0; i<nums.length; i++) {
            if (count==0) {
                majority=nums[i];
            }
            if (nums[i] ==majority){
                count++;
            } else{
                count--;
            }
        }
        return majority;
    }
}