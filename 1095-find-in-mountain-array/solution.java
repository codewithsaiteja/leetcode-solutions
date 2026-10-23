// 0 ms | 45.4 MB
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeakElement(mountainArr, n);

        int ans = binarySearch(mountainArr, target, 0, peak, true);
        if (ans != -1) return ans;

        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    public int findPeakElement(MountainArray arr, int n) {
        int l = 0, r = n - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr.get(mid) > arr.get(mid + 1))
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }

    public int binarySearch(MountainArray arr, int target,
                            int l, int r, boolean ascending) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (ascending) {
                if (val < target) l = mid + 1;
                else r = mid - 1;
            } else {
                if (val > target) l = mid + 1;
                else r = mid - 1;
            }
        }

        return -1;
    }
}