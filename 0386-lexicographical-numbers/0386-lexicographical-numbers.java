import java.util.*;
class Solution {
    public List<Integer> lexicalOrder(int n) {
       List<Integer> ll = new ArrayList<>();
		print(n,0,ll);
        List<Integer> sl = ll.subList(1,ll.size());
		return sl;
    }
     public static void print(int n, int curr, List<Integer> ll) {
		// -ve recursive call
		// Remember : Always put recursive function at the top
		if(curr > n)
			return;
		ll.add(curr);
		int i = 0;
		if(curr == 0)
			i = 1;
		
		for(; i<=9; i++) {
			print(n, curr*10+i,ll);
		}
	}
}