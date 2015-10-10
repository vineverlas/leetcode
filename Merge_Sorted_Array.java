/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
*/

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums2==null || nums1==null){
            return;
        }else if(nums1.length==0 && nums2.length==0){
            return;
        }else if(nums2.length==0){
            return;
        }
        /*
        int i=0;
        int j=0;
        int p=0;
        int count1=0;
        int count2=0;
        
        for(i=0;i<n;i++){
            for(j=0;j<m+count2;j++){
                if(nums1[j]<=nums2[i]){
                    continue;
                }else{
                    if(count1==0){
                        p=j;
                        count1++;
                    }
                    int temp=nums1[j];
                    nums1[j]=nums2[i];
                    nums2[i]=temp;
                }
            }
            count1=0;
            nums1[m+count2]=nums2[count2];
            count2++;
        }
        */
        /*
        int i = m-1;
        int j = n-1;
        
        while(j>=0 && i>=0) {
                if(nums2[j] >= nums1[i]) {
                    nums1[i+j+1] = nums2[j];
                    j--;
                } else {
                    nums1[i+j+1] = nums1[i];
                    i--;
                }
        }
        
        while(j >= 0) {
            nums1[i+j+1] = nums2[j];
            j--;
        }
        */
        int i = m - 1;
	int j = n - 1;
	int k = m + n - 1;
 
	while (k >= 0) {
		if (j < 0 || (i >= 0 && nums1[i] > nums2[j]))
			nums1[k--] = nums1[i--];
		else
			nums1[k--] = nums2[j--];
	}
    }
    
}
