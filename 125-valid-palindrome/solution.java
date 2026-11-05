// 18 ms | 47 MB
class Solution {
    public boolean isPalindrome(String s) {

        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder str = new StringBuilder(clean);
        str.reverse();
        return str.toString().equals(clean);
        
    }
}