class Solution {
    public long maxTotal(int[] value, int[] limit) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for(int i=0; i<limit.length; i++){
            if(!map.containsKey(limit[i])){
                ArrayList<Integer> ll = new ArrayList<>();
                ll.add(value[i]);
                map.put(limit[i], ll);
            }
            else map.get(limit[i]).add(value[i]);
        }

        for(int i : map.keySet()){
            ArrayList<Integer> ll = map.get(i);
            Collections.sort(ll, (a,b)->b-a);
        }
        long sum = 0;
        for(int i : map.keySet()){
            int count = 0;
            for(int j : map.get(i)){
                if(count < i){
                    sum += (long)j;
                    count++;
                }
            }
        }
        return sum;
    }
}