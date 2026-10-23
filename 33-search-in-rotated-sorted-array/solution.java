// 0 ms | 43.5 MB
class Solution {
    public int search(int[] nums, int target) {
        int pivot = FindPivot(nums);
        if(pivot == -1) return BinarySearch(nums,target,0,nums.length - 1);
        if(nums[pivot] == target) return pivot;
        if(target >= nums[0]) return BinarySearch(nums,target,0,pivot - 1);
        return BinarySearch(nums,target,pivot + 1,nums.length - 1);
    }

    int BinarySearch(int[]nums,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;

    }
    int FindPivot(int[]nums){
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(mid < r && nums[mid] > nums[mid + 1]) return mid;
            if(mid > l && nums[mid] < nums[mid - 1]) return mid;
            if(nums[l] >= nums[mid]) r = mid - 1;
            else l = mid + 1; 
        }
        return -1;
    }
}