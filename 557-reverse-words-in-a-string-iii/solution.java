// 6 ms | 46.3 MB
class Solution {
    public String reverseWords(String s) {
        String[] w = s.split(" ");
        int n = w.length;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            StringBuilder rev = new StringBuilder(w[i]);
            rev.reverse().toString();
            res.append(rev);
            if(i < n - 1) res.append(" ");
        }
        return res.toString();
    }
}