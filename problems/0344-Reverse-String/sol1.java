// ==========================================================
// 344. Reverse String
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 21%)
// Memory     : 48 MB (Beats 87%)
// Link       : https://leetcode.com/problems/reverse-string/
// ==========================================================

class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
    
            
        
        
    }
}