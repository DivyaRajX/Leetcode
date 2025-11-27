class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gs = IntStream.of(gas).sum();
        int cs = IntStream.of(cost). sum();

        if(gs < cs) return -1;
        int to = 0;
        int re = 0;
        for(int i=0; i<gas.length; i++){
            to += (gas[i]-cost[i]);
            if(to < 0){
                re = i+1;
                to = 0;
            }
        }return re;
    }
}