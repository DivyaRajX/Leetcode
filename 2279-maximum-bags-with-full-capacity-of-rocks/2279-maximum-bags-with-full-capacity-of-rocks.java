class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        //Arrays.sort(rocks);
        int n = rocks.length; 
        int cnt = 0;
        int[][] greed = new int[n][2];
        for(int i=0; i<n; i++) greed[i] = new int[]{capacity[i]-rocks[i], i};
        Arrays.sort(greed, (a,b) ->{
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        // for(int[] a : greed) System.out.print(Arrays.toString(a)+" "); 
        // System.out.println();

        for(int i=0; i<n; i++){
            if(additionalRocks >= greed[i][0]){
                rocks[greed[i][1]] += greed[i][0];
                additionalRocks -= greed[i][0];
            }
            else break;
        }

        System.out.println(Arrays.toString(rocks));
        for(int i=0; i<n; i++) 
        cnt += rocks[i] == capacity[i] ? 1: 0;
        return cnt;
    }
}