// 5 ms | 42.6 MB
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for(int i=0;i<n;i++){
            
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