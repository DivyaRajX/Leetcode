class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int i: nums){
            int count = 0, temp = 0;
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    if(i/j == j){
                        count += 1;
                        temp += j;
                    }
                
                    else{
                        temp += i/j;
                        temp += j; 
                        count += 2;
                }
                // System.out.println(j);
                }
            }
            if(count == 4) ans+= temp;
        }return ans;
    }
}