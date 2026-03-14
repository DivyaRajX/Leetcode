class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int n:nums){
            if(n%2==0 &&m.get(n)==1){
                return n;
            }
        }
        return -1;
    }
}