// 1 ms | 44.9 MB
class Solution {
    public boolean search(int[] nums, int target) {
        return BinarySearch(nums,target,0,nums.length - 1);
        
    }
    boolean BinarySearch(int[] nums,int target,int l,int r){
        int mid = l + (r - l) / 2;
        if(l>r) return false;
        if(nums[mid] == target) return true;
        if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
            l++;
            r--;
            return BinarySearch(nums, target, l, r);
        }
        if(nums[mid] >= nums[l]){
            if(target >= nums[l] && target < nums[mid]) return BinarySearch(nums,target,l,mid - 1);
            else return BinarySearch(nums,target,mid + 1,r);
        }
        else {
            if(nums[mid] < target && target <= nums[r]) return BinarySearch(nums,target,mid + 1,r);
            else return BinarySearch(nums,target,l,mid - 1);
        }
    }
}