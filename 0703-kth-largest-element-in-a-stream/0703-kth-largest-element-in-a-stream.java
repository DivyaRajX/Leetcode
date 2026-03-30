class KthLargest {
    public int klr;
    List<Integer> ls;
    public KthLargest(int k, int[] nums) {
        ls = new ArrayList<>();
        klr = k;
        for(int i : nums) ls.add(i);
    }
    
    public int add(int val) {
        ls.add(val);
        Collections.sort(ls);
        return ls.get(ls.size()-klr);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */