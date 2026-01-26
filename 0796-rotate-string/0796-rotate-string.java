class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String db = s+s;
        if(db.contains(goal)) return true;
        return false;
    }
}