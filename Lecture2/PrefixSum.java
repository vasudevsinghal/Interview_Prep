package Lecture2;

public class PrefixSum {
    int[] arr;

    public PrefixSum(int[] nums) {
        
        for(int i = 1;  i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        
        arr = nums;
    }
    
    public int sumRange(int left, int right) {
       
        return arr[right] - (left == 0 ? 0 : arr[left-1]);
    }
}
