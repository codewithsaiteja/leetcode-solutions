// 1 ms | 46.9 MB
class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        while(i < n){
            int correctIndex = nums[i];
            if(nums[i] < n && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else i++;
        }
        for(int index=0;index<n;index++){
            if(nums[index] != index) return index;
        }
        return n;
    }
}