// 26 ms | 46.6 MB
class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
       
        for(int i=0;i<n;i++){
           char c = s.charAt(i);
           if(s.indexOf(c) == s.lastIndexOf(c)) return i;
        }
        
        return -1;
    }
}