class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg = IntStream.of(gas).sum();
        int tc = IntStream.of(cost).sum();

        if(tg < tc) return -1;
        int to =0;
        int re =0;
        for(int i=0; i<gas.length; i++){
            to += gas[i]-cost[i];
            if(to < 0){
                to = 0;
                re = i+1;
            }
        }return re;
    }
}