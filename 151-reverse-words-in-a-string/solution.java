// 6 ms | 43.8 MB
class Solution {
    public String reverseWords(String s) {
        
        // String[] w = s.trim().split("\\s+");
        // int n = w.length;

        // String[] revw = new String[n];
        // for(int i = 0;i<n;i++){
        //     revw[i] = w[n - i - 1];
        // }
        // return String.join(" ",revw);
        String[] words=s.split( "\s+");
    StringBuilder sb=new StringBuilder();
    for(int i=words.length-1;i>=0;i--)
    {
        sb.append(words[i]);
        sb.append(" ");
    }
    return sb.toString().trim();
  
    }
}