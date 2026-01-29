class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] re = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0; i<nums2.length; i++){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                map.put(st.pop(), nums2[i]);
            }st.push(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++){
            re[i] = map.getOrDefault(nums1[i], -1);
        }return re;
    }
}
