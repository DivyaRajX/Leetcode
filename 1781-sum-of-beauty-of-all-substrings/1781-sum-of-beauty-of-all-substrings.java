class Solution {
    public int beautySum(String s) {
        
        int sum=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ele=s.charAt(j);
            if(mp.containsKey(ele)){
                int frq=mp.get(ele);
                mp.put(ele,frq+1);
            }
            else{
                mp.put(ele,1);
            }

            int min=Integer.MAX_VALUE;
            int max=0;
             for(int ele1:mp.values()){
                min=Math.min(min,ele1);
                max=Math.max(max,ele1);
            }
            sum+=(max-min);
           

            }
            
        } 
         return sum;
    }
   
}