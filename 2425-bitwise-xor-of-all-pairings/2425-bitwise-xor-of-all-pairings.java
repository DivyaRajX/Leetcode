class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int xor1 = 0, xor2 = 0;
        if(n1%2 == 0 && n2%2 == 0)return 0;
        else if(n1%2==1 && n2%2==1){
            for(int i : nums1) xor1 ^= i;
            for(int j : nums2) xor2 ^= j;
            return xor1^xor2;
        }
        else{
            if(n1%2 == 1){
                for(int j : nums2) xor2 ^= j;
                return xor2;
            }
            else{
                for(int i : nums1) xor1 ^= i;
                return xor1;
            }
        } 
        
    }
}