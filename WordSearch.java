//79. Word Search LeetCode 
class Solution {
    char[][] matrix;
    char[] letters;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) 
    {
       
        letters=word.toCharArray();
        matrix=board;
        for(int i=0;i<board.length;i++)
        {
           for(int j=0;j<board[i].length;j++)
           {
               if(board[i][j]==letters[0]){
                   visited=new boolean[board.length][board[0].length];
                  boolean ans= dfs(i,j,0);
                   if(ans==true)
                       return true;
                    }
            }
        }
        return false; 
    }
    
    public boolean dfs(int row,int col,int index)
    {
        //base cases
        if(index==letters.length) return true;
        if(row<0 || row>=matrix.length) return false;
        if(col<0 || col>=matrix[0].length) return false;
        if(visited[row][col]==true) return false;
        if(matrix[row][col]!=letters[index]) return false;
        visited[row][col]=true;
        
        // dfs in 4 directions
        boolean top=dfs(row-1,col,index+1);
        boolean down=dfs(row+1,col,index+1);
        boolean left=dfs(row,col-1,index+1);
        boolean right=dfs(row,col+1,index+1);
        boolean sol=top||down||left||right;
        if(sol==false)
            visited[row][col]=false;
        return sol;
        
        
    }
}
