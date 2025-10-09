class Solution {
    public int mySqrt(int x) {
        int i = 0, j = x;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(mid*mid == x) return mid;
            else if((long)mid*mid > (long)x) j = mid-1;
            else i = mid+1;
        }return i-1;
    }
}