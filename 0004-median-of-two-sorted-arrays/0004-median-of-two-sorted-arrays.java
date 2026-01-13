class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) ll.add(nums1[i]);
        for(int i=0; i<nums2.length; i++) ll.add(nums2[i]);

        Collections.sort(ll);
        int mid = ll.size()/2;
        if(ll.size()%2 == 0){
            double ans =  (double)(ll.get(mid-1)+ll.get(mid))/2;
            return ans;
        }
        return (long)ll.get(mid);
    }
}