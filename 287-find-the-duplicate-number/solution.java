// 5 ms | 82.5 MB
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        // for(int i=1;i<n;i++){
        //     if(nums[i] == nums[i - 1]){
        //         return nums[i];
        //     }
        // }
        // return -1;
        int i = 0;
        while(i < n){
            int ci = nums[i] - 1;
            if(nums[i] != nums[ci]){
                int temp = nums[i];
                nums[i] = nums[ci];
                nums[ci] = temp;
            }
            else{
                if(ci != i) return nums[i];
                i++;
            }
        }
        return -1;
    }
}