// 6 ms | 56.9 MB
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        // List<Integer> res = new ArrayList<>();
        // for(int i=1;i<n;i++){
        //     // if(nums[i] == nums[i - 1]){
        //     //     res.add(nums[i]);
        //     // }
            
        // }
        int j = 0;
        while(j < n){
            int ci = nums[j] - 1;
            if(nums[j] != nums[ci]){
                int temp = nums[j];
                nums[j] = nums[ci];
                nums[ci] = temp;
            }
            else j++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] != i + 1){
                res.add(nums[i]);
            }
        }
        return res;
    }
}