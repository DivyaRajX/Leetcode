class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = find(nums, target, true);
        int r = find(nums, target, false);
        return new int[]{l,r};
    }

    public static int find(int[] arr, int t, boolean c){
        int i=0, j=arr.length-1, idx = -1;
        while(i<=j){
            int m = i+(j-i)/2;
            if(arr[m] > t) j=m-1;
            else if(arr[m] < t) i=m+1;
            else{
                idx=m;
                if(!c) i = m+1;
                else j=m-1;
            }
        }return idx;
    }
}