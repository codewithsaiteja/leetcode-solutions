// 8 ms | 66.5 MB
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int j = 0;
        while(j < n){
            int ci = nums[j] - 1; // due to range is from 1 to n;
            if(nums[j] <= n && nums[j] != nums[ci]){
                int temp = nums[j];
                nums[j] = nums[ci];
                nums[ci] = temp;
            }
            else j++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }
}