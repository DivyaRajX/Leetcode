class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Long> st = new Stack<>();
        for(String str : tokens){
            if(!str.equals("+") && !str.equals("-") &&
                !str.equals("*") && !str.equals("/")) st.push(Long.parseLong(str));
            else{ 
                long f = st.pop();
                long s = st.pop(); 
                if (str.equals("+")) {
                    st.push(s + f);
                } else if (str.equals("-")) {
                    st.push(s - f);
                } else if (str.equals("*")) {
                    st.push(s * f);
                } else if (str.equals("/")) {
                    st.push(s / f);
                }
            }
        }
        long x = st.pop();
        return (int) x;
    }
}