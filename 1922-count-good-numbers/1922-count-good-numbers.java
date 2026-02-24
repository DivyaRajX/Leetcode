class Solution {
    int mod = 1000000007;
    public int countGoodNumbers(long n) {
        return (int)((helper(4, n/2)*helper(5, (n+1)/2))%mod);
    }

    long helper(long x, long y){
        long ret = 1;
        long mul = x;

        while(y>0){
            if(y%2 == 1) ret = (ret*mul)%mod;
            mul = (mul*mul)%mod;
            y /= 2;
        }
        return ret;
    }
}