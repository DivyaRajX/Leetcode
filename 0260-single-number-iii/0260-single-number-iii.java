class Solution {
    public int[] singleNumber(int[] arr) {
        int x = arr[0];
        for(int i=1; i<arr.length; i++) x^=arr[i];
        int mask = x&(-1*x); // x&(~(x-1))
        int a = 0;
        for(int i: arr){
            if((mask & i) != 0) a=a^i;
        }
        int b = x^a;
        return new int[] {a, b};
    }
}