// 0 ms | 46.5 MB
class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int l = m - 1;
        int r = 0;
        int count = 0;
        while(r < n && l >= 0){
            
            if(grid[l][r] < 0){
                count += n - r;
                l--;
            }
            else r++;

        }
        return count;
    }
}