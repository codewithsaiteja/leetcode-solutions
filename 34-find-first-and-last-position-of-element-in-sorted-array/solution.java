// 0 ms | 47.8 MB
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb =  lowerbound(nums,target);
        if( lb == nums.length || nums[lb] != target) return new int[] {-1,-1};
        int ub = upperbound(nums,target);
        return new int[] {lb, ub - 1};
    }
    int lowerbound(int[] nums,int target){
        int l = 0;
        int n = nums.length;
        int r = n - 1;
        int ans = n;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] >= target){
                ans = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return ans;
    }

     int upperbound(int[] nums,int target){
        int l = 0;
        int n = nums.length;
        int r = n - 1;
        int ans = n;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > target){
                ans = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return ans;
    }
}