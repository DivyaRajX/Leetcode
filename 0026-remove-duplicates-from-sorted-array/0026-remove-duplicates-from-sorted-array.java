class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int i=0, j=1;
        int u=1;
        while(j<nums.length){
            if(nums[i] == nums[j]) j++;
            else{
                u++;
                swap(nums, i+1, j);
                j++;
                i++;
            }
        }return u;
    }

    void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}