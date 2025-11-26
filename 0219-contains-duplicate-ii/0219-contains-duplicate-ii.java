class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = containsHash(nums);
        return containsDup(map, k);
    }

    static HashMap<Integer, ArrayList<Integer>> containsHash(int[] arr){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], new ArrayList<>());
                map.get(arr[i]).add(i);
            }
            else map.get(arr[i]).add(i);
        }
        return map;
    }

    static boolean containsDup(HashMap<Integer, ArrayList<Integer>> map, int k){
        for(int i: map.keySet()){
            if(map.get(i).size() > 1){
                ArrayList<Integer> lst = map.get(i);
                for(int j=0; j<lst.size()-1; j++){
                    if(lst.get(j+1) - lst.get(j) <= k) return true;
                }
            }
        }return false;
    }
}