class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] st = s.toCharArray();
            Arrays.sort(st);
            String t = new String(st);
            map.putIfAbsent(t, new ArrayList<>());
            map.get(t).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}