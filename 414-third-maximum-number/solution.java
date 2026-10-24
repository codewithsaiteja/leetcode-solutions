// 7 ms | 44.7 MB
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = maxElement(nums);
        int count = 1;
        for(int i = n - 2;i>=0;i--){
            if(nums[i] != max){
                count++;
                max = nums[i];
            }
            if(count == 3) return max;
        }
        return maxElement(nums);

    }
    int maxElement(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }
}