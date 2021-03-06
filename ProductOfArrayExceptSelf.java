/*
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
*/

/* The following commented code is solution for O(n) space 
public class Product_Of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        
        int len = nums.length;
        
        int[] result    = new int[len];
        int[] right     = new int[len];
        int[] left      = new int[len];
        
        if(len == 1) {
            return result;
        }
        
        right[0] = left[len-1] = 1;
        
        for(int i=1; i<len; i++) {
            right[i] = right[i-1] * nums[i-1];
            left[len-1-i] = left[len-i] * nums[len-i];
        }
        
        for(int i=0; i<len; i++) {
            result[i] = right[i] * left[i];
        }
        
        return result;
    }
}
*/

/* Code with O(1) space */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        
        int[] result = new int[nums.length];
        int left = 1;
        result[nums.length-1] = 1;
        
        for(int i=nums.length-2; i>=0; i--) {
            result[i] = result[i+1] * nums[i+1];
        }
        
        for(int i=0; i<nums.length; i++) {
            result[i] *= left;
            left *= nums[i];
        }
        
        return result;
    }
}
