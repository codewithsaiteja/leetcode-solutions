// N/A | N/A
class Solution {
    public int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int max = i;
            for(int j = i + 1;j<n;j++){
                if(arr[j] > arr[max]) max = j;
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        return arr[k - 1];
        
    }
}