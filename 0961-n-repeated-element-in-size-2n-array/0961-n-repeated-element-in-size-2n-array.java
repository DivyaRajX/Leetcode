class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            if(!hm.containsKey(i)){
                hm.put(i, 1);
            }
            else{
                hm.put(i, hm.get(i)+1);
            }
        }

        for(int i: hm.keySet()){
            if(hm.get(i) > 1) return i;
        }return -1;
    }
}