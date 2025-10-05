class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1; i<n; i++){
            int k = n-i;
            if(isNonZero(i) && isNonZero(k)) return new int[] {i,k};
        }
        return new int[]{0,0};
    }
    private boolean isNonZero(int t){
        while(t > 0){
            if(t%10 == 0) return false;
            t = t/10;
        }return true;
    }
}