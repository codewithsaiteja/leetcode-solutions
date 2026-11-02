// 2 ms | 46.5 MB
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = nums.clone();
        int m = nums.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        for(int i=0;i < m + n;i++){
           if(i < n) merged[i] = nums[i];
            else merged[i] = nums2[i - m];
        }
        return merged;
    }
}