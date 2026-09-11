class Solution {
    List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        List<String> pals = new ArrayList<>();
        backtrack(pals, s);
        return ans;

    }
    void backtrack(List<String> pals, String str){
        if(str.length() == 0){
            ans.add(new ArrayList<>(pals));
            return;
        }

        for(int i=0; i<str.length(); i++){
            String part = str.substring(0, i+1);
            if(isPal(part)){
                pals.add(part);
                backtrack(pals, str.substring(i+1));
                pals.remove(pals.size()-1);
            }
        }
    }

    boolean isPal(String str){
        StringBuilder s = new StringBuilder(str);
        return str.equals(s.reverse().toString());
    }
}