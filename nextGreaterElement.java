class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
        for(int i=0; i< nums1.length; i++){
            output[i] = -1;
            for(int k=0; k<nums2.length; k++)
                if(nums1[i]==nums2[k])
                    for(int j=k; j<nums2.length; j++)
                        if(nums2[j]>nums1[i]){
                            output[i] = nums2[j];
                            break;
                        }            
        }
        
        return output;
    }
}