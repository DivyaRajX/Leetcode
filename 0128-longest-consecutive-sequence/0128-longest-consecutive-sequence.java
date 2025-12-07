class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int l = 0;
        for(int i: nums) st.add(i);
        int c = 0;
        for(int i: st){
            if(!st.contains(i-1)){
                c = 1;
                int x = i;
                while(st.contains(x+1)){
                    c += 1;
                    x += 1;
                }
            }l = Math.max(l, c);
        }return l;
    }
}