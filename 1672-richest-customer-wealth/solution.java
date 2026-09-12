// 0 ms | 44.5 MB
class Solution {
    public int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int rowSum = 0;
            for(int j=0;j < arr[i].length;j++){
                rowSum += arr[i][j];
            }
            if(rowSum > max) max = rowSum;
        }
        return max;

    }
}