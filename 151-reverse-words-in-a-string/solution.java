// 8 ms | 43.3 MB
class Solution {
    public String reverseWords(String s) {
        
        String[] w = s.trim().split("\\s+");
        int n = w.length;

        String[] revw = new String[n];
        for(int i = 0;i<n;i++){
            revw[i] = w[n - i - 1];
        }
        return String.join(" ",revw);
    }
}