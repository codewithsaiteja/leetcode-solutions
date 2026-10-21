// 2 ms | 43.1 MB
class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        for(int i= n- 1;i>=1;i--){
            
            for(int j = 0;j<i;j++){
                if(arr[j] > arr[j + 1]){
            
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}