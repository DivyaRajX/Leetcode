class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        boolean res = false;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0)){
                    res = search(i, j, board, word, vis, 0);
                    if(res) return true;
                }
            }
        }
        return false;
    }

    boolean search(int x, int y, char[][]board, String w, boolean[][] vis, int idx){
        if(x<0 || x>=board.length || y<0 || y>=board[0].length || vis[x][y] || board[x][y] != w.charAt(idx)) return false;

        if(idx == w.length()-1){
            return true;
        }

        vis[x][y] = true;
        if( search(x+1, y, board, w, vis, idx+1) || 
            search(x-1, y, board, w, vis, idx+1) || 
            search(x, y+1, board, w, vis, idx+1) || 
            search(x, y-1, board, w, vis, idx+1)) return true;
        
        vis[x][y] = false;
        return false;
        
    }
}