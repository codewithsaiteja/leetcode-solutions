// 0 ms | 46.1 MB
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int n = letters.length;
        int r = n - 1;
   
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(letters[mid] > target){ 
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return letters[l % n];
    }
}