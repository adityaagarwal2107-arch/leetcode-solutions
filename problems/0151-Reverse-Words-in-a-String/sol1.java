// ==========================================================
// 151. Reverse Words in a String
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 8 ms (Beats 35%)
// Memory     : 43.6 MB (Beats 98%)
// Link       : https://leetcode.com/problems/reverse-words-in-a-string/
// ==========================================================

class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\s+");
        int i=0;
        int j=arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
        return String.join(" ",arr);
    }
}