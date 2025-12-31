class Solution {
    public String removeOuterParentheses(String s) {
        int level = 0;
        StringBuilder op = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(level>0) op.append(ch);
                level++;
            }
            else{
                level--;
                if(level>0) op.append(ch);
            }
        }return op.toString();
    }
}