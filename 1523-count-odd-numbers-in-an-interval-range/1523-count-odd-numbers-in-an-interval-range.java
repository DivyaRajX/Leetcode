class Solution {
    public int countOdds(int low, int high) {
        int win = high-low+1;
        if(low%2==1 && high%2==1) return win/2+1;
        return win/2;
    }
}