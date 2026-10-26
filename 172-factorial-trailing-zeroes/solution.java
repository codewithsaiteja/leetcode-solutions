// 1 ms | 42.1 MB
class Solution {
    public int trailingZeroes(int n) {
        int c = 0;
        while( n != 0){
            int z = n / 5;
            c += z;
            n = z;
        }
        return c;
    }
}