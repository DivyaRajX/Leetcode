class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            if(arr[i]+1 != 10){
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }

        arr = new int[n+1];
        arr[0] = 1;
        return arr;

    }
}