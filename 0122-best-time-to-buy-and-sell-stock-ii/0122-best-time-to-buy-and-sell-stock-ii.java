class Solution {
    public int maxProfit(int[] arr) {
        int st = arr[0];
        int mx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > st) mx += arr[i]-st;
            st = arr[i];
        }return mx;
    }
}