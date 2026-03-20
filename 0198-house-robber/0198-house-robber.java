class Solution {
    public int rob(int[] arr) {
        if(arr.length == 1) return arr[0];
        arr[1] = Math.max(arr[0], arr[1]);
        for(int i=2; i<arr.length; i++){
            arr[i] = Math.max((arr[i]+arr[i-2]), arr[i-1]);  
        }
        return arr[arr.length-1];
    }
}