class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i: nums) hs.add(i);
        int max = 0;
        for(int x: hs){
            int cnt=0;
            if(!hs.contains(x-1)){
                cnt = 1;
                while(hs.contains(x+1)){
                    cnt++;
                    x += 1;
                }
            } max = Math.max(cnt, max); 
        }return max;
    }
}