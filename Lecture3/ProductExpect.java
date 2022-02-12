package Lecture3;

// https://leetcode.com/problems/product-of-array-except-self/

public class ProductExpect {
    public int[] productExceptSelf(int[] nums) {
        int[] prePro = new int[nums.length];
        
        prePro[0] = 1;
        for(int i =1; i<nums.length; i++){
            prePro[i] = prePro[i-1]*nums[i-1];
        }
        
        int[] postPro = new int[nums.length];
        
        postPro[nums.length-1] = 1;
        for(int i = nums.length-2; i>=0; i--){
            postPro[i] = postPro[i+1]*nums[i+1];
        }
        
        
        int[] finalArr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            finalArr[i] = prePro[i]*postPro[i];
        }
        
        return finalArr;
    }
}
