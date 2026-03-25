class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length) return nums;
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer> ls= new ArrayList<>(map.keySet());
        Collections.sort(ls, (a,b) -> map.get(b)-map.get(a));
        System.out.println(ls);
        int j = 0;
        while(j<k){
            arr[j] = ls.get(j);
            j++;
        }
        return arr;
    }
}