// 1 ms | 44.4 MB
import java.util.Scanner;

class Solution {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)) count++;

        }
        return count;
        
    }
    public static boolean even(int num){
        int nof = digits(num);
        return nof % 2 == 0;
    }
    public static int digits(int num){
        // int count = 0;
        // if(num < 0) num =  num * -1;
        // if(num == 0) return 1;
        // while(num > 0){
        //     count++;
        //     num /= 10;
        // }
        // return count;
        return (int)(Math.log10(num)) + 1;
    }
}