class Solution {
    public int findPeakElement(int[] nums) {
     int i=0, j=1;
    //  if(nums.length == 2){
    //     if(nums[0] > nums[1]) return 0;
    //     else return 1;
    //  }
     while(j<nums.length-1){
        if(nums[i]<nums[j]){
            int k = i+2;
            if(nums[j] > nums[k]) return j;
        }
        i++;
        j++;
    }
    if(nums[0] > nums[nums.length-1]) return 0;
    else return nums.length-1;
}
}