class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return false;
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') return false;
                helper(st, ch);
            }
        }
        System.out.println(st);
        if(!st.isEmpty()) return false;
        return true;
    }

    static void helper(Stack<Character>st, char ch){
        // if(st.isEmpty()) st.push('1');
        if(ch == ')' && st.peek() == '(') st.pop();
        else if(ch == '}' && st.peek() == '{') st.pop();
        else if(ch == ']' && st.peek() == '[') st.pop();
    }
}