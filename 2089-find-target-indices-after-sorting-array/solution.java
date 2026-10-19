// 5 ms | 46.2 MB
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        // create the array list
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] == target) res.add(i);

        }
        return res;
     
    }
}