// 0 ms | 43.4 MB
// class Solution {
//     public int search(int[] nums, int target) {
//         int pivot = FindPivot(nums);
//         if(pivot == -1) return BinarySearch(nums,target,0,nums.length - 1);
//         if(nums[pivot] == target) return pivot;
//         if(target >= nums[0]) return BinarySearch(nums,target,0,pivot - 1);
//         return BinarySearch(nums,target,pivot + 1,nums.length - 1);
//     }

//     int BinarySearch(int[]nums,int target,int start,int end){
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(nums[mid] == target) return mid;
//             else if(nums[mid] > target) end = mid - 1;
//             else start = mid + 1;
//         }
//         return -1;

//     }
//     int FindPivot(int[]nums){
//         int n = nums.length;
//         int l = 0;
//         int r = n - 1;
//         while(l <= r){
//             int mid = l + (r - l) / 2;
//             if(mid < r && nums[mid] > nums[mid + 1]) return mid;
//             if(mid > l && nums[mid] < nums[mid - 1]) return mid;
//             if(nums[l] >= nums[mid]) r = mid - 1;
//             else l = mid + 1; 
//         }
//         return -1;
//     }
// }

class Solution {
    public int search(int[] nums, int target) {
        return BinarySearch(nums,target,0,nums.length - 1);
    }

    int BinarySearch(int[]nums,int target,int l,int r){
        if(l > r) return -1;
        int mid = l + (r - l) / 2;

        if(nums[mid] == target) return mid;

        // check left half arr is sorted
        if(nums[l] <= nums[mid]){
            if(target >= nums[l] && target < nums[mid]) return BinarySearch(nums,target,l,mid - 1);
            else return BinarySearch(nums,target,mid + 1,r);
        }
        else {
            if(target > nums[mid] && target <= nums[r]) return BinarySearch(nums,target,mid + 1,r);
            else return BinarySearch(nums,target,l,mid - 1);
        }

    }
}    