// 26 ms | 44.5 MB
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int[] expected = Sorting(heights.clone());
            if(heights[i] != expected[i]) count++;
                        
        }
        return count;
    }
    static int[] Sorting(int[] heights){
        int n = heights.length;
        for(int i = n - 1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(heights[j] > heights[j + 1]){
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        return heights;
    }
}