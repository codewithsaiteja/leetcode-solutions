// 14 ms | 45.8 MB
class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

       if(x == reverse) return true;
        return false;
    }
}
