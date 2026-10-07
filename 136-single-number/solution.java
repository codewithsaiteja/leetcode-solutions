// 227 ms | 46.8 MB
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        
        for(int i = 0; i < n;i++){
            boolean repeated = false;
            for(int j=0;j<n;j++){
                if(i != j && nums[i] == nums[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated) return nums[i];
        }
        return -1;
    }
}