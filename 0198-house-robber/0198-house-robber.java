class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        if(nums.length == 1) return nums[0];
        return bu(nums);
    }

    int bu(int[] arr){
        int n = arr.length;
        arr[1] = Math.max(arr[0], arr[1]);
        for(int i=2; i<n; i++){
            arr[i] = Math.max(arr[i]+arr[i-2], arr[i-1]);
        }
        return arr[n-1]
;    }
}