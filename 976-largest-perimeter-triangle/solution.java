// 12 ms | 47.2 MB
class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i = n - 1;i>1;--i){
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            if(a + b > c && b + c > a && a + c > b) return a + b + c;
        }
        return 0;
    }
}