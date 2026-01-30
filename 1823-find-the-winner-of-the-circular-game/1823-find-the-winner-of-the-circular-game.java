class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=1; i<=n; i++) ll.add(i);
        System.out.println(ll);

        int currIdx = 0;
        while(ll.size() > 1){
            int next = (currIdx+k-1)%ll.size();
            ll.remove(next);
            currIdx = next;
        }
        return ll.get(0);
    }
}