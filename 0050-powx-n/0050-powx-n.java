class Solution {
    public double myPow(double x, int n) {
        if(n<0) return 1.0/power(x, n);
        return power(x, n);
    }

    double power(double x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;

        if(n%2 == 0) return power(x*x, n/2);
        return x*power(x*x, n/2);
    }
}