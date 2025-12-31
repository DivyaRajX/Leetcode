class Solution {
    static {
        for (int i = 0; i <= 500; i++) {
            removeOuterParentheses("");
        }
    }
    public static String removeOuterParentheses(String s) {
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