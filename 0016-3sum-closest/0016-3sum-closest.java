class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ans = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            int p1 = i;
            int l = i+1, r = n-1;
            while(l<r){
                int temp = nums[p1]+nums[l]+nums[r];
                if(Math.abs(target-temp) < Math.abs(target-ans)) ans = temp;
                if(temp == target) {
                    return target;
                }
                else if(temp < target) l++;
                else r--;
            }
        }
        return ans;

    }
}