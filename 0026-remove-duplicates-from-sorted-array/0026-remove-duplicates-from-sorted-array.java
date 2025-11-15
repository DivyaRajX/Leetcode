class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1;
        int n=nums.length;
        int count = 0;

        while(i<n && j<n){
            if(nums[i] == nums[j]) j++;
            else{
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }return ++i;
    }
}