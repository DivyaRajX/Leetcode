class Solution {
    Map<Integer, Integer> map;
    public int numDecodings(String s) {
        map = new HashMap<>();
        map.put(s.length(), 1);
        return dfs(0, s);
    }

    int dfs(int i, String s){
        if(map.containsKey(i)) return map.get(i);

        if(s.charAt(i) == '0') return 0;

        int res = dfs(i+1, s);
        if(i<s.length()-1)
        if(s.charAt(i) == '1' || s.charAt(i) =='2' && s.charAt(i+1) <= '6') res += dfs(i+2, s);
        map.put(i, res);
        return res;
    }
}