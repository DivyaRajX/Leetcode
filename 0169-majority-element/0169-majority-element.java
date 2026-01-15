class Solution {
    public int majorityElement(int[] nums) {
        int x=nums[0], cnt=0;
        for(int i: nums){
            if(i == x) cnt++;
            else if(i != x) cnt--;
            if(cnt <= 0) {
                x = i;
                cnt++;
            }
        }return x;
    }
}