class Solution {
    public boolean find132pattern(int[] nums) {
        int mn = nums[0];
        Stack<Integer> st = new Stack<>();
        int[] min = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            mn = Math.min(mn, nums[i]);
            min[i] = mn;
        }
        
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] > min[i]){
                while(!st.isEmpty() && min[i] >= st.peek()) st.pop();
                if(!st.isEmpty() && nums[i]>st.peek()) return true;
                st.push(nums[i]);
            }
        }
        return false;      
    }
}