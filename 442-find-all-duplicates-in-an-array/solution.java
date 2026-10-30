// 25 ms | 64.8 MB
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i - 1]){
                res.add(nums[i]);
            }
        }
        return res;
    }
}