class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<bipartitePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {//vtx
            if (visited.containsKey(i)) continue;
            q.add(new bipartitePair(i, 0));
            while(!q.isEmpty()){
                //remove
                bipartitePair rp = q.poll();
                //ignore if already visited
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx) != rp.dis) return false;
                    continue;
                }
                //marked visited
                visited.put(rp.vtx, rp.dis);
                //self work
                //add unvisited nbrs
                for(int nbrs: graph[rp.vtx]){
                    if(!visited.containsKey(nbrs)) q.add(new bipartitePair(nbrs, rp.dis+1));
                }

            }
        }return true;

    }

class bipartitePair{
        int vtx;
        int dis;
        public bipartitePair(int vtx, int dis){
            this.vtx = vtx;
            this.dis = dis;
        }
    }
}