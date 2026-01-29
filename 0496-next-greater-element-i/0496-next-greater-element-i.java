class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0; i<nums1.length; i++){
            int idx = 0;
            int temp = nums1[i];
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    idx = j;
                    break;
                } 
            }
            for(int k=idx; k<nums2.length; k++){
                if(nums1[i] < nums2[k]){
                    nums1[i] = nums2[k];
                    break;
                }
            }
            if(nums1[i] == temp) nums1[i] = -1;
 
        }return nums1;
    }
}